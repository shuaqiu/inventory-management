/**
 *
 */
package com.qiuq.inventory.repository.config;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.qiuq.inventory.bean.config.GridColumnDefinition;

/**
 * @author qiushaohua 2012-9-14
 * @version 0.0.1
 * 
 */
public interface GridColumnDefinitionRepo extends
        Repository<GridColumnDefinition, Integer> {

    /**
     * @param modalId
     * @return
     * @author qiushaohua 2012-9-14
     */
    @Query("select t from GridColumnDefinition t where t.modalId = :modalId order by t.sortIndex")
    List<GridColumnDefinition> findByModalId(@Param("modalId") int modalId);
}
