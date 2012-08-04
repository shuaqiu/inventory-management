package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MDPos database table.
 * 
 */
@Entity
@Table(name="MDPos")
public class MDPo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BH", length=50)
	private String bh;

	private int canUse;

	@Column(name="CKID")
	private int ckid;

	@Column(length=50)
	private String CKName;

	@Column(name="MDID")
	private int mdid;

	@Column(length=50)
	private String MDName;

	@Column(name="Name", length=50)
	private String name;

	@Column(name="Pos", length=50)
	private String pos;

	private int sortID;

	public MDPo() {
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

	public String getCKName() {
		return this.CKName;
	}

	public void setCKName(String CKName) {
		this.CKName = CKName;
	}

	public int getMdid() {
		return this.mdid;
	}

	public void setMdid(int mdid) {
		this.mdid = mdid;
	}

	public String getMDName() {
		return this.MDName;
	}

	public void setMDName(String MDName) {
		this.MDName = MDName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPos() {
		return this.pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

}