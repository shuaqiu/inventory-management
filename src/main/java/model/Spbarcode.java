package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spbarcode database table.
 * 
 */
@Entity
@Table(name="spbarcode")
public class Spbarcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=30)
	private String barbh1;

	@Column(length=30)
	private String barbh2;

	@Column(length=50)
	private String barcodemx;

	@Column(length=50)
	private String barzfzdy1;

	@Column(length=50)
	private String barzfzdy2;

	private int sort1;

	private int sort2;

	@Column(name="SPID")
	private int spid;

	@Column(length=150)
	private String SPName;

	@Column(name="Unit", length=30)
	private String unit;

	public Spbarcode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarbh1() {
		return this.barbh1;
	}

	public void setBarbh1(String barbh1) {
		this.barbh1 = barbh1;
	}

	public String getBarbh2() {
		return this.barbh2;
	}

	public void setBarbh2(String barbh2) {
		this.barbh2 = barbh2;
	}

	public String getBarcodemx() {
		return this.barcodemx;
	}

	public void setBarcodemx(String barcodemx) {
		this.barcodemx = barcodemx;
	}

	public String getBarzfzdy1() {
		return this.barzfzdy1;
	}

	public void setBarzfzdy1(String barzfzdy1) {
		this.barzfzdy1 = barzfzdy1;
	}

	public String getBarzfzdy2() {
		return this.barzfzdy2;
	}

	public void setBarzfzdy2(String barzfzdy2) {
		this.barzfzdy2 = barzfzdy2;
	}

	public int getSort1() {
		return this.sort1;
	}

	public void setSort1(int sort1) {
		this.sort1 = sort1;
	}

	public int getSort2() {
		return this.sort2;
	}

	public void setSort2(int sort2) {
		this.sort2 = sort2;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public String getSPName() {
		return this.SPName;
	}

	public void setSPName(String SPName) {
		this.SPName = SPName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}