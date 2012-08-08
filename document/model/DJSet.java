package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DJSet database table.
 * 
 */
@Entity
@Table(name="DJSet")
public class DJSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BHQZ", length=30)
	private String bhqz;

	@Column(name="BHWS", length=30)
	private String bhws;

	@Column(name="BZ", length=50)
	private String bz;

	@Column(name="DJBHLX", length=50)
	private String djbhlx;

	@Column(name="DJJS")
	private int djjs;

	@Column(name="DJLX")
	private int djlx;

	@Column(length=30)
	private String DJName;

	@Column(length=30)
	private String MRJGField;

	@Column(length=30)
	private String MRJGName;

	@Column(name="SHR1", length=250)
	private String shr1;

	@Column(name="SHR2", length=250)
	private String shr2;

	@Column(name="SHR3", length=250)
	private String shr3;

	@Column(name="SHR4", length=250)
	private String shr4;

	@Column(name="SHR5", length=250)
	private String shr5;

	@Column(name="SHRID1", length=50)
	private String shrid1;

	@Column(name="SHRID2", length=50)
	private String shrid2;

	@Column(name="SHRID3", length=50)
	private String shrid3;

	@Column(name="SHRID4", length=50)
	private String shrid4;

	@Column(name="SHRID5", length=50)
	private String shrid5;

	public DJSet() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBhqz() {
		return this.bhqz;
	}

	public void setBhqz(String bhqz) {
		this.bhqz = bhqz;
	}

	public String getBhws() {
		return this.bhws;
	}

	public void setBhws(String bhws) {
		this.bhws = bhws;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getDjbhlx() {
		return this.djbhlx;
	}

	public void setDjbhlx(String djbhlx) {
		this.djbhlx = djbhlx;
	}

	public int getDjjs() {
		return this.djjs;
	}

	public void setDjjs(int djjs) {
		this.djjs = djjs;
	}

	public int getDjlx() {
		return this.djlx;
	}

	public void setDjlx(int djlx) {
		this.djlx = djlx;
	}

	public String getDJName() {
		return this.DJName;
	}

	public void setDJName(String DJName) {
		this.DJName = DJName;
	}

	public String getMRJGField() {
		return this.MRJGField;
	}

	public void setMRJGField(String MRJGField) {
		this.MRJGField = MRJGField;
	}

	public String getMRJGName() {
		return this.MRJGName;
	}

	public void setMRJGName(String MRJGName) {
		this.MRJGName = MRJGName;
	}

	public String getShr1() {
		return this.shr1;
	}

	public void setShr1(String shr1) {
		this.shr1 = shr1;
	}

	public String getShr2() {
		return this.shr2;
	}

	public void setShr2(String shr2) {
		this.shr2 = shr2;
	}

	public String getShr3() {
		return this.shr3;
	}

	public void setShr3(String shr3) {
		this.shr3 = shr3;
	}

	public String getShr4() {
		return this.shr4;
	}

	public void setShr4(String shr4) {
		this.shr4 = shr4;
	}

	public String getShr5() {
		return this.shr5;
	}

	public void setShr5(String shr5) {
		this.shr5 = shr5;
	}

	public String getShrid1() {
		return this.shrid1;
	}

	public void setShrid1(String shrid1) {
		this.shrid1 = shrid1;
	}

	public String getShrid2() {
		return this.shrid2;
	}

	public void setShrid2(String shrid2) {
		this.shrid2 = shrid2;
	}

	public String getShrid3() {
		return this.shrid3;
	}

	public void setShrid3(String shrid3) {
		this.shrid3 = shrid3;
	}

	public String getShrid4() {
		return this.shrid4;
	}

	public void setShrid4(String shrid4) {
		this.shrid4 = shrid4;
	}

	public String getShrid5() {
		return this.shrid5;
	}

	public void setShrid5(String shrid5) {
		this.shrid5 = shrid5;
	}

}