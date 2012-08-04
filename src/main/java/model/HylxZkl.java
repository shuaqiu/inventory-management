package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HYLX_ZKL database table.
 * 
 */
@Entity
@Table(name="HYLX_ZKL")
public class HylxZkl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int hylbID;

	@Column(length=50)
	private String hylbname;

	@Column(name="SPBH", length=50)
	private String spbh;

	@Column(name="SPID")
	private int spid;

	@Column(length=150)
	private String SPName;

	@Column(length=30)
	private String SPUnit;

	@Column(name="ZKL")
	private BigDecimal zkl;

	public HylxZkl() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHylbID() {
		return this.hylbID;
	}

	public void setHylbID(int hylbID) {
		this.hylbID = hylbID;
	}

	public String getHylbname() {
		return this.hylbname;
	}

	public void setHylbname(String hylbname) {
		this.hylbname = hylbname;
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

	public String getSPUnit() {
		return this.SPUnit;
	}

	public void setSPUnit(String SPUnit) {
		this.SPUnit = SPUnit;
	}

	public BigDecimal getZkl() {
		return this.zkl;
	}

	public void setZkl(BigDecimal zkl) {
		this.zkl = zkl;
	}

}