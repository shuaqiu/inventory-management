package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the DJJ database table.
 * 
 */
@Entity
@Table(name="DJJ")
public class Djj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BH", length=30)
	private String bh;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	private Timestamp fxdate;

	@Column(name="MZ")
	private BigDecimal mz;

	private Timestamp sydate;

	private int xz;

	@Column(length=30)
	private String xzname;

	private Timestamp yxdate;

	@Column(length=30)
	private String zt;

	public Djj() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
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

	public Timestamp getFxdate() {
		return this.fxdate;
	}

	public void setFxdate(Timestamp fxdate) {
		this.fxdate = fxdate;
	}

	public BigDecimal getMz() {
		return this.mz;
	}

	public void setMz(BigDecimal mz) {
		this.mz = mz;
	}

	public Timestamp getSydate() {
		return this.sydate;
	}

	public void setSydate(Timestamp sydate) {
		this.sydate = sydate;
	}

	public int getXz() {
		return this.xz;
	}

	public void setXz(int xz) {
		this.xz = xz;
	}

	public String getXzname() {
		return this.xzname;
	}

	public void setXzname(String xzname) {
		this.xzname = xzname;
	}

	public Timestamp getYxdate() {
		return this.yxdate;
	}

	public void setYxdate(Timestamp yxdate) {
		this.yxdate = yxdate;
	}

	public String getZt() {
		return this.zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

}