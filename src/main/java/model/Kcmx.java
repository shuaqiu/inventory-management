package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the KCMX database table.
 * 
 */
@Entity
@Table(name="KCMX")
public class Kcmx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int ckid;

	private int iscl;

	private BigDecimal je;

	private BigDecimal num;

	private BigDecimal price;

	@Column(name="RQZDY1")
	private Timestamp rqzdy1;

	@Column(name="RQZDY2")
	private Timestamp rqzdy2;

	private int spid;

	@Column(name="SZZDY1")
	private BigDecimal szzdy1;

	@Column(name="SZZDY2")
	private BigDecimal szzdy2;

	@Column(length=50)
	private String zfzdy1;

	@Column(length=50)
	private String zfzdy2;

	public Kcmx() {
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

	public int getIscl() {
		return this.iscl;
	}

	public void setIscl(int iscl) {
		this.iscl = iscl;
	}

	public BigDecimal getJe() {
		return this.je;
	}

	public void setJe(BigDecimal je) {
		this.je = je;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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