package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ErrLog database table.
 * 
 */
@Entity
@Table(name="ErrLog")
public class ErrLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="ErrPic")
	private Object errPic;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="FormName", length=50)
	private String formName;

	@Column(name="FunName", length=50)
	private String funName;

	private Timestamp idate;

	@Column(name="IP", length=30)
	private String ip;

	@Column(name="Mac", length=30)
	private String mac;

	@Column(name="Msg", length=250)
	private String msg;

	@Column(name="Oper", length=50)
	private String oper;

	@Column(name="SoftVer", length=50)
	private String softVer;

	@Column(length=250)
	private String sSql;

	@Column(name="SysVer", length=50)
	private String sysVer;

	public ErrLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getErrPic() {
		return this.errPic;
	}

	public void setErrPic(Object errPic) {
		this.errPic = errPic;
	}

	public int getFdid() {
		return this.fdid;
	}

	public void setFdid(int fdid) {
		this.fdid = fdid;
	}

	public String getFDName() {
		return this.FDName;
	}

	public void setFDName(String FDName) {
		this.FDName = FDName;
	}

	public String getFormName() {
		return this.formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFunName() {
		return this.funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getSoftVer() {
		return this.softVer;
	}

	public void setSoftVer(String softVer) {
		this.softVer = softVer;
	}

	public String getSSql() {
		return this.sSql;
	}

	public void setSSql(String sSql) {
		this.sSql = sSql;
	}

	public String getSysVer() {
		return this.sysVer;
	}

	public void setSysVer(String sysVer) {
		this.sysVer = sysVer;
	}

}