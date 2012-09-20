

/**
 *
 */
package com.qiuq.inventory.view

import javax.faces.model.ListDataModel

import org.primefaces.model.SelectableDataModel

import com.qiuq.inventory.bean.CommonBean

/**
 * @author qiushaohua 2012-9-20
 * @version 0.0.1
 *
 */
class CommonBeanDataModel extends ListDataModel<CommonBean> implements SelectableDataModel<CommonBean>, Serializable {
    public CommonBeanDataModel(List<CommonBean> data){
        super(data);
    }

    @Override
    public Object getRowKey(CommonBean object) {
        return object.id;
    }

    @Override
    public CommonBean getRowData(String rowKey) {
        return getWrappedData().find {
            return it.id == Integer.parseInt(rowKey);
        }
    }
}
