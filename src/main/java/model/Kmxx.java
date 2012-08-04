package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the KMXX database table.
 * 
 */
@Entity
@Table(name="KMXX")
public class Kmxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=150)
	private String bz;

	@Column(length=30)
	private String dh;

	private int fdid;

	private Timestamp idate;

	private BigDecimal je;

	@Column(length=30)
	private String kmcode;

	@Column(length=30)
	private String XMCode;

	public Kmxx() {
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

	public int getFdid() {
		return this.fdid;
	}

	public void setFdid(int fdid) {
		this.fdid = fdid;
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

	public String getKmcode() {
		return this.kmcode;
	}

	public void setKmcode(String kmcode) {
		this.kmcode = kmcode;
	}

	public String getXMCode() {
		return this.XMCode;
	}

	public void setXMCode(String XMCode) {
		this.XMCode = XMCode;
	}

}