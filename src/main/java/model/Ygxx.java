package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the YGXX database table.
 * 
 */
@Entity
@Table(name="YGXX")
public class Ygxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="Add", length=150)
	private String add;

	private Timestamp agreeYear;

	private int allfduse;

	@Column(name="BH", length=30)
	private String bh;

	@Column(name="BirthDay")
	private Timestamp birthDay;

	@Column(name="BirthDayFlag")
	private int birthDayFlag;

	@Column(name="BMID")
	private int bmid;

	@Column(length=50)
	private String BMName;

	@Column(name="BZ", length=150)
	private String bz;

	private int canUse;

	@Column(name="CardNo", length=30)
	private String cardNo;

	@Column(name="Col", length=50)
	private String col;

	@Column(name="Duty", length=30)
	private String duty;

	@Column(name="Edu", length=30)
	private String edu;

	@Column(name="Email", length=50)
	private String email;

	@Column(name="EmployedDate")
	private Timestamp employedDate;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="Fer", length=30)
	private String fer;

	private int isYWY;

	@Column(name="Marray", length=30)
	private String marray;

	@Column(name="Mobile", length=30)
	private String mobile;

	@Column(name="Name", length=30)
	private String name;

	@Column(name="Nat", length=30)
	private String nat;

	@Column(name="Nav", length=30)
	private String nav;

	@Column(name="Pos", length=30)
	private String pos;

	@Column(name="PYM", length=30)
	private String pym;

	@Column(name="Sex", length=6)
	private String sex;

	private int sortID;

	@Column(name="TCFAID")
	private int tcfaid;

	@Column(name="Tel", length=30)
	private String tel;

	@Column(name="ZY", length=50)
	private String zy;

	public Ygxx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdd() {
		return this.add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Timestamp getAgreeYear() {
		return this.agreeYear;
	}

	public void setAgreeYear(Timestamp agreeYear) {
		this.agreeYear = agreeYear;
	}

	public int getAllfduse() {
		return this.allfduse;
	}

	public void setAllfduse(int allfduse) {
		this.allfduse = allfduse;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public Timestamp getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(Timestamp birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthDayFlag() {
		return this.birthDayFlag;
	}

	public void setBirthDayFlag(int birthDayFlag) {
		this.birthDayFlag = birthDayFlag;
	}

	public int getBmid() {
		return this.bmid;
	}

	public void setBmid(int bmid) {
		this.bmid = bmid;
	}

	public String getBMName() {
		return this.BMName;
	}

	public void setBMName(String BMName) {
		this.BMName = BMName;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public int getCanUse() {
		return this.canUse;
	}

	public void setCanUse(int canUse) {
		this.canUse = canUse;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCol() {
		return this.col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getEdu() {
		return this.edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getEmployedDate() {
		return this.employedDate;
	}

	public void setEmployedDate(Timestamp employedDate) {
		this.employedDate = employedDate;
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

	public String getFer() {
		return this.fer;
	}

	public void setFer(String fer) {
		this.fer = fer;
	}

	public int getIsYWY() {
		return this.isYWY;
	}

	public void setIsYWY(int isYWY) {
		this.isYWY = isYWY;
	}

	public String getMarray() {
		return this.marray;
	}

	public void setMarray(String marray) {
		this.marray = marray;
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

	public String getNat() {
		return this.nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	public String getNav() {
		return this.nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getPos() {
		return this.pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
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

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

	public int getTcfaid() {
		return this.tcfaid;
	}

	public void setTcfaid(int tcfaid) {
		this.tcfaid = tcfaid;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getZy() {
		return this.zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}

}