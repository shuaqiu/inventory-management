package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the QTGDMX database table.
 * 
 */
@Entity
@Table(name="QTGDMX")
public class Qtgdmx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BarCode", length=50)
	private String barCode;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="Dis")
	private BigDecimal dis;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="Flag")
	private int flag;

	@Column(name="JE")
	private BigDecimal je;

	@Column(name="Num")
	private BigDecimal num;

	@Column(name="PosBH", length=30)
	private String posBH;

	@Column(name="PosID")
	private int posID;

	@Column(name="Price")
	private BigDecimal price;

	@Column(name="SPBH", length=30)
	private String spbh;

	@Column(name="SPID")
	private int spid;

	@Column(length=150)
	private String SPName;

	@Column(name="Unit", length=30)
	private String unit;

	@Column(name="ZFZDY1", length=50)
	private String zfzdy1;

	@Column(name="ZFZDY2", length=50)
	private String zfzdy2;

	@Column(name="ZFZDY3", length=50)
	private String zfzdy3;

	@Column(name="ZFZDY4", length=50)
	private String zfzdy4;

	@Column(name="ZFZDY5", length=50)
	private String zfzdy5;

	@Column(name="ZFZDY6", length=50)
	private String zfzdy6;

	public Qtgdmx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public BigDecimal getDis() {
		return this.dis;
	}

	public void setDis(BigDecimal dis) {
		this.dis = dis;
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

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public BigDecimal getJe() {
		return this.je;
	}

	public void setJe(BigDecimal je) {
		this.je = je;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public String getPosBH() {
		return this.posBH;
	}

	public void setPosBH(String posBH) {
		this.posBH = posBH;
	}

	public int getPosID() {
		return this.posID;
	}

	public void setPosID(int posID) {
		this.posID = posID;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public String getZfzdy1() {
		return this.zfzdy1;
	}

	public void setZfzdy1(String zfzdy1) {
		this.zfzdy1 = zfzdy1;
	}

	public String getZfzdy2() {
		return this.zfzdy2;
	}

	public void setZfzdy2(String zfzdy2) {
		this.zfzdy2 = zfzdy2;
	}

	public String getZfzdy3() {
		return this.zfzdy3;
	}

	public void setZfzdy3(String zfzdy3) {
		this.zfzdy3 = zfzdy3;
	}

	public String getZfzdy4() {
		return this.zfzdy4;
	}

	public void setZfzdy4(String zfzdy4) {
		this.zfzdy4 = zfzdy4;
	}

	public String getZfzdy5() {
		return this.zfzdy5;
	}

	public void setZfzdy5(String zfzdy5) {
		this.zfzdy5 = zfzdy5;
	}

	public String getZfzdy6() {
		return this.zfzdy6;
	}

	public void setZfzdy6(String zfzdy6) {
		this.zfzdy6 = zfzdy6;
	}

}