/**
 * 
 */
package com.qiuq.inventory.repository.system;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.qiuq.inventory.bean.system.Employer;

/**
 * @author qiushaohua 2012-9-14
 * @version 0.0.1
 * 
 */
public interface EmployerRepo extends CrudRepository<Employer, Integer> {

    /**
     * @return
     * @author qiushaohua 2012-9-14
     */
    @Query("select t from Employer t where t.departmentId in :departmentIds"
            + " and (t.serialNumber like :query or t.name like :query or t.firstPinyin like :query)")
    List<Employer> findByDepartmentAndQuery(
            @Param("departmentIds") List<Integer> departmentIds,
            @Param("query") String query, Sort sort);
}
