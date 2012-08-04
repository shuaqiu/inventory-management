package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ZHLog database table.
 * 
 */
@Entity
@Table(name="ZHLog")
public class ZHLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=250)
	private String bz;

	@Column(length=50)
	private String dh;

	private int djlx;

	@Column(name="DWID")
	private int dwid;

	private int fdid;

	@Column(name="FKJE")
	private BigDecimal fkje;

	private Timestamp idate;

	@Column(name="LX", length=50)
	private String lx;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="SKJE")
	private BigDecimal skje;

	@Column(name="YE")
	private BigDecimal ye;

	@Column(name="ZHID")
	private int zhid;

	@Column(length=30)
	private String ZHName;

	@Column(name="ZY", length=150)
	private String zy;

	public ZHLog() {
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

	public BigDecimal getFkje() {
		return this.fkje;
	}

	public void setFkje(BigDecimal fkje) {
		this.fkje = fkje;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
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

	public int getZhid() {
		return this.zhid;
	}

	public void setZhid(int zhid) {
		this.zhid = zhid;
	}

	public String getZHName() {
		return this.ZHName;
	}

	public void setZHName(String ZHName) {
		this.ZHName = ZHName;
	}

	public String getZy() {
		return this.zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}

}