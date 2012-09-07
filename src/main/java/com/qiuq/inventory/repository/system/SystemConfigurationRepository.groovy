/**
 *
 */
package com.qiuq.inventory.repository.system


import org.springframework.stereotype.Repository

import com.qiuq.inventory.bean.system.SystemConfiguration
import com.qiuq.inventory.repository.CommonRepository

/**
 * @author qiushaohua 2012-9-7
 * @version 0.0.1
 *
 */
@Repository
class SystemConfigurationRepository extends CommonRepository{

    SystemConfiguration loadConfigByName(String name){
        return entityManager.createNamedQuery("loadConfigByName", SystemConfiguration.class).setParameter("name", name).getSingleResult();
    }
}
