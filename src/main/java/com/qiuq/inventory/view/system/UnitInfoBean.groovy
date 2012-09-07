/**
 *
 */
package com.qiuq.inventory.view.system

import javax.annotation.PostConstruct

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import com.qiuq.inventory.bean.system.SystemConfiguration
import com.qiuq.inventory.bean.system.SystemConfigurationItem
import com.qiuq.inventory.service.system.SystemConfigurationService

/**
 * @author qiushaohua 2012-9-7
 * @version 0.0.1
 *
 */
@Component
@Scope("application")
class UnitInfoBean {

    String unitName;

    @Autowired
    SystemConfigurationService systemConfigurationService;

    @PostConstruct
    void init(){
        SystemConfiguration unitNameConf = systemConfigurationService.loadConfig(SystemConfigurationItem.UNIT_NAME);
        unitName = unitNameConf.getValue();
    }

    String updateUnitName(){
        systemConfigurationService.updateValue(SystemConfigurationItem.UNIT_NAME, unitName);
        return null;
    }
}
