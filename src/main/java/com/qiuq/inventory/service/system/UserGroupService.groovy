/**
 *
 */
package com.qiuq.inventory.service.system

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.qiuq.inventory.bean.system.UserGroup
import com.qiuq.inventory.repository.system.UserGroupRepository

/**
 * @author qiushaohua 2012-9-8
 * @version 0.0.1
 *
 */
@Service
class UserGroupService {

    @Autowired
    UserGroupRepository userGroupRepository;

    @Transactional(readOnly = true)
    List<UserGroup> getUserGroups(){
        return userGroupRepository.getUserGroups();
    }
}
