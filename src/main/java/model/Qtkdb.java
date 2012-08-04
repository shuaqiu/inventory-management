package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the QTKDB database table.
 * 
 */
@Entity
@Table(name="QTKDB")
public class Qtkdb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=150)
	private String bz;

	@Column(length=30)
	private String bz2;

	@Column(name="CKID")
	private int ckid;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="DisJE")
	private BigDecimal disJE;

	private int dwid;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="HJJE")
	private BigDecimal hjje;

	private BigDecimal HJNum;

	private Timestamp iDate;

	@Column(name="JF")
	private int jf;

	private Timestamp kddate;

	@Column(name="KH", length=30)
	private String kh;

	@Column(name="MLJE")
	private BigDecimal mlje;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="PosBH", length=30)
	private String posBH;

	@Column(name="PosID")
	private int posID;

	private int printcs;

	@Column(name="SGDH", length=30)
	private String sgdh;

	@Column(name="SKJE")
	private BigDecimal skje;

	@Column(name="THDH", length=30)
	private String thdh;

	@Column(name="XH")
	private int xh;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	@Column(name="YSJE")
	private BigDecimal ysje;

	@Column(name="ZFFS", length=200)
	private String zffs;

	@Column(name="ZLJE")
	private BigDecimal zlje;

	public Qtkdb() {
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

	public String getBz2() {
		return this.bz2;
	}

	public void setBz2(String bz2) {
		this.bz2 = bz2;
	}

	public int getCkid() {
		return this.ckid;
	}

	public void setCkid(int ckid) {
		this.ckid = ckid;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public BigDecimal getDisJE() {
		return this.disJE;
	}

	public void setDisJE(BigDecimal disJE) {
		this.disJE = disJE;
	}

	public int getDwid() {
		return this.dwid;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
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

	public BigDecimal getHjje() {
		return this.hjje;
	}

	public void setHjje(BigDecimal hjje) {
		this.hjje = hjje;
	}

	public BigDecimal getHJNum() {
		return this.HJNum;
	}

	public void setHJNum(BigDecimal HJNum) {
		this.HJNum = HJNum;
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

	public Timestamp getKddate() {
		return this.kddate;
	}

	public void setKddate(Timestamp kddate) {
		this.kddate = kddate;
	}

	public String getKh() {
		return this.kh;
	}

	public void setKh(String kh) {
		this.kh = kh;
	}

	public BigDecimal getMlje() {
		return this.mlje;
	}

	public void setMlje(BigDecimal mlje) {
		this.mlje = mlje;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getPosBH() {
		return this.posBH;
	}

	public void setPosBH(String posBH) {
		this.posBH = posBH;
	}

	public int getPosID() {
		return this.posID;
	}

	public void setPosID(int posID) {
		this.posID = posID;
	}

	public int getPrintcs() {
		return this.printcs;
	}

	public void setPrintcs(int printcs) {
		this.printcs = printcs;
	}

	public String getSgdh() {
		return this.sgdh;
	}

	public void setSgdh(String sgdh) {
		this.sgdh = sgdh;
	}

	public BigDecimal getSkje() {
		return this.skje;
	}

	public void setSkje(BigDecimal skje) {
		this.skje = skje;
	}

	public String getThdh() {
		return this.thdh;
	}

	public void setThdh(String thdh) {
		this.thdh = thdh;
	}

	public int getXh() {
		return this.xh;
	}

	public void setXh(int xh) {
		this.xh = xh;
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

	public BigDecimal getYsje() {
		return this.ysje;
	}

	public void setYsje(BigDecimal ysje) {
		this.ysje = ysje;
	}

	public String getZffs() {
		return this.zffs;
	}

	public void setZffs(String zffs) {
		this.zffs = zffs;
	}

	public BigDecimal getZlje() {
		return this.zlje;
	}

	public void setZlje(BigDecimal zlje) {
		this.zlje = zlje;
	}

}