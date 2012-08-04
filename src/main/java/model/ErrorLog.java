package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ErrorLog database table.
 * 
 */
@Entity
@Table(name="ErrorLog")
public class ErrorLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="CZ", length=50)
	private String cz;

	@Column(length=30)
	private String czy;

	@Column(name="ErrLine", length=30)
	private String errLine;

	@Column(name="ErrMsg", length=2000)
	private String errMsg;

	@Column(name="Fun", length=50)
	private String fun;

	private Timestamp idate;

	@Column(length=1000)
	private String sSql;

	@Column(name="Ver", length=20)
	private String ver;

	private int zt;

	public ErrorLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCz() {
		return this.cz;
	}

	public void setCz(String cz) {
		this.cz = cz;
	}

	public String getCzy() {
		return this.czy;
	}

	public void setCzy(String czy) {
		this.czy = czy;
	}

	public String getErrLine() {
		return this.errLine;
	}

	public void setErrLine(String errLine) {
		this.errLine = errLine;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getFun() {
		return this.fun;
	}

	public void setFun(String fun) {
		this.fun = fun;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getSSql() {
		return this.sSql;
	}

	public void setSSql(String sSql) {
		this.sSql = sSql;
	}

	public String getVer() {
		return this.ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

}