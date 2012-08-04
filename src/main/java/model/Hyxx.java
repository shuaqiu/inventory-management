package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the HYXX database table.
 * 
 */
@Entity
@Table(name="HYXX")
public class Hyxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="Address", length=150)
	private String address;

	@Column(name="BirthDay")
	private Timestamp birthDay;

	@Column(name="BirthDayFlag")
	private int birthDayFlag;

	@Column(length=250)
	private String bz;

	@Column(name="CardNo", length=30)
	private String cardNo;

	private Timestamp dqDate;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="HylbID")
	private int hylbID;

	@Column(name="HylbName", length=50)
	private String hylbName;

	private Timestamp iDate;

	@Column(name="JF")
	private int jf;

	@Column(name="KH", length=30)
	private String kh;

	@Column(name="LastXFDate")
	private Timestamp lastXFDate;

	@Column(name="LJJF")
	private int ljjf;

	@Column(name="Mobile", length=30)
	private String mobile;

	@Column(name="Name", length=30)
	private String name;

	@Column(length=50)
	private String oldkh;

	@Column(name="Psw", length=50)
	private String psw;

	@Column(length=30)
	private String pym;

	@Column(name="Sex", length=10)
	private String sex;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	@Column(name="ZJE")
	private BigDecimal zje;

	@Column(name="ZT")
	private int zt;

	public Hyxx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(Timestamp birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthDayFlag() {
		return this.birthDayFlag;
	}

	public void setBirthDayFlag(int birthDayFlag) {
		this.birthDayFlag = birthDayFlag;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Timestamp getDqDate() {
		return this.dqDate;
	}

	public void setDqDate(Timestamp dqDate) {
		this.dqDate = dqDate;
	}

	public int getFdid() {
		return this.fdid;
	}

	public void setFdid(int fdid) {
		this.fdid = fdid;
	}

	public String getFDName() {
		return this.FDName;
	}

	public void setFDName(String FDName) {
		this.FDName = FDName;
	}

	public int getHylbID() {
		return this.hylbID;
	}

	public void setHylbID(int hylbID) {
		this.hylbID = hylbID;
	}

	public String getHylbName() {
		return this.hylbName;
	}

	public void setHylbName(String hylbName) {
		this.hylbName = hylbName;
	}

	public Timestamp getIDate() {
		return this.iDate;
	}

	public void setIDate(Timestamp iDate) {
		this.iDate = iDate;
	}

	public int getJf() {
		return this.jf;
	}

	public void setJf(int jf) {
		this.jf = jf;
	}

	public String getKh() {
		return this.kh;
	}

	public void setKh(String kh) {
		this.kh = kh;
	}

	public Timestamp getLastXFDate() {
		return this.lastXFDate;
	}

	public void setLastXFDate(Timestamp lastXFDate) {
		this.lastXFDate = lastXFDate;
	}

	public int getLjjf() {
		return this.ljjf;
	}

	public void setLjjf(int ljjf) {
		this.ljjf = ljjf;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOldkh() {
		return this.oldkh;
	}

	public void setOldkh(String oldkh) {
		this.oldkh = oldkh;
	}

	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getPym() {
		return this.pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getYgid() {
		return this.ygid;
	}

	public void setYgid(int ygid) {
		this.ygid = ygid;
	}

	public String getYGName() {
		return this.YGName;
	}

	public void setYGName(String YGName) {
		this.YGName = YGName;
	}

	public BigDecimal getZje() {
		return this.zje;
	}

	public void setZje(BigDecimal zje) {
		this.zje = zje;
	}

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

}