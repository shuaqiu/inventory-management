package com.qiuq.inventory.bean.system

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 員工部門
 * The persistent class for the YGBM database table.
 *
 */
@Entity
@Table(name="YGBM")
class Department implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

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
    int parentID;

    // 以下的字段沒有使用
    //    @Column(name="PYM", length=50)
    //     String pym;
    //
    //    @Column(name="SortID")
    //     int sortID;

}
