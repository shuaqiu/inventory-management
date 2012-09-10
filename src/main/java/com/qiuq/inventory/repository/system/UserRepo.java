/**
 * 
 */
package com.qiuq.inventory.repository.system;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.qiuq.inventory.bean.system.User;

/**
 * @author qiushaohua 2012-9-9
 * @version 0.0.1
 * 
 */
public interface UserRepo extends CrudRepository<User, Integer> {

    List<User> findAllByUsername(String username);
}
