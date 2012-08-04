package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DWLXR database table.
 * 
 */
@Entity
@Table(name="DWLXR")
public class Dwlxr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=250)
	private String address;

	@Column(length=50)
	private String bh;

	@Column(length=250)
	private String bz;

	private int canuse;

	@Column(name="DWID")
	private int dwid;

	@Column(length=100)
	private String email;

	@Column(length=50)
	private String mobile;

	@Column(length=50)
	private String name;

	@Column(length=50)
	private String pym;

	@Column(length=10)
	private String sex;

	private int sortid;

	@Column(length=50)
	private String tel;

	@Column(length=50)
	private String zw;

	public Dwlxr() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public int getCanuse() {
		return this.canuse;
	}

	public void setCanuse(int canuse) {
		this.canuse = canuse;
	}

	public int getDwid() {
		return this.dwid;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPym() {
		return this.pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSortid() {
		return this.sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getZw() {
		return this.zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
	}

}