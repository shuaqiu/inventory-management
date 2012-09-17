/**
 *
 */
package com.qiuq.inventory.service.system

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap

import com.qiuq.inventory.bean.system.Department
import com.qiuq.inventory.repository.system.DepartmentRepo

/**
 * @author qiushaohua 2012-9-17
 * @version 0.0.1
 *
 */
@Service
class DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;

    /**
     * 将部门转换成子部门的映射关系, 返回的MultiValueMap 的key 是部门ID, 而value 则是这个部门的所有子部门的ID(包括这个部门本身的ID)
     * 另外, 所有的部门都会加到一个ID 为0 的"所有部门" 下面.
     * @return
     * @author qiushaohua 2012-9-16
     */
    MultiValueMap<Integer, Integer> getSublist(){
        Iterable<Department> all = departmentRepo.findAll();

        // 首先转换成一个部门和上级部门的关系, 这样便以快速获取上级部门的ID
        Map<Integer, Integer> parents = [:];
        all.each {
            parents.put(it.id, it.parentId);
        }

        MultiValueMap<Integer, Integer> m = new LinkedMultiValueMap<Integer, Integer>();

        // 首先添加一个"所有部门" 的节点
        m.add(0, 0);
        all.each {
            int parentId = it.parentId;
            while(parentId != 0){
                // 对于所有的上级节点, 都将当前节点添加为这个上级节点的子节点
                m.add(parentId, it.id);
                // 继续遍历上级节点
                parentId = parents.get(parentId);
            }
            // 子节点也包括本身
            m.add(it.id, it.id);
            // 也做为虚拟的那个"所有部门" 的子节点
            m.add(0, it.id);
        }
        return m;
    }
}
