/**
 *
 */
package com.qiuq.inventory.repository.system;

import org.springframework.data.repository.CrudRepository;

import com.qiuq.inventory.bean.system.UserGroup;

/**
 * @author qiushaohua 2012-9-9
 * @version 0.0.1
 * 
 */
public interface UserGroupRepo extends CrudRepository<UserGroup, Integer> {
}
