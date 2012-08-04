package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SYSCS database table.
 * 
 */
@Entity
@Table(name="SYSCS")
public class Sysc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=150)
	private String CSCaption;

	@Column(name="CSLB", length=50)
	private String cslb;

	@Column(name="CSMC", length=50)
	private String csmc;

	@Column(name="ZFCS", length=250)
	private String zfcs;

	@Column(name="ZXCS")
	private int zxcs;

	public Sysc() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCSCaption() {
		return this.CSCaption;
	}

	public void setCSCaption(String CSCaption) {
		this.CSCaption = CSCaption;
	}

	public String getCslb() {
		return this.cslb;
	}

	public void setCslb(String cslb) {
		this.cslb = cslb;
	}

	public String getCsmc() {
		return this.csmc;
	}

	public void setCsmc(String csmc) {
		this.csmc = csmc;
	}

	public String getZfcs() {
		return this.zfcs;
	}

	public void setZfcs(String zfcs) {
		this.zfcs = zfcs;
	}

	public int getZxcs() {
		return this.zxcs;
	}

	public void setZxcs(int zxcs) {
		this.zxcs = zxcs;
	}

}