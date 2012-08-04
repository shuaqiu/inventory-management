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
 * @author qiushaohua 2012-7-7
 * @version 0.0.1
 */
@Entity
@Table(name="YHXX")
class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    private int id;

    private int canLogin;

    @Column(name="GroupID")
    private int groupID;

    private Timestamp iDate;

    @Column(name="LoginIP", length=30)
    private String loginIP;

    @Column(name="LoginMac", length=50)
    private String loginMac;

    @Column(name="LoginTime")
    private Timestamp loginTime;

    private int sortid;

    @Column(name="UserName", length=50)
    private String userName;

    @Column(name="UserPsw", length=50)
    private String userPsw;

    @Column(name="YGID")
    private int ygid;

    @Column(length=30)
    private String YGName;
}
