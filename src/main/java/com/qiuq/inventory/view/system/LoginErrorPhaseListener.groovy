package com.qiuq.inventory.view.system

import javax.faces.application.FacesMessage
import javax.faces.context.ExternalContext
import javax.faces.context.FacesContext
import javax.faces.event.PhaseEvent
import javax.faces.event.PhaseId
import javax.faces.event.PhaseListener

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.web.WebAttributes
import org.springframework.security.web.authentication.session.SessionAuthenticationException

/**
 * @author qiushaohua 2012-9-2
 * @version 0.0.1
 *
 */
class LoginErrorPhaseListener implements PhaseListener {
    static final long serialVersionUID = 1L;

    final Log log = LogFactory.getLog(LoginErrorPhaseListener.class);

    @Override
    void beforePhase(final PhaseEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();

        Map<String, Object> sessionMap = externalContext.getSessionMap();
        Exception e = (Exception) sessionMap.get(WebAttributes.AUTHENTICATION_EXCEPTION);
        if(e == null){
            return;
        }

        log.debug(e.getMessage(), e);

        if (e instanceof BadCredentialsException || e instanceof UsernameNotFoundException) {
            sessionMap.put(WebAttributes.AUTHENTICATION_EXCEPTION, null);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "用户名或密码不正确", null));
        }else if(e instanceof SessionAuthenticationException){
            sessionMap.put(WebAttributes.AUTHENTICATION_EXCEPTION, null);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "用户超过最大登录限制", null));
        }
    }

    @Override
    void afterPhase(final PhaseEvent event) {
    }

    @Override
    PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }
}