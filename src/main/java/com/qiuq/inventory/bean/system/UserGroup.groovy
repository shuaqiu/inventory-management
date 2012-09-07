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
 * 用戶組(權限組)
 * The persistent class for the QXZ database table.
 *
 */
@Entity
@Table(name="QXZ")
@NamedQueries([
    @NamedQuery(name="loadUserGroup", query="select t from UserGroup t")
])
class UserGroup implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 名稱
     */
    @Column(length=50)
    String name;
}
