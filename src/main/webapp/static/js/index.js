require(
		[ "./jquery", "./widget/layout/TabContainer",
				"./widget/layout/TabShowStrategy" ],
		function($, TabContainer, TabShowStrategy) {

			function domReady() {
				var $body = $(document.body);

				var $navTabs = $(".nav-tabs");
				var $tabContents = $(".tab-content");
				var tabContainer = new TabContainer($navTabs, $tabContents);

				var tabTarget = "[data-toggle='tab'], [data-toggle='pill']";
				$body.find(tabTarget).first().click();

				var removableTarget = "[data-toggle='tab'] .icon-remove, [data-toggle='pill'] .icon-remove";
				$body.on("click.tab.data-api", removableTarget, function(e) {
					var $tab = $(this).parent("a");
					tabContainer.removeTab($tab);
					return false;
				});

				$body.on("click.tab.data-api", ".ui-menuitem-link",
						function(e) {
							e.preventDefault();

							var $this = $(this);
							var title = $this.find("span.ui-menuitem-text")
									.text();
							var url = $this.attr("href");

							var $tab = tabContainer.addTab({
								title : title,
								url : url,
								closable : true
							});
							tabContainer.showTab($tab);

							return false;
						});

				var tabShowStrategy = new TabShowStrategy($navTabs,
						TabShowStrategy.STRATEGY_RECENTLY);
				$body.on("remove", tabTarget, function() {
					tabShowStrategy.tabClosed($(this));
				});
			}

			$(document).ready(domReady);
		});