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

import com.qiuq.inventory.bean.system.User
import com.qiuq.inventory.repository.system.UserRepo

/**
 * @author qiushaohua 2012-9-11
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class UserBean {

    final Log log = LogFactory.getLog(UserBean);

    static List<User> users;

    User user = new User();

    @Autowired
    UserRepo userRepo;

    String save(ActionEvent event){
        log.info("want to save ${user.id}-->${user.name}");

        // save or update to database
        User newUser = userRepo.save(user);

        // save or update to local list
        int index = users.indexOf(newUser);
        if(index == -1){
            users.add(newUser);
        }else{
            User oldUser = users.get(index);
            oldUser.username = newUser.username;
        }
        return null;
    }

    String delete(ActionEvent event){
        log.info("want to delete ${user.id}");

        // remove from the database
        userRepo.delete(user.id);
        // remove from the local list
        users.remove(user);

        return null;
    }

    List<User> getUsers(){
        if(users == null){
            users = userRepo.findAll();
        }
        return users;
    }
}
