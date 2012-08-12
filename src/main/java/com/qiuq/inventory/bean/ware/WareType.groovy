package com.qiuq.inventory.bean.ware

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 商品分類
 * The persistent class for the SPFL database table.
 *
 */
@Entity
@Table(name="SPFL")
class WareType implements Serializable {
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
    //    int canDiscount;
    //
    //    int canGroup;
    //
    //    int canPoints;
    //
    //    int curPrice;
    //
    //    BigDecimal LDis;
    //
    //    int noStock;
    //
    //    @Column(length=50)
    //    String place;
    //
    //    @Column(length=150)
    //    String producer;
    //
    //    @Column(name="PYM", length=50)
    //    String pym;
    //
    //    BigDecimal sLBound;
    //
    //    @Column(name="SortID")
    //    int sortID;
    //
    //    BigDecimal sUBound;
}
