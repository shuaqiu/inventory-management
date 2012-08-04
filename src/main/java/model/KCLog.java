package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the KCLog database table.
 * 
 */
@Entity
@Table(name="KCLog")
public class KCLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private BigDecimal BDNum;

	@Column(name="BMID")
	private int bmid;

	@Column(length=30)
	private String BMName;

	private BigDecimal cbje;

	private BigDecimal cbprice;

	@Column(name="CKID")
	private int ckid;

	@Column(length=50)
	private String CKName;

	@Column(name="CZ", length=50)
	private String cz;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="DJLX")
	private int djlx;

	@Column(length=30)
	private String DJName;

	@Column(name="DWID")
	private int dwid;

	@Column(length=150)
	private String DWName;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	private int flag;

	private Timestamp gzdate;

	private Timestamp idate;

	private int iscl;

	@Column(name="JE")
	private BigDecimal je;

	@Column(name="Num")
	private BigDecimal num;

	@Column(name="Oper", length=30)
	private String oper;

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

	private BigDecimal YENum;

	@Column(name="YGID")
	private int ygid;

	private BigDecimal yprice;

	@Column(name="ZY", length=150)
	private String zy;

	public KCLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getBDNum() {
		return this.BDNum;
	}

	public void setBDNum(BigDecimal BDNum) {
		this.BDNum = BDNum;
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

	public BigDecimal getCbje() {
		return this.cbje;
	}

	public void setCbje(BigDecimal cbje) {
		this.cbje = cbje;
	}

	public BigDecimal getCbprice() {
		return this.cbprice;
	}

	public void setCbprice(BigDecimal cbprice) {
		this.cbprice = cbprice;
	}

	public int getCkid() {
		return this.ckid;
	}

	public void setCkid(int ckid) {
		this.ckid = ckid;
	}

	public String getCKName() {
		return this.CKName;
	}

	public void setCKName(String CKName) {
		this.CKName = CKName;
	}

	public String getCz() {
		return this.cz;
	}

	public void setCz(String cz) {
		this.cz = cz;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
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

	public int getDwid() {
		return this.dwid;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public String getDWName() {
		return this.DWName;
	}

	public void setDWName(String DWName) {
		this.DWName = DWName;
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

	public Timestamp getGzdate() {
		return this.gzdate;
	}

	public void setGzdate(Timestamp gzdate) {
		this.gzdate = gzdate;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public int getIscl() {
		return this.iscl;
	}

	public void setIscl(int iscl) {
		this.iscl = iscl;
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

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
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

	public BigDecimal getYENum() {
		return this.YENum;
	}

	public void setYENum(BigDecimal YENum) {
		this.YENum = YENum;
	}

	public int getYgid() {
		return this.ygid;
	}

	public void setYgid(int ygid) {
		this.ygid = ygid;
	}

	public BigDecimal getYprice() {
		return this.yprice;
	}

	public void setYprice(BigDecimal yprice) {
		this.yprice = yprice;
	}

	public String getZy() {
		return this.zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}

}