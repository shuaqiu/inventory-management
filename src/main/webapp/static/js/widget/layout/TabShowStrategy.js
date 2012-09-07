define([ "../../jquery" ], function($) {
	function TabShowStrategy($navTabs, strategy) {
		this.$navTabs = $navTabs;
		this.setStrategy(strategy);
	}

	TabShowStrategy.STRATEGY_FIRST = 1;
	TabShowStrategy.STRATEGY_LAST = 2;
	TabShowStrategy.STRATEGY_RECENTLY = 3;

	TabShowStrategy.TAB_SELECTOR = "[data-toggle='tab'], [data-toggle='pill']";

	TabShowStrategy.prototype = {
		setStrategy : function(strategy) {
			this.strategy = strategy || TabShowStrategy.STRATEGY_RECENTLY;
			if (this.strategy < TabShowStrategy.STRATEGY_FIRST
					|| this.strategy > TabShowStrategy.STRATEGY_RECENTLY) {
				this.strategy = TabShowStrategy.STRATEGY_RECENTLY;
			}

			if (this.strategy == TabShowStrategy.STRATEGY_RECENTLY) {
				this.initRecentlyRecorder();
			}
		},

		tabClosed : function($tab) {
			if ($tab.closest("li").hasClass("active")) {
				this.getToActiveTab($tab).tab("show");
			}
		},

		getToActiveTab : function($tab) {
			switch (this.strategy) {
			case TabShowStrategy.STRATEGY_LAST:
				return this.getFirstTab($tab);
			case TabShowStrategy.STRATEGY_LAST:
				return this.getLastTab($tab);
			case TabShowStrategy.STRATEGY_RECENTLY:
				return this.getRecentlyAccessedTab($tab);
			}
			return $();
		},

		getFirstTab : function($tab) {
			return this.$navTabs.find("li:first").find("a");
		},

		getLastTab : function($tab) {
			var $tabs = this.$navTabs.find(TabShowStrategy.TAB_SELECTOR);
			var index = $tabs.index($tab);
			if (index == $tabs.length - 1) {
				if ($tabs.length >= 2) {
					return $tabs.eq($tabs.length - 2);
				}
				return $();
			}
			return $tabs.last();
		},

		getRecentlyAccessedTab : function($tab) {
			var toShowTab = this.access.pop();
			if (toShowTab) {
				return $("#" + toShowTab);
			}
			return $();
		},

		initRecentlyRecorder : function() {
			this.access = [];
			var self = this;
			var $body = $(document.body);
			$body.on("shown", TabShowStrategy.TAB_SELECTOR, function() {
				self.access.push(this.id);
			});
			$body.on("remove", TabShowStrategy.TAB_SELECTOR, function() {
				for ( var i = self.access.length - 1; i >= 0; i--) {
					if (self.access[i] == this.id) {
						self.access.splice(i, 1);
					}
				}
			});
		}
	};

	return TabShowStrategy;
});