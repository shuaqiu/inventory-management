require(
        [
                "./jquery",
                "./widget/layout/TabContainer",
                "./widget/layout/TabShowStrategy"
        ],
        function($, TabContainer, TabShowStrategy) {

            function domReady() {
                var $body = $(document.body);

                var $navTabs = $(".nav-tabs");
                var $tabContents = $(".tab-content");
                var tabContainer = new TabContainer($navTabs, $tabContents);

                // make the tab which has remove icon removable.
                var removableTarget = "[data-toggle='tab'] .icon-remove, [data-toggle='pill'] .icon-remove";
                $body.on("click", removableTarget, function(e) {
                    var $tab = $(this).parent("a");
                    tabContainer.removeTab($tab);
                    return false;
                });

                // make the menu can add a new tab or active exist tab.
                $body.on("click", ".ui-menuitem-link", function(e) {
                    // prevent default first
                    e.preventDefault();

                    var $this = $(this);

                    var $tab = tabContainer.addTab({
                        title : $this.find("span.ui-menuitem-text").text(),
                        url : $this.attr("href"),
                        closable : true
                    });
                    tabContainer.showTab($tab);

                    return false;
                });

                var tabTarget = "[data-toggle='tab'], [data-toggle='pill']";

                // set the tab show strategy when the active tab closed.
                var tabShowStrategy = new TabShowStrategy($navTabs,
                        TabShowStrategy.STRATEGY_RECENTLY);
                $body.on("remove", tabTarget, function() {
                    tabShowStrategy.tabClosed($(this));
                });

                // show the first tab.
                $body.find(tabTarget).first().click();
            }

            $(document).ready(domReady);
        });