package com.qiuq.inventory.bean.ware

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 商品信息
 * The persistent class for the SPXX database table.
 *
 */
@Entity
@Table(name="SPXX")
class Ware implements Serializable {
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
    @Column(name="Name", length=150)
    String name;

    /**
     * 拼音碼: 拼音的首字母
     */
    @Column(name="PYM", length=150)
    String firstPinyin;

    /**
     * 單位
     */
    @Column(name="Unit", length=30)
    String unit;

    /**
     * 條形碼
     */
    @Column(name="BarCode", length=50)
    String barCode;

    /**
     * 商品類別ID --> WareType
     */
    @Column(name="TypeID")
    int typeID;

    /**
     * 商品類別名稱 --> WareType
     */
    @Column(name="TypeName", length=50)
    String typeName;

    /**
     * 單價(銷售價?)
     */
    @Column(name="Price")
    double price;

    /**
     * 進貨價
     */
    @Column(name="cPrice")
    double purchasePrice;

    /**
     * 會員價
     */
    @Column(name="mPrice")
    double memberPrice;

    /**
     * 批發價
     */
    @Column(name="tPrice")
    BigDecimal wholesalePrice;

    /**
     * 品牌
     */
    @Column(name="Brand", length=50)
    String brand;

    /**
     * 產地
     */
    @Column(name="place", length=50)
    String productionPlace;

    /**
     * 廠家
     */
    @Column(length=150)
    String producer;

    /**
     * 顏色ID --> BaseInfoDictionary
     */
    @Column(name="ColorID")
    int colorID;

    /**
     * 顏色 --> BaseInfoDictionary
     */
    @Column(name="ColorName", length=50)
    String colorName;

    /**
     * 尺碼ID --> BaseInfoDictionary
     */
    @Column(name="SizeID")
    int sizeID;

    /**
     * 尺碼ID --> BaseInfoDictionary
     */
    @Column(name="SizeName", length=50)
    String sizeName;

    /**
     * 是否停用:
     * <li>1: 表示已停用
     * <li>0(或者為null): 表示未停用
     */
    @Column(name="canUse")
    int disabled;

    /**
     * 不參與庫存
     * <li>1: 表示不參與庫存
     * <li>0(或者為null): 表示參與庫存
     */
    @Column(name="noStock")
    int noStock;

    /**
     * 可打折:
     * <li>1: 表示可打折
     * <li>0(或者為null): 表示不可打折
     *
     */
    @Column(name="canDiscount")
    int canDiscount;

    /**
     * 可積分:
     * <li>1: 表示可積分
     * <li>0(或者為null): 表示不可積分
     */
    @Column(name="canPoints")
    int canAccumulatePoints;

    /**
     * 時價:
     * <li>1: 表示時價
     * <li>0(或者為null): 表示不是時價
     */
    @Column(name="curPrice")
    int currentPrice;

    /**
     * 是否手工輸入成本:
     * <li>1: 手工輸入成本
     * <li>0(或者為null): 表示不是手工輸入成本
     */
    @Column(name="issgcb")
    int inputCostManually;

    /**
     * 貨架號
     */
    @Column(name="ZFZDY3", length=50)
    String shelfNumber;

    /**
     * ??
     */
    @Column(name="iFlag")
    int iFlag;

    // 以下的字段沒有使用
    //    int barcodelx;
    //
    //    @Column(name="BZ", length=300)
    //    String bz;
    //
    //    int canCL;
    //
    //    int canGroup;
    //
    //    @Column(name="CLBL")
    //    int clbl;
    //
    //    BigDecimal CLPrice;
    //
    //    @Column(length=30)
    //    String CLUnit;
    //
    //    int isCalcSL;
    //
    //    int isSerial;
    //
    //    BigDecimal LDis;
    //
    //    @Column(name="Model", length=50)
    //    String model;
    //
    //    int nocb;
    //
    //    @Column(name="Price2")
    //    BigDecimal price2;
    //
    //    @Column(name="Price3")
    //    BigDecimal price3;
    //
    //    @Column(name="Price4")
    //    BigDecimal price4;
    //
    //    @Column(name="Price5")
    //    BigDecimal price5;
    //
    //    @Column(name="Price6")
    //    BigDecimal price6;
    //
    //    @Column(name="QuaMonth")
    //    int quaMonth;
    //
    //    int sizecolorlx;
    //
    //    BigDecimal sLBound;
    //
    //    @Column(name="SortID")
    //    int sortID;
    //
    //    @Column(name="Spec", length=50)
    //    String spec;
    //
    //    BigDecimal sUBound;
    //
    //    @Column(name="SZZDY1")
    //    BigDecimal szzdy1;
    //
    //    @Column(name="SZZDY2")
    //    BigDecimal szzdy2;
    //
    //    @Column(name="TCFS")
    //    int tcfs;
    //
    //    @Column(name="TCJE")
    //    BigDecimal tcje;
    //
    //    @Column(name="ZDY1", length=50)
    //    String zdy1;
    //
    //    @Column(name="ZDY2", length=50)
    //    String zdy2;
    //
    //    @Column(name="ZDY3", length=50)
    //    String zdy3;
    //
    //    @Column(name="ZDY4", length=50)
    //    String zdy4;
    //
    //    @Column(name="ZFZDY1", length=50)
    //    String zfzdy1;
    //
    //    @Column(name="ZFZDY2", length=50)
    //    String zfzdy2;
    //
    //    @Column(name="ZFZDY4", length=50)
    //    String zfzdy4;
    //
    //    @Column(name="ZFZDY5", length=50)
    //    String zfzdy5;
    //
    //    @Column(name="ZFZDY6", length=50)
    //    String zfzdy6;
    //
    //    @Column(name="ZFZDY7", length=50)
    //    String zfzdy7;
    //
    //    @Column(name="ZFZDY8", length=50)
    //    String zfzdy8;
    //
    //    @Column(name="ZXZDY1")
    //    int zxzdy1;
    //
    //    @Column(name="ZXZDY2")
    //    int zxzdy2;
}
