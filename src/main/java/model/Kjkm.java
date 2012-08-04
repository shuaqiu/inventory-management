package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KJKM database table.
 * 
 */
@Entity
@Table(name="KJKM")
public class Kjkm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=30)
	private String bh;

	@Column(length=30)
	private String cname;

	@Column(length=50)
	private String code;

	private int level;

	@Column(length=50)
	private String name;

	@Column(length=50)
	private String parentcode;

	@Column(length=30)
	private String pym;

	private int sysFlag;

	private int xmid;

	public Kjkm() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentcode() {
		return this.parentcode;
	}

	public void setParentcode(String parentcode) {
		this.parentcode = parentcode;
	}

	public String getPym() {
		return this.pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

	public int getSysFlag() {
		return this.sysFlag;
	}

	public void setSysFlag(int sysFlag) {
		this.sysFlag = sysFlag;
	}

	public int getXmid() {
		return this.xmid;
	}

	public void setXmid(int xmid) {
		this.xmid = xmid;
	}

}