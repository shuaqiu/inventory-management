/**
 * 
 */
package com.qiuq.inventory.repository.system;

import org.springframework.data.repository.CrudRepository;

import com.qiuq.inventory.bean.system.Department;

/**
 * @author qiushaohua 2012-9-13
 * @version 0.0.1
 * 
 */
public interface DepartmentRepo extends CrudRepository<Department, Integer> {

}
