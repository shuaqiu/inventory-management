package com.qiuq.inventory.bean.system

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.NamedQueries
import javax.persistence.NamedQuery
import javax.persistence.Table

import com.qiuq.inventory.bean.CommonBean

/**
 * 用戶組(權限組)
 * The persistent class for the QXZ database table.
 *
 */
@Entity
@Table(name="QXZ")
@NamedQueries([
    @NamedQuery(name="UserGroup.findAll", query="select t from UserGroup t")
])
class UserGroup extends CommonBean implements Serializable {
    static final long serialVersionUID = 1L;

    /**
     * 名稱
     */
    @Column(length=50)
    String name;
}
