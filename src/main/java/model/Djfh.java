package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the DJFH database table.
 * 
 */
@Entity
@Table(name="DJFH")
public class Djfh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=250)
	private String bz;

	@Column(name="DH", length=50)
	private String dh;

	@Column(name="FHDH", length=50)
	private String fhdh;

	@Column(name="FHFS", length=50)
	private String fhfs;

	@Column(name="FHID")
	private int fhid;

	private Timestamp idate;

	@Column(length=50)
	private String oper;

	public Djfh() {
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

	public String getFhdh() {
		return this.fhdh;
	}

	public void setFhdh(String fhdh) {
		this.fhdh = fhdh;
	}

	public String getFhfs() {
		return this.fhfs;
	}

	public void setFhfs(String fhfs) {
		this.fhfs = fhfs;
	}

	public int getFhid() {
		return this.fhid;
	}

	public void setFhid(int fhid) {
		this.fhid = fhid;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

}