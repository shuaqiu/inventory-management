package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HYLX_JCK database table.
 * 
 */
@Entity
@Table(name="HYLX_JCK")
public class HylxJck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int hylbid;

	@Column(length=50)
	private String hylbname;

	@Column(name="Num")
	private int num;

	@Column(name="SPBH", length=50)
	private String spbh;

	@Column(name="SPID")
	private int spid;

	@Column(length=150)
	private String SPName;

	@Column(length=30)
	private String SPUnit;

	public HylxJck() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHylbid() {
		return this.hylbid;
	}

	public void setHylbid(int hylbid) {
		this.hylbid = hylbid;
	}

	public String getHylbname() {
		return this.hylbname;
	}

	public void setHylbname(String hylbname) {
		this.hylbname = hylbname;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
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

}