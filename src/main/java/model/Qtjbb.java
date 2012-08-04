package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the qtjbb database table.
 * 
 */
@Entity
@Table(name="qtjbb")
public class Qtjbb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private BigDecimal csje;

	private Timestamp dbdate;

	@Column(name="DH", length=30)
	private String dh;

	private int fdid;

	@Column(length=50)
	private String fdname;

	private Timestamp jbdate;

	@Column(length=30)
	private String mac;

	@Column(length=30)
	private String oper;

	@Column(length=30)
	private String posbh;

	private int posid;

	private BigDecimal skje;

	private BigDecimal sksl;

	private Timestamp sxdate;

	private int xh;

	private int ygid;

	private int zt;

	public Qtjbb() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getCsje() {
		return this.csje;
	}

	public void setCsje(BigDecimal csje) {
		this.csje = csje;
	}

	public Timestamp getDbdate() {
		return this.dbdate;
	}

	public void setDbdate(Timestamp dbdate) {
		this.dbdate = dbdate;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public int getFdid() {
		return this.fdid;
	}

	public void setFdid(int fdid) {
		this.fdid = fdid;
	}

	public String getFdname() {
		return this.fdname;
	}

	public void setFdname(String fdname) {
		this.fdname = fdname;
	}

	public Timestamp getJbdate() {
		return this.jbdate;
	}

	public void setJbdate(Timestamp jbdate) {
		this.jbdate = jbdate;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getPosbh() {
		return this.posbh;
	}

	public void setPosbh(String posbh) {
		this.posbh = posbh;
	}

	public int getPosid() {
		return this.posid;
	}

	public void setPosid(int posid) {
		this.posid = posid;
	}

	public BigDecimal getSkje() {
		return this.skje;
	}

	public void setSkje(BigDecimal skje) {
		this.skje = skje;
	}

	public BigDecimal getSksl() {
		return this.sksl;
	}

	public void setSksl(BigDecimal sksl) {
		this.sksl = sksl;
	}

	public Timestamp getSxdate() {
		return this.sxdate;
	}

	public void setSxdate(Timestamp sxdate) {
		this.sxdate = sxdate;
	}

	public int getXh() {
		return this.xh;
	}

	public void setXh(int xh) {
		this.xh = xh;
	}

	public int getYgid() {
		return this.ygid;
	}

	public void setYgid(int ygid) {
		this.ygid = ygid;
	}

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

}