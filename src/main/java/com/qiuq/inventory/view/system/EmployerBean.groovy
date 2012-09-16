/**
 *
 */
package com.qiuq.inventory.view.system

import java.lang.reflect.Field

import javax.faces.model.ListDataModel
import javax.persistence.Column
import javax.persistence.Transient

import org.primefaces.model.SelectableDataModel
import org.primefaces.model.TreeNode
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Component
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import org.springframework.util.ReflectionUtils
import org.springframework.util.ReflectionUtils.FieldCallback
import org.springframework.util.ReflectionUtils.FieldFilter

import com.qiuq.inventory.bean.config.GridColumnDefinition
import com.qiuq.inventory.bean.system.Department
import com.qiuq.inventory.bean.system.Employer
import com.qiuq.inventory.repository.config.GridColumnDefinitionRepo
import com.qiuq.inventory.repository.system.DepartmentRepo
import com.qiuq.inventory.repository.system.EmployerRepo

/**
 * @author qiushaohua 2012-9-13
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class EmployerBean {
    static final int MODAL_ID = 45;

    TreeNode selectedTreeNode;

    String query;

    boolean isHideDisabled;

    @Autowired
    EmployerRepo employerRepo;

    @Autowired
    DepartmentRepo departmentRepo;

    @Autowired
    GridColumnDefinitionRepo gridColumnDefinitionRepo;

    EmployerDataModel getEmployers(){
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
        MultiValueMap<Integer, Integer> sub = getSubDepartment();
        List<Integer> departmentIds = sub.get(selectedDepartmentId);

        return new EmployerDataModel(employerRepo.findByDepartmentAndQuery(departmentIds, "%${query}%", new Sort("id")));
    }

    List<GridColumnDefinition> getColumns(){
        List<GridColumnDefinition> columns = gridColumnDefinitionRepo.findByModalId(MODAL_ID);

        Map<String, String> mapping = getColumnMapping(Employer);

        columns.each {
            it.fieldName = mapping.get(it.fieldName.toLowerCase());
        }
        return columns;
    }

    /**
     * 将部门转换成子部门的映射关系, 返回的MultiValueMap 的key 是部门ID, 而value 则是这个部门的所有子部门的ID(包括这个部门本身的ID)
     * 另外, 所有的部门都会加到一个ID 为0 的"所有部门" 下面.
     * @return
     * @author qiushaohua 2012-9-16
     */
    private MultiValueMap<Integer, Integer> getSubDepartment(){
        Iterable<Department> allDepartment = departmentRepo.findAll();

        // 首先转换成一个部门和上级部门的关系, 这样便以快速获取上级部门的ID
        Map<Integer, Integer> parents = [:];
        allDepartment.each {
            parents.put(it.id, it.parentId);
        }

        MultiValueMap<Integer, Integer> m = new LinkedMultiValueMap<Integer, Integer>();
        m.add(0, 0);
        allDepartment.each {
            int parentId = it.parentId;
            while(parentId != 0){
                m.add(parentId, it.id);
                parentId = parents.get(parentId);
            }
            m.add(it.id, it.id);
            m.add(0, it.id);
        }
        return m;
    }

    protected Map<String, String> getColumnMapping(Class<?> entityClass){
        Map<String, String> mapping = [:];

        def fieldCallback = { Field field->
            Column column= field.getAnnotation(Column.class);
            if(column == null || column.name() == ""){
                mapping.put(field.name.toLowerCase(), field.name);
            }else{
                mapping.put(column.name().toLowerCase(), field.name);
            }
        } as FieldCallback;

        def fieldFilter = {Field field->
            field.getAnnotation(Transient) == null;
        } as FieldFilter;

        ReflectionUtils.doWithFields(entityClass,fieldCallback, fieldFilter);

        return mapping;
    }

    private class EmployerDataModel extends ListDataModel<Employer> implements SelectableDataModel<Employer>, Serializable{

        public EmployerDataModel(List<Employer> data){
            super(data);
        }

        @Override
        public Object getRowKey(Employer object) {
            return object.id;
        }

        @Override
        public Employer getRowData(String rowKey) {
            return getWrappedData().find {
                return it.id == Integer.parseInt(rowKey);
            }
        }

    }
}
