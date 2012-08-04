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
@Table(name="YGXX")
class UserGroup  implements Serializable{
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    int id;

    @Column(name="Add", length=150)
    String add;

    Timestamp agreeYear;

    int allfduse;

    @Column(name="BH", length=30)
    String bh;

    @Column(name="BirthDay")
    Timestamp birthDay;

    @Column(name="BirthDayFlag")
    int birthDayFlag;

    @Column(name="BMID")
    int bmid;

    @Column(length=50)
    String BMName;

    @Column(name="BZ", length=150)
    String bz;

    int canUse;

    @Column(name="CardNo", length=30)
    String cardNo;

    @Column(name="Col", length=50)
    String col;

    @Column(name="Duty", length=30)
    String duty;

    @Column(name="Edu", length=30)
    String edu;

    @Column(name="Email", length=50)
    String email;

    @Column(name="EmployedDate")
    Timestamp employedDate;

    @Column(name="FDID")
    int fdid;

    @Column(length=50)
    String FDName;

    @Column(name="Fer", length=30)
    String fer;

    int isYWY;

    @Column(name="Marray", length=30)
    String marray;

    @Column(name="Mobile", length=30)
    String mobile;

    @Column(name="Name", length=30)
    String name;

    @Column(name="Nat", length=30)
    String nat;

    @Column(name="Nav", length=30)
    String nav;

    @Column(name="Pos", length=30)
    String pos;

    @Column(name="PYM", length=30)
    String pym;

    @Column(name="Sex", length=6)
    String sex;

    int sortID;

    @Column(name="TCFAID")
    int tcfaid;

    @Column(name="Tel", length=30)
    String tel;

    @Column(name="ZY", length=50)
    String zy;
}
