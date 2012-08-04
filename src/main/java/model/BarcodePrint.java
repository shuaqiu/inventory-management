package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BarcodePrint database table.
 * 
 */
@Entity
@Table(name="BarcodePrint")
public class BarcodePrint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CS")
	private BigDecimal cs;

	@Column(name="Mac", length=30)
	private String mac;

	@Column(name="SPID")
	private int spid;

	@Column(name="ZFZDY1", length=30)
	private String zfzdy1;

	@Column(name="ZFZDY2", length=30)
	private String zfzdy2;

	public BarcodePrint() {
	}

	public BigDecimal getCs() {
		return this.cs;
	}

	public void setCs(BigDecimal cs) {
		this.cs = cs;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public String getZfzdy1() {
		return this.zfzdy1;
	}

	public void setZfzdy1(String zfzdy1) {
		this.zfzdy1 = zfzdy1;
	}

	public String getZfzdy2() {
		return this.zfzdy2;
	}

	public void setZfzdy2(String zfzdy2) {
		this.zfzdy2 = zfzdy2;
	}

}