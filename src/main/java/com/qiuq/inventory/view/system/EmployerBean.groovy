/**
 *
 */
package com.qiuq.inventory.view.system

import org.primefaces.model.TreeNode
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Component
import org.springframework.util.MultiValueMap

import com.qiuq.inventory.bean.config.GridColumnDefinition
import com.qiuq.inventory.bean.system.Department
import com.qiuq.inventory.repository.config.GridColumnDefinitionRepo
import com.qiuq.inventory.repository.system.EmployerRepo
import com.qiuq.inventory.service.system.DepartmentService
import com.qiuq.inventory.view.CommonBeanDataModel
import com.qiuq.inventory.view.CommonListBean

/**
 * @author qiushaohua 2012-9-13
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class EmployerBean extends CommonListBean{

    TreeNode selectedTreeNode;

    boolean isHideDisabled;

    @Autowired
    EmployerRepo employerRepo;

    @Autowired
    DepartmentService departmentService;

    protected CommonBeanDataModel initDatas(){
        if(query == null || query.trim() == ""){
            query = "";
        }

        int selectedDepartmentId = 0;
        if(selectedTreeNode != null){
            Department selectedDepartment = selectedTreeNode.getData();
            if(selectedDepartment != null){
                selectedDepartmentId = selectedDepartment.id;
            }
        }
        MultiValueMap<Integer, Integer> sub = departmentService.getSublist();
        List<Integer> departmentIds = sub.get(selectedDepartmentId);

        return new CommonBeanDataModel(employerRepo.findByDepartmentAndQuery(departmentIds, "%${query}%", parseSort()));
    }


    @Override
    protected int getModalId() {
        // 员工的modal id 是45
        return 45;
    }
}
