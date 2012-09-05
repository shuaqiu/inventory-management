/**
 * @author qiushaohua 2012-6-24
 */
package com.qiuq.inventory.view;

import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author qiushaohua 2012-6-24
 * @version 0.0.1
 */
@Component
@Scope("session")
public class GuestPreferences {
    private String theme = null;// "aristo"; // default

    public String getTheme() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        if (params.containsKey("theme")) {
            theme = params.get("theme");
        } else {
            Map<String, Object> cookies = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
            Object cookie = cookies.get("theme");
            if (cookie != null) {
                theme = (String) new BeanWrapperImpl(cookie).getPropertyValue("value");
            }
        }
        if (theme == null) {
            theme = "bootstrap";
        }

        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;

        Map<String, Object> prop = new HashMap<String, Object>();
        prop.put("maxAge", 7 * 24 * 60 * 60 * 1000);
        prop.put("secure", true);
        FacesContext.getCurrentInstance().getExternalContext().addResponseCookie("theme", theme, prop);
    }
}
