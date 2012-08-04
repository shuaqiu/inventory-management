package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CXFAMX database table.
 * 
 */
@Entity
@Table(name="CXFAMX")
public class Cxfamx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int canuse;

	@Column(name="FAID")
	private int faid;

	private BigDecimal je;

	@Column(name="JELX")
	private int jelx;

	@Column(name="SPLX")
	private int splx;

	@Column(name="ZKJE")
	private BigDecimal zkje;

	@Column(name="ZKLX")
	private int zklx;

	public Cxfamx() {
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

	public int getFaid() {
		return this.faid;
	}

	public void setFaid(int faid) {
		this.faid = faid;
	}

	public BigDecimal getJe() {
		return this.je;
	}

	public void setJe(BigDecimal je) {
		this.je = je;
	}

	public int getJelx() {
		return this.jelx;
	}

	public void setJelx(int jelx) {
		this.jelx = jelx;
	}

	public int getSplx() {
		return this.splx;
	}

	public void setSplx(int splx) {
		this.splx = splx;
	}

	public BigDecimal getZkje() {
		return this.zkje;
	}

	public void setZkje(BigDecimal zkje) {
		this.zkje = zkje;
	}

	public int getZklx() {
		return this.zklx;
	}

	public void setZklx(int zklx) {
		this.zklx = zklx;
	}

}