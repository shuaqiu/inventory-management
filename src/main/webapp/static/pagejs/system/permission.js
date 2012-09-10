require([], function() {
    function Permission() {
    }

    Permission.prototype = {
        createUserGroup : function() {
            this.updateUserDialogFieldValue(0, "");
            userGroupDialog.show();
        },

        getSelectedUserGroup : function() {
            return userGroups.options.filter(":selected");
        },

        modifyUserGroup : function() {
            var selectedUserGroup = this.getSelectedUserGroup();
            if (selectedUserGroup.length == 0) {
                return;
            }
            this.updateUserDialogFieldValue(selectedUserGroup.val(),
                    selectedUserGroup.text());
            userGroupDialog.show();
        },

        updateUserDialogFieldValue : function(id, name) {
            userGroupDialog.cfg.onShow = function() {
                userGroupId.jq.val(id);
                userGroupName.jq.val(name);
            };
        },

        removeUserGroup : function() {
            var selectedUserGroup = this.getSelectedUserGroup();
            if (selectedUserGroup.length == 0) {
                return;
            }
        }
    };

    if (!window.pagejs) {
        window.pagejs = function() {
        };
    }
    window.pagejs.permission = new Permission();
    return Permission;
});