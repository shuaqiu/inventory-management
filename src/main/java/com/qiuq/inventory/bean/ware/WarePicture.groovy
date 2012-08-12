package com.qiuq.inventory.bean.ware

import javax.persistence.Basic
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Table

/**
 * 商品圖片信息
 * The persistent class for the SPPIC database table.
 *
 */
@Entity
@Table(name="SPPIC")
class WarePicture implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 商品ID --> Ware
     */
    @Column(name="SPID")
    int wareId;

    /**
     * 圖片數據, 直接使用Blob 保存在數據庫中
     */
    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name="Pic")
    byte[] pic;

    // 以下的字段沒有使用
    //    int sortID;
}
