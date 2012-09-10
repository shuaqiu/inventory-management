/**
 * 
 */
package com.qiuq.inventory.repository.system;

import org.springframework.data.repository.CrudRepository;

import com.qiuq.inventory.bean.system.SystemConfig;

/**
 * @author qiushaohua 2012-9-9
 * @version 0.0.1
 * 
 */
public interface SystemConfigRepo extends CrudRepository<SystemConfig, Integer> {
    SystemConfig findByName(String name);
}
