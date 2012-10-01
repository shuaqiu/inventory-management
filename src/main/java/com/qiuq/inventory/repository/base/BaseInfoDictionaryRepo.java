/**
 * 
 */
package com.qiuq.inventory.repository.base;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.qiuq.inventory.bean.base.BaseInfoDictionary;

/**
 * @author qiushaohua 2012-9-28
 * @version 0.0.1
 * 
 */
public interface BaseInfoDictionaryRepo extends
        CrudRepository<BaseInfoDictionary, Integer> {

    List<BaseInfoDictionary> findByType(String type);
}
