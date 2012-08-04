package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the CXFA database table.
 * 
 */
@Entity
@Table(name="CXFA")
public class Cxfa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BH", length=50)
	private String bh;

	private int canuse;

	private int cxType;

	@Column(length=30)
	private String cxTypeName;

	@Column(name="FDID", length=1000)
	private String fdid;

	@Column(length=1000)
	private String FDName;

	@Column(name="HYZK")
	private int hyzk;

	private Timestamp idate;

	private int isZSZ;

	@Column(length=100)
	private String name;

	private Timestamp SJEnd;

	private Timestamp SJStart;

	private int sortid;

	@Column(name="TimeEnd")
	private Timestamp timeEnd;

	@Column(name="TimeStart")
	private Timestamp timeStart;

	private BigDecimal tjJE;

	private int tjType;

	@Column(name="Week1")
	private int week1;

	@Column(name="Week2")
	private int week2;

	@Column(name="Week3")
	private int week3;

	@Column(name="Week4")
	private int week4;

	@Column(name="Week5")
	private int week5;

	@Column(name="Week6")
	private int week6;

	@Column(name="Week7")
	private int week7;

	public Cxfa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public int getCanuse() {
		return this.canuse;
	}

	public void setCanuse(int canuse) {
		this.canuse = canuse;
	}

	public int getCxType() {
		return this.cxType;
	}

	public void setCxType(int cxType) {
		this.cxType = cxType;
	}

	public String getCxTypeName() {
		return this.cxTypeName;
	}

	public void setCxTypeName(String cxTypeName) {
		this.cxTypeName = cxTypeName;
	}

	public String getFdid() {
		return this.fdid;
	}

	public void setFdid(String fdid) {
		this.fdid = fdid;
	}

	public String getFDName() {
		return this.FDName;
	}

	public void setFDName(String FDName) {
		this.FDName = FDName;
	}

	public int getHyzk() {
		return this.hyzk;
	}

	public void setHyzk(int hyzk) {
		this.hyzk = hyzk;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public int getIsZSZ() {
		return this.isZSZ;
	}

	public void setIsZSZ(int isZSZ) {
		this.isZSZ = isZSZ;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getSJEnd() {
		return this.SJEnd;
	}

	public void setSJEnd(Timestamp SJEnd) {
		this.SJEnd = SJEnd;
	}

	public Timestamp getSJStart() {
		return this.SJStart;
	}

	public void setSJStart(Timestamp SJStart) {
		this.SJStart = SJStart;
	}

	public int getSortid() {
		return this.sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public Timestamp getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Timestamp timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Timestamp getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Timestamp timeStart) {
		this.timeStart = timeStart;
	}

	public BigDecimal getTjJE() {
		return this.tjJE;
	}

	public void setTjJE(BigDecimal tjJE) {
		this.tjJE = tjJE;
	}

	public int getTjType() {
		return this.tjType;
	}

	public void setTjType(int tjType) {
		this.tjType = tjType;
	}

	public int getWeek1() {
		return this.week1;
	}

	public void setWeek1(int week1) {
		this.week1 = week1;
	}

	public int getWeek2() {
		return this.week2;
	}

	public void setWeek2(int week2) {
		this.week2 = week2;
	}

	public int getWeek3() {
		return this.week3;
	}

	public void setWeek3(int week3) {
		this.week3 = week3;
	}

	public int getWeek4() {
		return this.week4;
	}

	public void setWeek4(int week4) {
		this.week4 = week4;
	}

	public int getWeek5() {
		return this.week5;
	}

	public void setWeek5(int week5) {
		this.week5 = week5;
	}

	public int getWeek6() {
		return this.week6;
	}

	public void setWeek6(int week6) {
		this.week6 = week6;
	}

	public int getWeek7() {
		return this.week7;
	}

	public void setWeek7(int week7) {
		this.week7 = week7;
	}

}