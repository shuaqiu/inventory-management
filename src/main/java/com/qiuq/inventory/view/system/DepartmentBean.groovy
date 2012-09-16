/**
 *
 */
package com.qiuq.inventory.view.system

import org.primefaces.model.DefaultTreeNode
import org.primefaces.model.TreeNode
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap

import com.qiuq.inventory.bean.system.Department
import com.qiuq.inventory.repository.system.DepartmentRepo

/**
 * @author qiushaohua 2012-9-13
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class DepartmentBean {
    TreeNode root;

    @Autowired
    DepartmentRepo departmentRepo;

    TreeNode getRoot(){
        if(root == null){
            root = new DefaultTreeNode("root", null);
            TreeNode allDepartment = new DefaultTreeNode(new Department(id:0,name:"所有部门信息"), root);

            Iterable<Department> departments = departmentRepo.findAll();

            MultiValueMap<Integer, Department> m = new LinkedMultiValueMap<Integer, Department>();
            departments.each {
                m.add(it.parentId, it);
            }

            toTree(m, 0, allDepartment);
        }
        return root;
    }

    /**
     * 使用递归的方式, 将部门的层次关系转化成树
     * @param m
     * @param parentId
     * @param parentNode
     * @author qiushaohua 2012-9-13
     */
    private void toTree(MultiValueMap<Integer, Department> m, Integer parentId, TreeNode parentNode){
        m.get(parentId).each {
            TreeNode node = new DefaultTreeNode(it, parentNode);
            toTree(m, it.id, node);
        }
    }
}
