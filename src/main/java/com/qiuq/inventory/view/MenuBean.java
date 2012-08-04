/**
 * @author qiushaohua 2012-6-23
 */
package com.qiuq.inventory.view;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.qiuq.inventory.service.MenuService;

/**
 * @author qiushaohua 2012-6-23
 * @version 0.0.1
 */
@Component
@Scope("request")
public class MenuBean implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 8671482464491610550L;

    private MenuService menuService;

    /** @author qiushaohua 2012-6-23 */
    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }

    public void save(ActionEvent actionEvent) {
        addMessage(menuService.save(actionEvent.getComponent().getId()));
        System.err.println("Data saved");
    }

    public void update(ActionEvent actionEvent) {
        addMessage("Data updated");
    }

    public void delete(ActionEvent actionEvent) {
        addMessage("Data deleted");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
