(function($) {
	var Tab = $.fn.tab.Constructor;

	Tab.prototype.remove = function() {
		var $this = this.element;
		var selector = $this.attr('data-target');

		if (!selector) {
			selector = $this.attr('href');
			// strip for ie7
			selector = selector && selector.replace(/.*(?=#[^\s]*$)/, '');
		}

		var $target = $(selector);

		var e = $.Event('remove', {
			relatedTarget : $target.get()
		});

		$this.trigger(e);

		$this.closest("li").remove();
		$target.remove();
	};

	function addTab(data, $tabContainer, $contentContainer, callback) {
		var title = data.title || "";
		var id = hashCode(title) || parseInt(Math.random() * 10000);
		var url = data.url || "";
		var closable = data.closable || false;

		var $existTab = $("#tab" + id);
		if ($existTab.length > 0) {
			return $existTab;
		}

		var tab = "<li><a data-toggle='tab' id='tab" + id + "' href='#" + id
				+ "'>" + title
				+ (closable ? "<span class='icon-remove'></span>" : "")
				+ "</a></li>";
		var content = "<div class='tab-pane' id='" + id + "'>"
				+ "<iframe class='content-frame' src='" + url + "'></iframe>"
				+ "</div>";
		var $tab = $(tab).appendTo($tabContainer);
		$contentContainer.append(content);

		callback && callback();

		return $tab.find("a");
	}

	var tabShowStrategy = {
		strategy : "first",

		setTabContainer : function($tabContainer) {
			this.$tabContainer = $tabContainer;
		},

		setStrategy : function(strategy) {
			this.strategy = strategy;
		},

		tabClosed : function($tab) {
			if ($tab.closest("li").hasClass("active")) {
				this.getToActiveTab($tab).tab("show");
			}
		},

		getToActiveTab : function($tab) {
			switch (this.strategy) {
			case "first":
				return this.getFirstTab($tab);
			case "last":
				return this.getLastTab($tab);
			case "recently":
				return this.getRecentlyAccessedTab($tab);
			}
			return this.firstTabStrategy($tab);
		},

		getFirstTab : function($tab) {
			return this.$tabContainer.find("li:first").find("a");
		},

		getLastTab : function($tab) {
			var $tabs = this.$tabContainer.find("[data-toggle='tab'], [data-toggle='pill']");
			var index = $tabs.index($tab);
			if(index == $tabs.length - 1){
				if($tabs.length >= 2){
					return $tabs.eq($tabs.length - 2);
				}
				return $();
			}
			return $tabs.last();
		},

		getRecentlyAccessedTab : function($tab) {
			return 0;
		}
	};

	function domReady() {
		var $body = $("body");

		var target = "[data-toggle='tab'] .icon-remove, [data-toggle='pill'] .icon-remove";
		$body.on("click.tab.data-api", target, function(e) {
			$(this).parent("a").tab('remove');
			return false;
		});

		var $tabContainer = $(".nav-tabs");
		var $contentContainer = $(".tab-content");
		$body.on("click.tab.data-api", ".ui-menuitem-link", function(e) {
			var $this = $(this);
			var title = $this.find("span.ui-menuitem-text").text();
			var url = $this.attr("href");
			var $newTab = addTab({
				title : title,
				url : url,
				closable : true
			}, $tabContainer, $contentContainer);

			$newTab.tab("show");

			return false;
		});

		tabShowStrategy.setTabContainer($tabContainer);
		tabShowStrategy.setStrategy("last");
		$body.on("remove", "[data-toggle='tab'], [data-toggle='pill']",
				function() {
					tabShowStrategy.tabClosed($(this));
				});
	}

	$(document).ready(domReady);
})(window.jQuery);

/**
 * get the hash code of String, implemented as the hashCode() method of String
 * in Java
 * 
 * @param str
 * @returns {Number}
 */
function hashCode(str) {
	if (!str) {
		return 0;
	}

	var hash = 0;
	for ( var i = 0; i < str.length; i++) {
		hash = 31 * hash + str.charCodeAt(i);
	}
	return hash;
}
