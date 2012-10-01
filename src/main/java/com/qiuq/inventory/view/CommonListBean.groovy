/**
 *
 */
package com.qiuq.inventory.view

import java.lang.reflect.Field

import javax.persistence.Column
import javax.persistence.Transient

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.util.ReflectionUtils
import org.springframework.util.ReflectionUtils.FieldCallback
import org.springframework.util.ReflectionUtils.FieldFilter

import com.qiuq.inventory.bean.config.GridColumnDefinition
import com.qiuq.inventory.bean.system.Employer
import com.qiuq.inventory.repository.config.GridColumnDefinitionRepo

/**
 * 通用的数据列表bean
 *
 * @author qiushaohua 2012-9-22
 * @version 0.0.1
 *
 */
abstract class CommonListBean {

    String query;

    String sort;

    CommonBeanDataModel datas;

    List<GridColumnDefinition> columns;

    @Autowired
    GridColumnDefinitionRepo gridColumnDefinitionRepo;

    /**
     * 获取表格的数据
     *
     * @return
     * @author qiushaohua 2012-9-22
     */
    CommonBeanDataModel getDatas(){
        if(datas == null){
            datas = initDatas();
        }
        return datas;
    }

    /**
     * change the setter to private
     *
     * @param employers
     * @author qiushaohua 2012-9-17
     */
    private void setDatas(CommonBeanDataModel datas){
    }

    /**
     * 获取表格的数据
     *
     * @return
     * @author qiushaohua 2012-9-17
     */
    protected abstract CommonBeanDataModel initDatas()

    /**
     * 将sort(field,direct 的形式, 例如: id,asc) 属性转换成对应的查询语句
     *
     * @return
     * @author qiushaohua 2012-9-22
     */
    protected Sort parseSort(){
        if(sort != null){
            String[] arr = sort.split(",");
            if(arr.length == 1){
                return new Sort(arr[0]);
            }
            if(arr.length == 2){
                if(arr[1] == "asc"){
                    return new Sort(Sort.Direction.ASC, arr[0]);
                }else{
                    return new Sort(Sort.Direction.DESC, arr[0]);
                }
            }
        }
        return new Sort("id");
    }

    /**
     * 获取表格的列的定义, 从配置表中查出
     *
     * @return
     * @author qiushaohua 2012-9-17
     */
    List<GridColumnDefinition> getColumns(){
        if(columns == null){
            columns = initColumns();
        }
        return columns;
    }


    /**
     * change the setter to private
     *
     * @param columns
     * @author qiushaohua 2012-9-17
     */
    private void setColumns(List<GridColumnDefinition> columns){
    }

    /**
     * 获取表格的列的定义, 从配置表中查出
     *
     * @return
     * @author qiushaohua 2012-9-17
     */
    protected List<GridColumnDefinition> initColumns(){
        List<GridColumnDefinition> columns = gridColumnDefinitionRepo.findByModalId(getModalId());

        Map<String, String> mapping = getColumnMapping(Employer);

        columns.each {
            it.fieldName = mapping.get(it.fieldName.toLowerCase());
        }
        return columns;
    }

    /**
     * 获取表格的配置ID
     *
     * @return
     * @author qiushaohua 2012-9-22
     */
    protected abstract int getModalId();

    /**
     * 获取entity class 的JPA 映射配置
     *
     * @param entityClass
     * @return 数据库字段(key) 和entity class 的属性(value) 的映射关系
     * @author qiushaohua 2012-9-16
     */
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

        def fieldFilter = { Field field->
            field.getAnnotation(Transient.class) == null;
        } as FieldFilter;

        ReflectionUtils.doWithFields(entityClass,fieldCallback, fieldFilter);

        return mapping;
    }
}
