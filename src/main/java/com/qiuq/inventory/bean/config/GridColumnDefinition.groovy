/**
 *
 */
package com.qiuq.inventory.bean.config

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

import com.qiuq.inventory.bean.CommonBean

/**
 * 表格列定義
 * @author qiushaohua 2012-9-11
 * @version 0.0.1
 *
 */
@Entity
@Table(name="GridSet")
class GridColumnDefinition extends CommonBean implements Serializable {
    static final long serialVersionUID = 1L;

    /**
     * 表格ID
     */
    @Column(name="ModalID")
    int modalId;

    /**
     * 表格名稱, 現在都是null
     */
    @Column(name="GridName", length=50)
    String gridName;

    /**
     * 字段名稱(應該是匹配對應數據表的字段名的)
     */
    @Column(name="fieldName", length=50)
    String fieldName;

    /**
     * 標題, 在呈現表格時顯示的表頭, 以及在定制介面顯示的名稱
     */
    @Column(name="Title", length=50)
    String title;

    /**
     * 自定義標題
     */
    @Column(name="ZDYTitle", length=50)
    String customTitle;

    /**
     * 是否在表格中顯示這個字段:
     * 1: 顯示;
     * 0: 不顯示.
     */
    @Column(name="isShow")
    int isShow;

    /**
     * 序號, 在表格中 顯示的順序
     */
    @Column(name="SortID")
    int sortOrder;

    /**
     * 寬度, 列寬, 有些字段的列寬設為-1, 應該是這一列會隱藏掉
     */
    @Column(name="Width")
    int width;

    // 以下的字段沒有使用
    //    @Column(name="FDID")
    //    int fdId;
    //
    //    @Column(name="FDID", length=50)
    //    String fdName;
}
