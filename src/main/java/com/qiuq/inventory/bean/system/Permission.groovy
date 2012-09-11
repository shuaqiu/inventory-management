/**
 *
 */
package com.qiuq.inventory.bean.system

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

import com.qiuq.inventory.bean.CommonBean

/**
 * 權限表
 * @author qiushaohua 2012-9-11
 * @version 0.0.1
 *
 */
@Entity
@Table(name="QXB")
class Permission extends CommonBean implements Serializable {
    static final long serialVersionUID = 1L;

    /**
     * 用戶組(權限組)名, 這系統比較奇怪, 好多都是用名稱去關聯的
     */
    @Column(name="name", length=50)
    String userGroupName;

    /**
     * 權限分類
     */
    @Column(name="xm", length=50)
    String type;

    /**
     * 權限設置, 這裡只是用逗號分隔的權限值組成的字符串
     */
    @Column(name="xmValue", length=250)
    String typeValue;
}
