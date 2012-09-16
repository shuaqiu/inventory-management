package com.qiuq.inventory.bean.system

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

import com.qiuq.inventory.bean.CommonBean

/**
 * 員工部門
 * The persistent class for the YGBM database table.
 *
 */
@Entity
@Table(name="YGBM")
class Department extends CommonBean implements Serializable {
    static final long serialVersionUID = 1L;

    /**
     * 編號
     */
    @Column(name="BH", length=50)
    String serialNumber;

    /**
     * 部門名稱
     */
    @Column(name="Name", length=50)
    String name;

    /**
     * 上級部門ID
     */
    @Column(name="ParentID")
    int parentId;

    // 以下的字段沒有使用
    //    @Column(name="PYM", length=50)
    //     String pym;
    //
    //    @Column(name="SortID")
    //     int sortID;

}
