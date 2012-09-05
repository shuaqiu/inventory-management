package com.qiuq.inventory.view.system

import javax.faces.context.ExternalContext
import javax.faces.context.FacesContext

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import com.qiuq.inventory.service.system.UserService

/**
 * @author qiushaohua 2012-9-1
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class LoginBean {

    final Log log = LogFactory.getLog(LoginBean.class);

    String username;

    String password;

    String doLogin(){
        //        FacesContext context = FacesContext.getCurrentInstance();
        //
        //        User user = userService.login(username, password)
        //        if(user == null){
        //            context.addMessage(null, new FacesMessage("用户名或密码不正确"));
        //            return "login";
        //        }
        //
        //        log.info("用户 --> ${username} 登录成功");
        //        ExternalContext externalContext = context.getExternalContext();
        //        Map<String, Object> sessionMap = externalContext.getSessionMap();
        //        sessionMap.put("loginUser", user);
        //
        //        return "index";

        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();

        externalContext.dispatch("/j_spring_security_check");
        // externalContext.getRequest().getRequestDispatcher("/j_spring_security_check").forward(externalContext.getRequest(), externalContext.getResponse());

        context.responseComplete();
        // It's OK to return null here because Faces is just going to exit.
        return null;
    }
}
