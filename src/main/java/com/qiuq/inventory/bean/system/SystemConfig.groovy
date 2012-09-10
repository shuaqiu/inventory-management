package com.qiuq.inventory.bean.system

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.NamedQueries
import javax.persistence.NamedQuery
import javax.persistence.Table

/**
 * 系統配置
 * The persistent class for the SYSCS database table.
 *
 */
@Entity
@Table(name="SYSCS")
@NamedQueries([
    @NamedQuery(name="findByName", query="select t from SystemConfig t where t.name = :name")
])
class SystemConfig implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    Integer id;

    /**
     * 配置名稱
     */
    @Column(name="CSMC", length=50)
    String name;

    /**
     * 配置值
     */
    @Column(name="ZFCS", length=250)
    String value;

    /**
     * 配置標題
     */
    @Column(name="CSCaption", length=150)
    String caption;

    /**
     * 配置類別
     */
    @Column(name="CSLB", length=50)
    String type;

    // 以下的字段沒有使用
    //    @Column(name="ZXCS")
    //    int zxcs;
}
