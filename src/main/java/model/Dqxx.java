package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DQXX database table.
 * 
 */
@Entity
@Table(name="DQXX")
public class Dqxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="Name", length=50)
	private String name;

	@Column(name="ParentID")
	private int parentID;

	@Column(name="PYM", length=50)
	private String pym;

	@Column(name="SortID")
	private int sortID;

	public Dqxx() {
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