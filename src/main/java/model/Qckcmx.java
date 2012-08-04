package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the qckcmx database table.
 * 
 */
@Entity
@Table(name="qckcmx")
public class Qckcmx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int ckid;

	private int fdid;

	private int flag;

	private BigDecimal kcdj;

	private BigDecimal kcje;

	private BigDecimal kcsl;

	private Timestamp rqzdy1;

	private Timestamp rqzdy2;

	private int spid;

	private BigDecimal szzdy1;

	private BigDecimal szzdy2;

	@Column(length=50)
	private String zfzdy1;

	@Column(length=50)
	private String zfzdy2;

	public Qckcmx() {
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

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
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

	public Timestamp getRqzdy1() {
		return this.rqzdy1;
	}

	public void setRqzdy1(Timestamp rqzdy1) {
		this.rqzdy1 = rqzdy1;
	}

	public Timestamp getRqzdy2() {
		return this.rqzdy2;
	}

	public void setRqzdy2(Timestamp rqzdy2) {
		this.rqzdy2 = rqzdy2;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public BigDecimal getSzzdy1() {
		return this.szzdy1;
	}

	public void setSzzdy1(BigDecimal szzdy1) {
		this.szzdy1 = szzdy1;
	}

	public BigDecimal getSzzdy2() {
		return this.szzdy2;
	}

	public void setSzzdy2(BigDecimal szzdy2) {
		this.szzdy2 = szzdy2;
	}

	public String getZfzdy1() {
		return this.zfzdy1;
	}

	public void setZfzdy1(String zfzdy1) {
		this.zfzdy1 = zfzdy1;
	}

	public String getZfzdy2() {
		return this.zfzdy2;
	}

	public void setZfzdy2(String zfzdy2) {
		this.zfzdy2 = zfzdy2;
	}

}