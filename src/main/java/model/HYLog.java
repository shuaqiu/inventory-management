package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the HYLog database table.
 * 
 */
@Entity
@Table(name="HYLog")
public class HYLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BZ", length=150)
	private String bz;

	@Column(name="CS")
	private int cs;

	@Column(name="CSXMBH", length=250)
	private String csxmbh;

	@Column(name="CSYE")
	private int csye;

	@Column(name="CZ", length=50)
	private String cz;

	private int CZFlag;

	@Column(name="CZJE")
	private BigDecimal czje;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	private Timestamp iDate;

	@Column(name="JF")
	private BigDecimal jf;

	@Column(name="JFJE")
	private BigDecimal jfje;

	@Column(name="JFYE")
	private BigDecimal jfye;

	@Column(name="KH", length=30)
	private String kh;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="SKJE")
	private BigDecimal skje;

	@Column(name="SYBID")
	private int sybid;

	@Column(name="XFJE")
	private BigDecimal xfje;

	@Column(name="YE")
	private BigDecimal ye;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	@Column(name="ZFFS", length=30)
	private String zffs;

	public HYLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public int getCs() {
		return this.cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	public String getCsxmbh() {
		return this.csxmbh;
	}

	public void setCsxmbh(String csxmbh) {
		this.csxmbh = csxmbh;
	}

	public int getCsye() {
		return this.csye;
	}

	public void setCsye(int csye) {
		this.csye = csye;
	}

	public String getCz() {
		return this.cz;
	}

	public void setCz(String cz) {
		this.cz = cz;
	}

	public int getCZFlag() {
		return this.CZFlag;
	}

	public void setCZFlag(int CZFlag) {
		this.CZFlag = CZFlag;
	}

	public BigDecimal getCzje() {
		return this.czje;
	}

	public void setCzje(BigDecimal czje) {
		this.czje = czje;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
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

	public Timestamp getIDate() {
		return this.iDate;
	}

	public void setIDate(Timestamp iDate) {
		this.iDate = iDate;
	}

	public BigDecimal getJf() {
		return this.jf;
	}

	public void setJf(BigDecimal jf) {
		this.jf = jf;
	}

	public BigDecimal getJfje() {
		return this.jfje;
	}

	public void setJfje(BigDecimal jfje) {
		this.jfje = jfje;
	}

	public BigDecimal getJfye() {
		return this.jfye;
	}

	public void setJfye(BigDecimal jfye) {
		this.jfye = jfye;
	}

	public String getKh() {
		return this.kh;
	}

	public void setKh(String kh) {
		this.kh = kh;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public BigDecimal getSkje() {
		return this.skje;
	}

	public void setSkje(BigDecimal skje) {
		this.skje = skje;
	}

	public int getSybid() {
		return this.sybid;
	}

	public void setSybid(int sybid) {
		this.sybid = sybid;
	}

	public BigDecimal getXfje() {
		return this.xfje;
	}

	public void setXfje(BigDecimal xfje) {
		this.xfje = xfje;
	}

	public BigDecimal getYe() {
		return this.ye;
	}

	public void setYe(BigDecimal ye) {
		this.ye = ye;
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

	public String getZffs() {
		return this.zffs;
	}

	public void setZffs(String zffs) {
		this.zffs = zffs;
	}

}