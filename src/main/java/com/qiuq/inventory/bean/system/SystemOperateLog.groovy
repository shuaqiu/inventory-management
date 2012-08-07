package com.qiuq.inventory.bean.system

import java.sql.Timestamp

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 系統操作日誌, 用於記錄用戶的登錄, 權限的修改過等等
 * The persistent class for the SYSLog database table.
 *
 */
@Entity
@Table(name="SYSLog")
class SystemOperateLog implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 操作時間
     */
    @Column(name="idate")
    Timestamp operateTime;

    /**
     * 操作用戶, 直接記錄用戶名
     */
    @Column(name="Oper", length=30)
    String operateUsername;

    /**
     * 操作類型:
     * <li>登錄
     * <li>操作員與權限
     * <li>退出
     * <li>...?
     */
    @Column(name="OpType", length=100)
    String operateType;

    /**
     * 操作內容說明
     */
    @Column(name="Note", length=250)
    String note;

    // 以下的字段沒有使用
    //    @Column(name="OpIP", length=30)
    //     String opIP;
    //
    //    @Column(name="FDID")
    //      int fdid;
    //
    //     @Column(length=50)
    //      String FDName;
}
