package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SMSMX database table.
 * 
 */
@Entity
@Table(name="SMSMX")
public class Smsmx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=20)
	private String mobile;

	private int smsid;

	private int zt;

	@Column(length=10)
	private String ztmain;

	public Smsmx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getSmsid() {
		return this.smsid;
	}

	public void setSmsid(int smsid) {
		this.smsid = smsid;
	}

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

	public String getZtmain() {
		return this.ztmain;
	}

	public void setZtmain(String ztmain) {
		this.ztmain = ztmain;
	}

}