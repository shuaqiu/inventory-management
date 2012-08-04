package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CXFA_TJMX database table.
 * 
 */
@Entity
@Table(name="CXFA_TJMX")
public class CxfaTjmx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="FAID")
	private int faid;

	private int spid;

	private BigDecimal tj;

	@Column(length=30)
	private String zfzdy1;

	@Column(length=30)
	private String zfzdy2;

	public CxfaTjmx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFaid() {
		return this.faid;
	}

	public void setFaid(int faid) {
		this.faid = faid;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public BigDecimal getTj() {
		return this.tj;
	}

	public void setTj(BigDecimal tj) {
		this.tj = tj;
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