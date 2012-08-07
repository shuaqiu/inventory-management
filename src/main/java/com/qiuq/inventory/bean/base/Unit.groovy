package com.qiuq.inventory.bean.base

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 單位信息: 保存"供應商" 信息和"客戶" 信息
 * 
 * The persistent class for the DWXX database table.
 *
 */
@Entity
@Table(name="DWXX")
class Unit implements Serializable {
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
     * 單位名稱
     */
    @Column(name="Name", length=150)
    String name;

    /**
     * 拼音碼: 拼音的首字母
     */
    @Column(name="PYM", length=50)
    String firstPinyin;

    /**
     * 單位類型:
     * <li>0: 客戶
     * <li>1: 供應商
     * <li>2: 既是客戶又是供應商
     */
    @Column(name="Flag")
    int unitType;

    /**
     * 單位性質:
     * <li>0: 個人
     * <li>1: 公司
     */
    @Column(name="isCom")
    int unitProperty;

    /**
     * 聯繫人
     */
    @Column(name="LXR", length=30)
    String linkman;

    /**
     * 手機號碼
     */
    @Column(name="Mobile", length=30)
    String mobile;

    /**
     * 聯繫電話
     */
    @Column(name="Tel", length=50)
    String tel;

    /**
     * 傳真
     */
    @Column(name="Fax", length=50)
    String fax;

    /**
     * 所屬業務員ID --> Employer 中salesman = 1 的記錄
     */
    @Column(name="YGID")
    int salesmanId;

    /**
     * 所屬業務員姓名 --> Employer 中salesman = 1 的記錄
     */
    @Column(length=30)
    String salesmanName;

    /**
     * 單位類別ID --> UnitClass
     */
    @Column(name="TypeID")
    int unitClassId;

    /**
     * 單位類別名稱 --> UnitClass
     */
    @Column(name="TypeName", length=50)
    String unitClassName;

    /**
     * 網址
     */
    @Column(length=150)
    String url;

    /**
     * 電子郵箱
     */
    @Column(name="Email", length=50)
    String email;

    /**
     * QQ/MSN
     */
    @Column(length=30)
    String qq;

    /**
     * 地址
     */
    @Column(length=250)
    String address;

    /**
     * 是否停用:
     * <li>1: 表示已停用
     * <li>0(或者為null): 表示未停用
     */
    @Column(name="canUse")
    int disabled;

    /**
     * 期初應收
     */
    @Column(name="QCYS")
    double beginingReceivable;

    /**
     * 期初應付
     */
    @Column(name="QCYF")
    double beginingPayable;

    // 以下的字段沒有使用
    //    @Column(name="BankName", length=100)
    //    String bankName;
    //
    //    @Column(name="BankNo", length=50)
    //    String bankNo;
    //
    //    @Column(name="BZ", length=150)
    //    String bz;
    //
    //    int canqf;
    //
    //    @Column(name="DQ", length=30)
    //    String dq;
    //
    //    @Column(name="DQYF")
    //    BigDecimal dqyf;
    //
    //    @Column(name="DQYS")
    //    BigDecimal dqys;
    //
    //    @Column(name="FDID")
    //    int fdid;
    //
    //    @Column(length=50)
    //    String FDName;
    //
    //    @Column(name="FKQX")
    //    int fkqx;
    //
    //    @Column(length=50)
    //    String lx;
    //
    //    @Column(name="PriceField", length=30)
    //    String priceField;
    //
    //    @Column(name="PriceName", length=30)
    //    String priceName;
    //
    //    @Column(name="SEX", length=10)
    //    String sex;
    //
    //    @Column(name="SortID")
    //    int sortID;
    //
    //    @Column(name="TaxNo", length=50)
    //    String taxNo;
    //
    //    BigDecimal YFLimit;
    //
    //    BigDecimal YSLimit;
    //
    //    @Column(name="ZFZDY1", length=50)
    //    String zfzdy1;
    //
    //    @Column(name="ZFZDY2", length=50)
    //    String zfzdy2;
    //
    //    @Column(name="ZFZDY3", length=50)
    //    String zfzdy3;
    //
    //    @Column(name="ZFZDY4", length=50)
    //    String zfzdy4;
    //
    //    @Column(name="ZFZDY5", length=50)
    //    String zfzdy5;
    //
    //    @Column(name="ZFZDY6", length=50)
    //    String zfzdy6;
}
