require([], function() {
    function Permission() {
    }

    Permission.prototype = {
        /**
         * show the user group edit dialog when click the new user group button
         * init the field value to 0(id) and empty string(name)
         */
        createUserGroup : function() {
            this.updateUserGroupDialogFieldValue(0, "");
            userGroupDialog.show();
        },

        /**
         * get current selected user group
         * 
         * @returns a jquery object for the selected option in select control.
         */
        getSelectedUserGroup : function() {
            return userGroups.options.filter(":selected");
        },

        /**
         * show the user group edit dialog when click the edit user group button
         * init the field value to selected user group value
         */
        modifyUserGroup : function() {
            var selectedUserGroup = this.getSelectedUserGroup();
            if (selectedUserGroup.length == 0) {
                return;
            }
            this.updateUserGroupDialogFieldValue(selectedUserGroup.val(),
                    selectedUserGroup.text());
            userGroupDialog.show();
        },

        /**
         * the method to update the field value in the user group edit dialog.
         */
        updateUserGroupDialogFieldValue : function(id, name) {
            userGroupDialog.cfg.onShow = function() {
                userGroupId.jq.val(id);
                userGroupName.jq.val(name);
            };
        },

        /**
         * delete the selected user group. show a confirm dialog to make sure
         * user action is correct.
         */
        deleteUserGroup : function() {
            var selectedUserGroup = this.getSelectedUserGroup();
            if (selectedUserGroup.length == 0) {
                return false;
            }
            userGroupDeletionConfirm.cfg.onShow = function() {
                toDeleteUserGroupId.jq.val(selectedUserGroup.val());
            };
            userGroupDeletionConfirm.show();
        },

        /**
         * hide the user group edit dialog when the inputed data is saved.
         * 
         * @param xhr
         * @param status
         * @param args
         */
        hideUserGroupDialogWhenSaved : function(xhr, status, args) {
            if (!args.validationFailed) {
                userGroupDialog.hide();
            }
        },

        /**
         * just hide the user group edit dialog.
         */
        hideUserGroupDialog : function() {
            userGroupDialog.hide();
        },

        /**
         * show the user group edit dialog when click the new user group button
         * init the field value to 0(id) and empty string(name)
         */
        createUser : function() {
            // this.updateUserDialogFieldValue(0, "");
            userDialog.show();
        },

        /**
         * hide the user group edit dialog when the inputed data is saved.
         * 
         * @param xhr
         * @param status
         * @param args
         */
        hideUserDialogWhenSaved : function(xhr, status, args) {
            if (!args.validationFailed) {
                userDialog.hide();
            }
        },

        /**
         * just hide the user group edit dialog.
         */
        hideUserDialog : function() {
            userDialog.hide();
        },
    };

    if (!window.pagejs) {
        window.pagejs = function() {
        };
    }
    // add a new object to window.
    window.pagejs.permission = new Permission();

    return Permission;
});