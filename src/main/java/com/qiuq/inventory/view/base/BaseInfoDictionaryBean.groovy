/**
 *
 */
package com.qiuq.inventory.view.base

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import com.qiuq.inventory.bean.base.BaseInfoDictionary
import com.qiuq.inventory.repository.base.BaseInfoDictionaryRepo

/**
 * @author qiushaohua 2012-9-28
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class BaseInfoDictionaryBean {

    @Autowired
    BaseInfoDictionaryRepo baseInfoDictionaryRepo;

    /**
     * 学历
     * @return
     * @author qiushaohua 2012-9-28
     */
    List<BaseInfoDictionary> getEducations(){
        return baseInfoDictionaryRepo.findByType("学历");
    }

    /**
     * 岗位
     *
     * @return
     * @author qiushaohua 2012-9-28
     */
    List<BaseInfoDictionary> getDutys(){
        return baseInfoDictionaryRepo.findByType("岗位");
    }

    /**
     * 职位
     *
     * @return
     * @author qiushaohua 2012-9-28
     */
    List<BaseInfoDictionary> getPositions(){
        return baseInfoDictionaryRepo.findByType("职位");
    }
}
