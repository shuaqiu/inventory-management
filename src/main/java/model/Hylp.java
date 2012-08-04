package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HYLP database table.
 * 
 */
@Entity
@Table(name="HYLP")
public class Hylp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private BigDecimal jf;

	@Column(length=50)
	private String SPBarcode;

	@Column(name="SPBH", length=50)
	private String spbh;

	@Column(name="SPID")
	private int spid;

	@Column(length=150)
	private String SPName;

	@Column(length=20)
	private String spunit;

	@Column(length=30)
	private String zfzdy1;

	@Column(length=30)
	private String zfzdy2;

	public Hylp() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getJf() {
		return this.jf;
	}

	public void setJf(BigDecimal jf) {
		this.jf = jf;
	}

	public String getSPBarcode() {
		return this.SPBarcode;
	}

	public void setSPBarcode(String SPBarcode) {
		this.SPBarcode = SPBarcode;
	}

	public String getSpbh() {
		return this.spbh;
	}

	public void setSpbh(String spbh) {
		this.spbh = spbh;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public String getSPName() {
		return this.SPName;
	}

	public void setSPName(String SPName) {
		this.SPName = SPName;
	}

	public String getSpunit() {
		return this.spunit;
	}

	public void setSpunit(String spunit) {
		this.spunit = spunit;
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