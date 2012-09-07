/**
 *
 */
package com.qiuq.inventory.view.system

import javax.annotation.PostConstruct

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import com.qiuq.inventory.bean.system.UserGroup
import com.qiuq.inventory.service.system.UserGroupService

/**
 * @author qiushaohua 2012-9-8
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class UserGroupBean {

    int selectedGroupId;

    List<UserGroup> userGroups;

    @Autowired
    UserGroupService userGroupService;

    @PostConstruct
    void init(){
        userGroups = userGroupService.getUserGroups();
    }
}
