/**
 *
 */
package com.qiuq.inventory.service.system

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.qiuq.inventory.bean.system.SystemConfiguration
import com.qiuq.inventory.bean.system.SystemConfigurationItem
import com.qiuq.inventory.repository.CommonRepository;

/**
 * @author qiushaohua 2012-9-7
 * @version 0.0.1
 *
 */
@Service
class SystemConfigurationService {

    @Autowired
    CommonRepository systemConfigurationRepository;

    @Transactional(readOnly = true)
    SystemConfiguration loadConfig(SystemConfigurationItem key){
        return systemConfigurationRepository.loadConfigByName(key.key);
    }

    @Transactional
    boolean updateValue(SystemConfigurationItem key, String value){
        SystemConfiguration conf = systemConfigurationRepository.loadConfigByName(key.key);
        conf.setValue(value);
    }
}
