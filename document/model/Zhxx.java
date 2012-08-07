package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ZHXX database table.
 * 
 */
@Entity
@Table(name="ZHXX")
public class Zhxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BZ", length=150)
	private String bz;

	private int canUse;

	@Column(name="Flag")
	private int flag;

	@Column(name="Name", length=50)
	private String name;

	@Column(name="PYM", length=50)
	private String pym;

	@Column(name="QCYE")
	private BigDecimal qcye;

	@Column(name="SortID")
	private int sortID;

	public Zhxx() {
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

	public int getCanUse() {
		return this.canUse;
	}

	public void setCanUse(int canUse) {
		this.canUse = canUse;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
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

	public BigDecimal getQcye() {
		return this.qcye;
	}

	public void setQcye(BigDecimal qcye) {
		this.qcye = qcye;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

}