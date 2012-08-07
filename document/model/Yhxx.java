package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the YHXX database table.
 * 
 */
@Entity
@Table(name="YHXX")
public class Yhxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int canLogin;

	@Column(name="GroupID")
	private int groupID;

	private Timestamp iDate;

	@Column(name="LoginIP", length=30)
	private String loginIP;

	@Column(name="LoginMac", length=50)
	private String loginMac;

	@Column(name="LoginTime")
	private Timestamp loginTime;

	private int sortid;

	@Column(name="UserName", length=50)
	private String userName;

	@Column(name="UserPsw", length=50)
	private String userPsw;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	public Yhxx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCanLogin() {
		return this.canLogin;
	}

	public void setCanLogin(int canLogin) {
		this.canLogin = canLogin;
	}

	public int getGroupID() {
		return this.groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public Timestamp getIDate() {
		return this.iDate;
	}

	public void setIDate(Timestamp iDate) {
		this.iDate = iDate;
	}

	public String getLoginIP() {
		return this.loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public String getLoginMac() {
		return this.loginMac;
	}

	public void setLoginMac(String loginMac) {
		this.loginMac = loginMac;
	}

	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public int getSortid() {
		return this.sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPsw() {
		return this.userPsw;
	}

	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
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