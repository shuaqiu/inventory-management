define([
    "../jquery"
], function($) {

    var style = {
        icon : "ui-sortable-column-icon",
        activeTh : "ui-state-active",
        ascIcon : "ui-icon-triangle-1-n",
        descIcon : "ui-icon-triangle-1-s",
        arrowIcon : "ui-icon-triangle-1-n ui-icon-triangle-1-s"
    };

    function isSortable() {
        var $icon = $(this).find("." + style.icon);
        return $icon.length > 0;
    }

    function initCurrentSortIcon($th, $sortInput) {
        var sort = $sortInput.val().split(",");
        if (sort.length == 0) {
            return;
        }

        var field = sort[0], direct = sort[1];

        var $sortTh = $th.find("[data-field='" + field + "']").closest("th");
        var $icon = $sortTh.find("." + style.icon);

        $sortTh.addClass(style.activeTh);
        if (direct == "asc") {
            $icon.addClass(style.ascIcon);
        } else {
            $icon.addClass(style.descIcon);
        }
    }

    function toggleIcon($clickedTh, $th) {
        var $icon = $clickedTh.find("." + style.icon);

        if ($clickedTh.hasClass(style.activeTh)) {
            $icon.toggleClass(style.arrowIcon);
        } else {
            var $preSortTh = $th.filter("." + style.activeTh);
            $preSortTh.removeClass(style.activeTh);
            $preSortTh.find("." + style.icon).removeClass(style.arrowIcon);

            $clickedTh.addClass(style.activeTh);
            $icon.addClass(style.ascIcon);
        }
    }

    function doSort($clickedTh, $sortInput) {
        var $field = $clickedTh.find("[data-field]");
        var $icon = $clickedTh.find("." + style.icon);

        var field = $field.attr("data-field");
        var direct = $icon.hasClass(style.ascIcon) ? "asc" : "desc";

        $sortInput.val(field + "," + direct);
        $sortInput.change();
    }

    function tablesort($datatable, $sortInput) {
        var $th = $datatable.find(".ui-widget-header").find("th").filter(
                isSortable);

        $th.addClass("ui-sortable-column");
        initCurrentSortIcon($th, $sortInput);

        $th.on("click.tablesort", function() {
            var $this = $(this);

            toggleIcon($this, $th);
            doSort($this, $sortInput);
        });
    }

    $.fn.tablesort = function(sortInputSelector) {
        tablesort(this, $(sortInputSelector));
    };

    return {
        tablesort : tablesort
    };
});