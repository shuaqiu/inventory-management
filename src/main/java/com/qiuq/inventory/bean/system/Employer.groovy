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
 * 員工信息
 * @author qiushaohua 2012-7-7
 * @version 0.0.1
 */
@Entity
@Table(name="YGXX")
class Employer implements Serializable{
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    /**
     * 編號
     */
    @Column(name="BH", length=30)
    String serialNumber;

    /**
     * 姓名
     */
    @Column(name="Name", length=30)
    String name;

    /**
     * 性別
     */
    @Column(name="Sex", length=6)
    String sex;

    /**
     * 拼音碼: 拼音的首字母
     */
    @Column(name="PYM", length=30)
    String firstPinyin;

    /**
     * 部門ID --> Department
     */
    @Column(name="BMID")
    int departmentId;

    /**
     * 部門名稱 --> Department
     */
    @Column(name="BMName",length=50)
    String departmentName;

    /**
     * 生日
     */
    @Column(name="BirthDay")
    Timestamp birthday;

    /**
     * 入職時間
     */
    @Column(name="EmployedDate")
    Timestamp employedDate;

    /**
     * 身份證號碼
     */
    @Column(name="CardNo", length=30)
    String cardNo;

    /**
     * 學歷
     */
    @Column(name="Edu", length=30)
    String edu;

    /**
     * 手機號碼
     */
    @Column(name="Mobile", length=30)
    String mobile;

    /**
     * 電話
     */
    @Column(name="Tel", length=30)
    String tel;

    /**
     * 地址
     */
    @Column(name="Add", length=150)
    String address;

    /**
     * 工種/崗位
     */
    @Column(name="Duty", length=30)
    String duty;

    /**
     * 職位
     */
    @Column(name="Pos", length=30)
    String position;

    /**
     * 是否業務員
     * <li>1: 表示業務員
     * <li>0(或者為null): 表示不是業務員
     */
    @Column(name="isYWY")
    int salesman;

    /**
     * 是否離職:
     * <li>1: 表示已離職
     * <li>0(或者為null): 表示未離職
     */
    @Column(name="canUse")
    int disabled;

    // 以下的字段沒有使用
<<<<<<< HEAD
=======
    //
>>>>>>> 629e22ea64b66d1fb29ef11f7fd253050089a4f1
    //    @Column(name="BirthDayFlag")
    //    int birthDayFlag;
    //
    //    Timestamp agreeYear;
    //
    //    int allfduse;
    //
    //    @Column(name="BZ", length=150)
    //    String bz;
    //
    //    @Column(name="Col", length=50)
    //    String col;
    //
    //    @Column(name="Email", length=50)
    //    String email;
    //
    //    @Column(name="FDID")
    //    int fdid;
    //
    //    @Column(length=50)
    //    String FDName;
    //
    //    @Column(name="Fer", length=30)
    //    String fer;
    //
    //    @Column(name="Marray", length=30)
    //    String marray;
    //
    //    @Column(name="Nat", length=30)
    //    String nat;
    //
    //    @Column(name="Nav", length=30)
    //    String nav;
    //
    //    int sortID;
    //
    //    @Column(name="TCFAID")
    //    int tcfaid;
    //
    //    @Column(name="ZY", length=50)
    //    String zy;
}
