require([
        "../../js/jquery", "../../js/widget/TableSort"
], function($, TableSort) {

    function Employer() {

    }

    Employer.prototype = {
        initDatatableSort : function() {
            $(".ui-datatable").tablesort(sort.jq);
        }

    };
    
    if (!window.pagejs) {
        window.pagejs = function() {
        };
    }
    // add a new object to window.
    window.pagejs.employer = new Employer();
    
    //
    window.pagejs.employer.initDatatableSort();

    return Employer;

});