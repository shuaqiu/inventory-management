package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cjxx database table.
 * 
 */
@Entity
@Table(name="cjxx")
public class Cjxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=150)
	private String address;

	@Column(length=50)
	private String bh;

	@Column(length=250)
	private String bz;

	private int canuse;

	@Column(length=50)
	private String dq;

	@Column(length=50)
	private String email;

	@Column(length=50)
	private String fax;

	@Column(length=50)
	private String lxr;

	@Column(length=50)
	private String mobile;

	@Column(length=250)
	private String name;

	@Column(length=50)
	private String pym;

	@Column(length=50)
	private String tel;

	@Column(length=150)
	private String url;

	@Column(length=150)
	private String zfzdy1;

	@Column(length=150)
	private String zfzdy2;

	@Column(length=150)
	private String zfzdy3;

	public Cjxx() {
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

	public String getDq() {
		return this.dq;
	}

	public void setDq(String dq) {
		this.dq = dq;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
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

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getZfzdy3() {
		return this.zfzdy3;
	}

	public void setZfzdy3(String zfzdy3) {
		this.zfzdy3 = zfzdy3;
	}

}