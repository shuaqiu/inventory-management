package com.qiuq.inventory.bean.system

import java.sql.Timestamp

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 用戶日誌?
 * The persistent class for the yhlog database table.
 *
 */
@Entity
@Table(name="yhlog")
class UserLoginLog implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 用戶名
     */
    @Column(length=30)
    String username;

    /**
     * 登錄的MAC 地址
     */
    @Column(length=30)
    String mac;

    /**
     * 登錄的IP 地址
     */
    @Column(length=30)
    String ip;

    /**
     * 登錄時間
     */
    Timestamp loginTime;

    /**
     * 最後登錄時間? 不明, 當前和登錄時間一致
     */
    Timestamp lastTime;

    /**
     * ?不知道是幹什麼用的, 當前的值是1?
     */
    int zt;
}
