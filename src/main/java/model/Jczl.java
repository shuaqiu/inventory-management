package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the JCZL database table.
 * 
 */
@Entity
@Table(name="JCZL")
public class Jczl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BH", length=50)
	private String bh;

	@Column(name="BZ", length=250)
	private String bz;

	@Column(name="LB", length=50)
	private String lb;

	@Column(name="Name", length=250)
	private String name;

	@Column(name="PYM", length=150)
	private String pym;

	@Column(name="SortID")
	private int sortID;

	public Jczl() {
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

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getLb() {
		return this.lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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