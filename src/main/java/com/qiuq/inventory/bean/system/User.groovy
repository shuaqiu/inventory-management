/**
 * @author qiushaohua 2012-7-7
 */
package com.qiuq.inventory.bean.system

import java.sql.Timestamp

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


/**
 * 用戶信息
 * The persistent class for the YHXX database table.
 * 
 */
@Entity
@Table(name="YHXX")
class User implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 用戶名
     */
    @Column(name="UserName", length=50)
    String name;

    /**
     * 用戶密碼
     * ?應該是經過MD5 處理過的?
     */
    @Column(name="UserPsw", length=50)
    String password;

    /**
     * 這個用戶對應的員工ID --> Employer
     */
    @Column(name="YGID")
    int employerID;

    /**
     * 這個用戶對應的員工名稱
     */
    @Column(name="YGName",length=30)
    String employerName;

    /**
     * 是否可以登錄
     * <li>1: 表示可以登錄
     * <li>0(或者為null): 表示不能登錄
     */
    int loginable;

    /**
     * 用戶所在的權限組ID --> UserGroup
     */
    @Column(name="GroupID")
    int userGroupID;

    /**
     * ?可能是創建這個用戶的時間?
     */
    @Column(name="iDate")
    Timestamp createDate;

    // 以下的字段沒有使用
    // @Column(name="LoginIP", length=30)
    // String loginIP;
    //
    // @Column(name="LoginMac", length=50)
    // String loginMac;
    //
    // @Column(name="LoginTime")
    // Timestamp loginTime;
    //
    // int sortid;
}
