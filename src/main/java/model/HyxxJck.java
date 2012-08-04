package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hyxx_jck database table.
 * 
 */
@Entity
@Table(name="hyxx_jck")
public class HyxxJck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int czcs;

	private int dqcs;

	@Column(length=30)
	private String kh;

	@Column(length=30)
	private String spbh;

	private int spid;

	public HyxxJck() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCzcs() {
		return this.czcs;
	}

	public void setCzcs(int czcs) {
		this.czcs = czcs;
	}

	public int getDqcs() {
		return this.dqcs;
	}

	public void setDqcs(int dqcs) {
		this.dqcs = dqcs;
	}

	public String getKh() {
		return this.kh;
	}

	public void setKh(String kh) {
		this.kh = kh;
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

}