package com.qiuq.inventory.bean.base

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

import com.qiuq.inventory.bean.CommonBean

/**
 * 基礎資料字典
 * The persistent class for the JCZL database table.
 *
 */
@Entity
@Table(name="JCZL")
class BaseInfoDictionary extends CommonBean implements Serializable {
    static final long serialVersionUID = 1L;

    /**
     * 編號
     */
    @Column(name="BH", length=50)
    String serialNumber;

    /**
     * 名稱
     */
    @Column(name="Name", length=250)
    String name;

    /**
     * 拼音碼: 拼音的首字母
     */
    @Column(name="PYM", length=150)
    String firstPinyin;

    /**
     * 類別:
     * <li>品牌
     * <li>商品單位
     * <li>學歷
     * <li>崗位
     * <li>職位
     * <li>顏色
     * <li>尺碼
     */
    @Column(name="LB", length=50)
    String type;

    // 以下的字段沒有使用
    //    @Column(name="BZ", length=250)
    //    String bz;
    //
    //    @Column(name="SortID")
    //    int sortID;
}
