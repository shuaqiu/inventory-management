package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the djmxbarcode database table.
 * 
 */
@Entity
@Table(name="djmxbarcode")
public class Djmxbarcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=50)
	private String barcodemx;

	@Column(length=50)
	private String dh;

	private int djmxid;

	private int fdid;

	private BigDecimal sl;

	private int spid;

	@Column(length=50)
	private String zfzdy1;

	@Column(length=50)
	private String zfzdy2;

	public Djmxbarcode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarcodemx() {
		return this.barcodemx;
	}

	public void setBarcodemx(String barcodemx) {
		this.barcodemx = barcodemx;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public int getDjmxid() {
		return this.djmxid;
	}

	public void setDjmxid(int djmxid) {
		this.djmxid = djmxid;
	}

	public int getFdid() {
		return this.fdid;
	}

	public void setFdid(int fdid) {
		this.fdid = fdid;
	}

	public BigDecimal getSl() {
		return this.sl;
	}

	public void setSl(BigDecimal sl) {
		this.sl = sl;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
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