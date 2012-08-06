package com.qiuq.inventory.bean.base

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 銀行賬戶信息
 * The persistent class for the ZHXX database table.
 *
 */
@Entity
@Table(name="ZHXX")
class BankAccount implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 賬戶名稱
     */
    @Column(name="Name", length=50)
    String name;

    /**
     * 拼音碼: 拼音的首字母
     */
    @Column(name="PYM", length=50)
    String firstPinyin;

    /**
     * 是否停用:
     * <li>1: 表示已停用
     * <li>0(或者為null): 表示未停用
     */
    @Column(name="canUse")
    int disabled;

    /**
     * 是否默認賬號, 只能有一個是默認的, 如果設置了一個是默認賬號, 則原來的默認賬號需要取消默認:
     * <li>1: 表示是默認賬號
     * <li>0(或者為null): 表示不是默認賬號
     */
    @Column(name="Flag")
    int isDefault;

    // 以下的字段沒有使用
    // @Column(name="BZ", length=150)
    // String bz;
    //
    // @Column(name="QCYE")
    // BigDecimal qcye;
    //
    // @Column(name="SortID")
    // int sortID;
}
