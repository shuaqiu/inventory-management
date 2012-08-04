package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FDXX database table.
 * 
 */
@Entity
@Table(name="FDXX")
public class Fdxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="Address", length=150)
	private String address;

	@Column(name="BH", length=30)
	private String bh;

	private int canEditHY;

	private int canEditSp;

	@Column(name="CanUse")
	private int canUse;

	@Column(name="Fax", length=30)
	private String fax;

	private int isReg;

	private int lsType;

	@Column(length=30)
	private String lx;

	@Column(name="LXR", length=30)
	private String lxr;

	@Column(name="Name", length=50)
	private String name;

	private int parentid;

	@Column(name="PYM", length=30)
	private String pym;

	@Column(name="RegDate")
	private Timestamp regDate;

	private int shareCZ;

	private int shareJF;

	private int sortid;

	@Column(name="Tel", length=30)
	private String tel;

	@Column(name="UpdateFlag")
	private int updateFlag;

	public Fdxx() {
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

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public int getCanEditHY() {
		return this.canEditHY;
	}

	public void setCanEditHY(int canEditHY) {
		this.canEditHY = canEditHY;
	}

	public int getCanEditSp() {
		return this.canEditSp;
	}

	public void setCanEditSp(int canEditSp) {
		this.canEditSp = canEditSp;
	}

	public int getCanUse() {
		return this.canUse;
	}

	public void setCanUse(int canUse) {
		this.canUse = canUse;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public int getIsReg() {
		return this.isReg;
	}

	public void setIsReg(int isReg) {
		this.isReg = isReg;
	}

	public int getLsType() {
		return this.lsType;
	}

	public void setLsType(int lsType) {
		this.lsType = lsType;
	}

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentid() {
		return this.parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public String getPym() {
		return this.pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getShareCZ() {
		return this.shareCZ;
	}

	public void setShareCZ(int shareCZ) {
		this.shareCZ = shareCZ;
	}

	public int getShareJF() {
		return this.shareJF;
	}

	public void setShareJF(int shareJF) {
		this.shareJF = shareJF;
	}

	public int getSortid() {
		return this.sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getUpdateFlag() {
		return this.updateFlag;
	}

	public void setUpdateFlag(int updateFlag) {
		this.updateFlag = updateFlag;
	}

}