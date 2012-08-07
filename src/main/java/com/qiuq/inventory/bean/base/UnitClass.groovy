package com.qiuq.inventory.bean.base

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 單位("供應商" 和"客戶")分類
 * The persistent class for the DWFL database table.
 *
 */
@Entity
@Table(name="DWFL")
class UnitClass implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 編號
     */
    @Column(name="BH", length=30)
    String serialNumber;

    /**
     * 名稱
     */
    @Column(name="Name", length=50)
    String name;

    /**
     * 上級分類ID
     */
    @Column(name="ParentID")
    int parentID;

    // 以下的字段沒有使用
    //    @Column(name="PYM", length=50)
    //    String pym;
    //
    //    @Column(name="Flag")
    //    int flag;
    //
    //    @Column(name="PriceField", length=30)
    //    String priceField;
    //
    //    @Column(name="PriceName", length=30)
    //    String priceName;
    //
    //    @Column(name="SortID")
    //    int sortID;
    //
    //    BigDecimal YFLimit;
    //
    //    BigDecimal YSLimit;
}
