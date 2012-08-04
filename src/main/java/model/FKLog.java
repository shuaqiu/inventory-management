package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the FKLog database table.
 * 
 */
@Entity
@Table(name="FKLog")
public class FKLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BZ", length=150)
	private String bz;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="DJLX")
	private int djlx;

	@Column(length=30)
	private String DJName;

	@Column(name="DWID")
	private int dwid;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="FKDH", length=50)
	private String fkdh;

	@Column(name="FKJE")
	private BigDecimal fkje;

	@Column(name="FPBH", length=50)
	private String fpbh;

	@Column(name="FPLX", length=50)
	private String fplx;

	private Timestamp idate;

	private int isFP;

	@Column(name="LX", length=50)
	private String lx;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="SKJE")
	private BigDecimal skje;

	@Column(name="YE")
	private BigDecimal ye;

	@Column(name="YFJE")
	private BigDecimal yfje;

	@Column(name="YSJE")
	private BigDecimal ysje;

	@Column(name="ZHID")
	private int zhid;

	public FKLog() {
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

	public int getDjlx() {
		return this.djlx;
	}

	public void setDjlx(int djlx) {
		this.djlx = djlx;
	}

	public String getDJName() {
		return this.DJName;
	}

	public void setDJName(String DJName) {
		this.DJName = DJName;
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

	public String getFkdh() {
		return this.fkdh;
	}

	public void setFkdh(String fkdh) {
		this.fkdh = fkdh;
	}

	public BigDecimal getFkje() {
		return this.fkje;
	}

	public void setFkje(BigDecimal fkje) {
		this.fkje = fkje;
	}

	public String getFpbh() {
		return this.fpbh;
	}

	public void setFpbh(String fpbh) {
		this.fpbh = fpbh;
	}

	public String getFplx() {
		return this.fplx;
	}

	public void setFplx(String fplx) {
		this.fplx = fplx;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public int getIsFP() {
		return this.isFP;
	}

	public void setIsFP(int isFP) {
		this.isFP = isFP;
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

	public BigDecimal getSkje() {
		return this.skje;
	}

	public void setSkje(BigDecimal skje) {
		this.skje = skje;
	}

	public BigDecimal getYe() {
		return this.ye;
	}

	public void setYe(BigDecimal ye) {
		this.ye = ye;
	}

	public BigDecimal getYfje() {
		return this.yfje;
	}

	public void setYfje(BigDecimal yfje) {
		this.yfje = yfje;
	}

	public BigDecimal getYsje() {
		return this.ysje;
	}

	public void setYsje(BigDecimal ysje) {
		this.ysje = ysje;
	}

	public int getZhid() {
		return this.zhid;
	}

	public void setZhid(int zhid) {
		this.zhid = zhid;
	}

}