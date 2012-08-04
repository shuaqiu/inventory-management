package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the QCKC database table.
 * 
 */
@Entity
@Table(name="QCKC")
public class Qckc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="CKID")
	private int ckid;

	private int fdid;

	@Column(name="KCDJ")
	private BigDecimal kcdj;

	@Column(name="KCJE")
	private BigDecimal kcje;

	@Column(name="KCSL")
	private BigDecimal kcsl;

	@Column(name="SPID")
	private int spid;

	public Qckc() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCkid() {
		return this.ckid;
	}

	public void setCkid(int ckid) {
		this.ckid = ckid;
	}

	public int getFdid() {
		return this.fdid;
	}

	public void setFdid(int fdid) {
		this.fdid = fdid;
	}

	public BigDecimal getKcdj() {
		return this.kcdj;
	}

	public void setKcdj(BigDecimal kcdj) {
		this.kcdj = kcdj;
	}

	public BigDecimal getKcje() {
		return this.kcje;
	}

	public void setKcje(BigDecimal kcje) {
		this.kcje = kcje;
	}

	public BigDecimal getKcsl() {
		return this.kcsl;
	}

	public void setKcsl(BigDecimal kcsl) {
		this.kcsl = kcsl;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

}