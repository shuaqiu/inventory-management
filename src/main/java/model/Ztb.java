package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ZTB database table.
 * 
 */
@Entity
@Table(name="ZTB")
public class Ztb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="DbName", length=50)
	private String dbName;

	@Column(name="DbPsw", length=50)
	private String dbPsw;

	@Column(name="DbServer", length=50)
	private String dbServer;

	@Column(name="DbUser", length=50)
	private String dbUser;

	@Column(name="EmpBH", length=50)
	private String empBH;

	private Timestamp iDate;

	private int isDefault;

	private int isEnable;

	private int isShow;

	@Column(length=50)
	private String name;

	@Column(name="SortID")
	private int sortID;

	public Ztb() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbPsw() {
		return this.dbPsw;
	}

	public void setDbPsw(String dbPsw) {
		this.dbPsw = dbPsw;
	}

	public String getDbServer() {
		return this.dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

	public String getDbUser() {
		return this.dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getEmpBH() {
		return this.empBH;
	}

	public void setEmpBH(String empBH) {
		this.empBH = empBH;
	}

	public Timestamp getIDate() {
		return this.iDate;
	}

	public void setIDate(Timestamp iDate) {
		this.iDate = iDate;
	}

	public int getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

	public int getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}

	public int getIsShow() {
		return this.isShow;
	}

	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

}