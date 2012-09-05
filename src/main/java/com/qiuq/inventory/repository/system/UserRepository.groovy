/**
 *
 */
package com.qiuq.inventory.repository.system

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

import org.springframework.stereotype.Repository

import com.qiuq.inventory.bean.system.User

/**
 * @author qiushaohua 2012-9-2
 * @version 0.0.1
 *
 */
@Repository
class UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    List<User> loadUsersByUsername(String username){
        List<User> users = entityManager.createNamedQuery("loadUsersByUsername", User.class).setParameter("username", username).getResultList()
        return users;
    }
}
