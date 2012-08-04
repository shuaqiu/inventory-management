package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the TCFA database table.
 * 
 */
@Entity
@Table(name="TCFA")
public class Tcfa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int canuse;

	@Column(name="DBJE")
	private BigDecimal dbje;

	private BigDecimal dbje2;

	private BigDecimal dbje3;

	private Timestamp idate;

	@Column(length=30)
	private String name;

	private int sortid;

	@Column(name="TC")
	private BigDecimal tc;

	@Column(name="TCJB")
	private int tcjb;

	@Column(name="TCLX")
	private int tclx;

	private int useDBJE;

	public Tcfa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCanuse() {
		return this.canuse;
	}

	public void setCanuse(int canuse) {
		this.canuse = canuse;
	}

	public BigDecimal getDbje() {
		return this.dbje;
	}

	public void setDbje(BigDecimal dbje) {
		this.dbje = dbje;
	}

	public BigDecimal getDbje2() {
		return this.dbje2;
	}

	public void setDbje2(BigDecimal dbje2) {
		this.dbje2 = dbje2;
	}

	public BigDecimal getDbje3() {
		return this.dbje3;
	}

	public void setDbje3(BigDecimal dbje3) {
		this.dbje3 = dbje3;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSortid() {
		return this.sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public BigDecimal getTc() {
		return this.tc;
	}

	public void setTc(BigDecimal tc) {
		this.tc = tc;
	}

	public int getTcjb() {
		return this.tcjb;
	}

	public void setTcjb(int tcjb) {
		this.tcjb = tcjb;
	}

	public int getTclx() {
		return this.tclx;
	}

	public void setTclx(int tclx) {
		this.tclx = tclx;
	}

	public int getUseDBJE() {
		return this.useDBJE;
	}

	public void setUseDBJE(int useDBJE) {
		this.useDBJE = useDBJE;
	}

}