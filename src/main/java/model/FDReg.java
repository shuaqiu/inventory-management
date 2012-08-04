package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FDReg database table.
 * 
 */
@Entity
@Table(name="FDReg")
public class FDReg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="FDBH", length=30)
	private String fdbh;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="IP", length=30)
	private String ip;

	@Column(name="Mac", length=50)
	private String mac;

	@Column(name="RegDate")
	private Timestamp regDate;

	public FDReg() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFdbh() {
		return this.fdbh;
	}

	public void setFdbh(String fdbh) {
		this.fdbh = fdbh;
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

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

}