package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the QTGDB database table.
 * 
 */
@Entity
@Table(name="QTGDB")
public class Qtgdb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=250)
	private String bz;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="DisJE")
	private BigDecimal disJE;

	private int dwid;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="GDH", length=30)
	private String gdh;

	@Column(name="GDID")
	private int gdid;

	@Column(name="HJJE")
	private BigDecimal hjje;

	private Timestamp iDate;

	@Column(name="JF")
	private int jf;

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

	@Column(name="SGDH", length=30)
	private String sgdh;

	@Column(name="SKJE")
	private BigDecimal skje;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	@Column(name="YSJE")
	private BigDecimal ysje;

	@Column(name="ZFFS", length=30)
	private String zffs;

	@Column(name="ZLJE")
	private BigDecimal zlje;

	@Column(name="ZT")
	private int zt;

	public Qtgdb() {
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

	public String getGdh() {
		return this.gdh;
	}

	public void setGdh(String gdh) {
		this.gdh = gdh;
	}

	public int getGdid() {
		return this.gdid;
	}

	public void setGdid(int gdid) {
		this.gdid = gdid;
	}

	public BigDecimal getHjje() {
		return this.hjje;
	}

	public void setHjje(BigDecimal hjje) {
		this.hjje = hjje;
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

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

}