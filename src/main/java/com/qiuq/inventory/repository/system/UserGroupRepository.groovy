/**
 *
 */
package com.qiuq.inventory.repository.system

import org.springframework.stereotype.Repository

import com.qiuq.inventory.bean.system.UserGroup
import com.qiuq.inventory.repository.CommonRepository


/**
 * @author qiushaohua 2012-9-8
 * @version 0.0.1
 *
 */
@Repository
class UserGroupRepository extends CommonRepository{

    List<UserGroup> getUserGroups(){
        return entityManager.createNamedQuery("loadUserGroup", UserGroup).getResultList();
    }
}
