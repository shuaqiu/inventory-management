package com.qiuq.inventory.bean.base

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 單據編號規則
 * The persistent class for the DJSet database table.
 *
 */
@Entity
@Table(name="DJSet")
class ReceiptSerialNumberRule implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 單據類型ID?
     */
    @Column(name="DJLX")
    int receiptTypeId;

    /**
     * 單據名稱
     */
    @Column(length=30)
    String name;

    /**
     * 單據編號的前綴, 例如"進貨訂單" 的前綴是"JD"
     */
    @Column(name="BHQZ", length=30)
    String prefix;

    /**
     * 編號的中間部分, 主要是根據日期的模式進行生成, 比如"年月日" 生成"20120808" 這樣的編號
     */
    @Column(name="DJBHLX", length=50)
    String datePattern;

    /**
     * 單據編號的後綴(序號)位數, 填寫的是"001" 這樣, 表示3 位數字
     */
    @Column(name="BHWS", length=30)
    String suffixLength;

    /**
     * 示例
     */
    @Column(name="BZ", length=50)
    String example;

    // 以下的字段沒有使用
    //    @Column(name="DJJS")
    //    int djjs;
    //
    //    @Column(length=30)
    //    String MRJGField;
    //
    //    @Column(length=30)
    //    String MRJGName;
    //
    //    @Column(name="SHR1", length=250)
    //    String shr1;
    //
    //    @Column(name="SHR2", length=250)
    //    String shr2;
    //
    //    @Column(name="SHR3", length=250)
    //    String shr3;
    //
    //    @Column(name="SHR4", length=250)
    //    String shr4;
    //
    //    @Column(name="SHR5", length=250)
    //    String shr5;
    //
    //    @Column(name="SHRID1", length=50)
    //    String shrid1;
    //
    //    @Column(name="SHRID2", length=50)
    //    String shrid2;
    //
    //    @Column(name="SHRID3", length=50)
    //    String shrid3;
    //
    //    @Column(name="SHRID4", length=50)
    //    String shrid4;
    //
    //    @Column(name="SHRID5", length=50)
    //    String shrid5;
}
