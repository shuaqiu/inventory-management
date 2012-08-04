package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the QTJBMXB database table.
 * 
 */
@Entity
@Table(name="QTJBMXB")
public class Qtjbmxb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private BigDecimal cyje;

	@Column(name="DH", length=30)
	private String dh;

	private int issj;

	@Column(name="JBID")
	private int jbid;

	private BigDecimal je;

	@Column(length=30)
	private String posbh;

	private int posid;

	private Timestamp sjdate;

	@Column(length=30)
	private String sjdh;

	private BigDecimal sjje;

	@Column(length=30)
	private String zffs;

	public Qtjbmxb() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getCyje() {
		return this.cyje;
	}

	public void setCyje(BigDecimal cyje) {
		this.cyje = cyje;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public int getIssj() {
		return this.issj;
	}

	public void setIssj(int issj) {
		this.issj = issj;
	}

	public int getJbid() {
		return this.jbid;
	}

	public void setJbid(int jbid) {
		this.jbid = jbid;
	}

	public BigDecimal getJe() {
		return this.je;
	}

	public void setJe(BigDecimal je) {
		this.je = je;
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

	public Timestamp getSjdate() {
		return this.sjdate;
	}

	public void setSjdate(Timestamp sjdate) {
		this.sjdate = sjdate;
	}

	public String getSjdh() {
		return this.sjdh;
	}

	public void setSjdh(String sjdh) {
		this.sjdh = sjdh;
	}

	public BigDecimal getSjje() {
		return this.sjje;
	}

	public void setSjje(BigDecimal sjje) {
		this.sjje = sjje;
	}

	public String getZffs() {
		return this.zffs;
	}

	public void setZffs(String zffs) {
		this.zffs = zffs;
	}

}