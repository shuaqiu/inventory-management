define(
		[ "../../jquery", "../../base/string" ],
		function($, string) {
			var Tab = $.fn.tab.Constructor;
			Tab.prototype.remove = function() {
				var $this = this.element;
				var selector = $this.attr('data-target');

				if (!selector) {
					selector = $this.attr('href');
					// strip for ie7
					selector = selector
							&& selector.replace(/.*(?=#[^\s]*$)/, '');
				}

				var $target = $(selector);

				var e = $.Event('remove', {
					relatedTarget : $target.get()
				});

				$this.trigger(e);

				$this.closest("li").remove();
				$target.remove();
			};

			function TabContainer($navTabs, $tabContents) {
				this.$navTabs = $navTabs;
				this.$tabContents = $tabContents;
			}

			TabContainer.TAB = "<li><a data-toggle='tab' id='tab${id}' href='#${id}'>${title}${icon}</a></li>";
			TabContainer.CONTENT = "<div class='tab-pane' id='${id}'>"
					+ "<iframe class='content-frame' src='${url}'></iframe>"
					+ "</div>";

			TabContainer.prototype.addTab = function(config, callback) {
				config = $.extend({
					title : "",
					url : "",
					closable : false
				}, config);
				config.id = string.hashCode(config.title);
				config.icon = config.closable ? "<span class='icon-remove'></span>"
						: "";

				var $tab = $("#tab" + config.id);
				if ($tab.length == 0) {
					var $li = $(string.substitute(TabContainer.TAB, config));
					this.$navTabs.append($li);
					this.$tabContents.append(string.substitute(
							TabContainer.CONTENT, config));

					$tab = $li.find("a");
				}

				callback && callback($tab);
				return $tab;
			};

			TabContainer.prototype.showTab = function($tab) {
				$tab.tab("show");
			};

			TabContainer.prototype.removeTab = function($tab) {
				$tab.tab("remove");
			};

			return TabContainer;
		});