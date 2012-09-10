/**
 *
 */
package com.qiuq.inventory.view.system

import javax.annotation.PostConstruct
import javax.faces.event.ActionEvent

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import com.qiuq.inventory.bean.system.SystemConfig
import com.qiuq.inventory.bean.system.SystemConfigItem
import com.qiuq.inventory.repository.system.SystemConfigRepo

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
    SystemConfigRepo systemConfigRepo;

    @PostConstruct
    void init(){
        SystemConfig conf = getUnitNameConf();
        unitName = conf.getValue();
    }

    String updateUnitName(ActionEvent event){
        SystemConfig conf = getUnitNameConf();
        conf.setValue(unitName);
        systemConfigRepo.save(conf);
        return null;
    }

    private SystemConfig getUnitNameConf(){
        return systemConfigRepo.findByName(SystemConfigItem.UNIT_NAME.key);
    }
}
