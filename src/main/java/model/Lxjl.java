package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the LXJL database table.
 * 
 */
@Entity
@Table(name="LXJL")
public class Lxjl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="DWID")
	private int dwid;

	private Timestamp idate;

	@Column(name="LX", length=30)
	private String lx;

	@Column(name="LXNOTE", length=500)
	private String lxnote;

	@Column(name="LXR", length=30)
	private String lxr;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="Title", length=50)
	private String title;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	public Lxjl() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDwid() {
		return this.dwid;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getLxnote() {
		return this.lxnote;
	}

	public void setLxnote(String lxnote) {
		this.lxnote = lxnote;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYgid() {
		return this.ygid;
	}

	public void setYgid(int ygid) {
		this.ygid = ygid;
	}

	public String getYGName() {
		return this.YGName;
	}

	public void setYGName(String YGName) {
		this.YGName = YGName;
	}

}