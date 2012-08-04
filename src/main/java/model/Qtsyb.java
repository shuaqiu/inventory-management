package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the QTSYB database table.
 * 
 */
@Entity
@Table(name="QTSYB")
public class Qtsyb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BZ", length=150)
	private String bz;

	@Column(length=30)
	private String bz2;

	@Column(name="DH", length=30)
	private String dh;

	private int dwid;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	private Timestamp idate;

	@Column(name="JE")
	private BigDecimal je;

	@Column(name="KH", length=30)
	private String kh;

	@Column(name="LX", length=50)
	private String lx;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="PosBH", length=30)
	private String posBH;

	@Column(name="PosID")
	private int posID;

	private int ygid;

	@Column(name="ZFFS", length=30)
	private String zffs;

	public Qtsyb() {
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

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
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

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public BigDecimal getJe() {
		return this.je;
	}

	public void setJe(BigDecimal je) {
		this.je = je;
	}

	public String getKh() {
		return this.kh;
	}

	public void setKh(String kh) {
		this.kh = kh;
	}

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
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

	public int getYgid() {
		return this.ygid;
	}

	public void setYgid(int ygid) {
		this.ygid = ygid;
	}

	public String getZffs() {
		return this.zffs;
	}

	public void setZffs(String zffs) {
		this.zffs = zffs;
	}

}