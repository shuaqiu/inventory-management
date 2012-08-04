package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the jmginfo database table.
 * 
 */
@Entity
@Table(name="jmginfo")
public class Jmginfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=50)
	private String bh;

	@Column(length=50)
	private String dh;

	private int djmxid;

	private Timestamp fhdate;

	private int fhid;

	private Timestamp idate;

	@Column(length=30)
	private String lx;

	private int zt;

	public Jmginfo() {
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

	public int getDjmxid() {
		return this.djmxid;
	}

	public void setDjmxid(int djmxid) {
		this.djmxid = djmxid;
	}

	public Timestamp getFhdate() {
		return this.fhdate;
	}

	public void setFhdate(Timestamp fhdate) {
		this.fhdate = fhdate;
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

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

}