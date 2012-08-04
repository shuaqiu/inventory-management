package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HWXX database table.
 * 
 */
@Entity
@Table(name="HWXX")
public class Hwxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BH", length=50)
	private String bh;

	@Column(name="BMID")
	private int bmid;

	private int canUse;

	@Column(name="CKID")
	private int ckid;

	private int id;

	@Column(name="Name", length=150)
	private String name;

	@Column(name="ParentID")
	private int parentID;

	@Column(name="PYM", length=50)
	private String pym;

	private int sortID;

	public Hwxx() {
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public int getBmid() {
		return this.bmid;
	}

	public void setBmid(int bmid) {
		this.bmid = bmid;
	}

	public int getCanUse() {
		return this.canUse;
	}

	public void setCanUse(int canUse) {
		this.canUse = canUse;
	}

	public int getCkid() {
		return this.ckid;
	}

	public void setCkid(int ckid) {
		this.ckid = ckid;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentID() {
		return this.parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public String getPym() {
		return this.pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

}