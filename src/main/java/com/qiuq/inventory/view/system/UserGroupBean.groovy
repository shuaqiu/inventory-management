/**
 *
 */
package com.qiuq.inventory.view.system

import javax.faces.event.ActionEvent

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import com.qiuq.inventory.bean.system.UserGroup
import com.qiuq.inventory.repository.system.UserGroupRepo

/**
 * @author qiushaohua 2012-9-8
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class UserGroupBean {

    final Log log = LogFactory.getLog(UserGroupBean);

    static List<UserGroup> userGroups;

    UserGroup userGroup = new UserGroup();

    @Autowired
    UserGroupRepo userGroupRepo;

    String save(ActionEvent event){
        log.info("want to save ${userGroup.id}-->${userGroup.name}");

        // save or update to database
        UserGroup newUserGroup = userGroupRepo.save(userGroup);

        // save or update to local list
        int index = userGroups.indexOf(newUserGroup);
        if(index == -1){
            userGroups.add(newUserGroup);
        }else{
            UserGroup oldUserGroup = userGroups.get(index);
            oldUserGroup.name = newUserGroup.name;
        }
        return null;
    }

    String delete(ActionEvent event){
        log.info("want to delete ${userGroup.id}");

        // remove from the database
        userGroupRepo.delete(userGroup.id);
        // remove from the local list
        userGroups.remove(userGroup);

        return null;
    }

    List<UserGroup> getUserGroups(){
        if(userGroups == null){
            userGroups = userGroupRepo.findAll();
        }
        return userGroups;
    }
}
