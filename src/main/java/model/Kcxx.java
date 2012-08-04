package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the KCXX database table.
 * 
 */
@Entity
@Table(name="KCXX")
public class Kcxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BZ", length=250)
	private String bz;

	@Column(name="CKID")
	private int ckid;

	@Column(length=50)
	private String CKName;

	private int iscl;

	@Column(name="JE")
	private BigDecimal je;

	@Column(name="JHJE")
	private BigDecimal jhje;

	private BigDecimal JHNum;

	private BigDecimal JHPrice;

	@Column(name="Num")
	private BigDecimal num;

	@Column(name="Price")
	private BigDecimal price;

	@Column(name="QCJE")
	private BigDecimal qcje;

	private BigDecimal QCNum;

	private BigDecimal QCPrice;

	@Column(name="SPBH", length=30)
	private String spbh;

	@Column(name="SPID")
	private int spid;

	@Column(length=150)
	private String SPName;

	@Column(name="SXJE")
	private BigDecimal sxje;

	private BigDecimal SXNum;

	private BigDecimal SXPrice;

	@Column(name="Unit", length=30)
	private String unit;

	public Kcxx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
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

	public BigDecimal getJhje() {
		return this.jhje;
	}

	public void setJhje(BigDecimal jhje) {
		this.jhje = jhje;
	}

	public BigDecimal getJHNum() {
		return this.JHNum;
	}

	public void setJHNum(BigDecimal JHNum) {
		this.JHNum = JHNum;
	}

	public BigDecimal getJHPrice() {
		return this.JHPrice;
	}

	public void setJHPrice(BigDecimal JHPrice) {
		this.JHPrice = JHPrice;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQcje() {
		return this.qcje;
	}

	public void setQcje(BigDecimal qcje) {
		this.qcje = qcje;
	}

	public BigDecimal getQCNum() {
		return this.QCNum;
	}

	public void setQCNum(BigDecimal QCNum) {
		this.QCNum = QCNum;
	}

	public BigDecimal getQCPrice() {
		return this.QCPrice;
	}

	public void setQCPrice(BigDecimal QCPrice) {
		this.QCPrice = QCPrice;
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

	public BigDecimal getSxje() {
		return this.sxje;
	}

	public void setSxje(BigDecimal sxje) {
		this.sxje = sxje;
	}

	public BigDecimal getSXNum() {
		return this.SXNum;
	}

	public void setSXNum(BigDecimal SXNum) {
		this.SXNum = SXNum;
	}

	public BigDecimal getSXPrice() {
		return this.SXPrice;
	}

	public void setSXPrice(BigDecimal SXPrice) {
		this.SXPrice = SXPrice;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}