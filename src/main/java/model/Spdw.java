package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SPDW database table.
 * 
 */
@Entity
@Table(name="SPDW")
public class Spdw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=50)
	private String barcode;

	private BigDecimal cPrice;

	private BigDecimal fNum;

	private BigDecimal fnumDiv;

	@Column(length=50)
	private String fUnit;

	private int isdiv;

	private BigDecimal mPrice;

	@Column(name="Price")
	private BigDecimal price;

	@Column(name="Price2")
	private BigDecimal price2;

	@Column(name="Price3")
	private BigDecimal price3;

	@Column(name="Price4")
	private BigDecimal price4;

	@Column(name="Price5")
	private BigDecimal price5;

	@Column(name="Price6")
	private BigDecimal price6;

	@Column(name="SPID")
	private int spid;

	private BigDecimal tPrice;

	public Spdw() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public BigDecimal getCPrice() {
		return this.cPrice;
	}

	public void setCPrice(BigDecimal cPrice) {
		this.cPrice = cPrice;
	}

	public BigDecimal getFNum() {
		return this.fNum;
	}

	public void setFNum(BigDecimal fNum) {
		this.fNum = fNum;
	}

	public BigDecimal getFnumDiv() {
		return this.fnumDiv;
	}

	public void setFnumDiv(BigDecimal fnumDiv) {
		this.fnumDiv = fnumDiv;
	}

	public String getFUnit() {
		return this.fUnit;
	}

	public void setFUnit(String fUnit) {
		this.fUnit = fUnit;
	}

	public int getIsdiv() {
		return this.isdiv;
	}

	public void setIsdiv(int isdiv) {
		this.isdiv = isdiv;
	}

	public BigDecimal getMPrice() {
		return this.mPrice;
	}

	public void setMPrice(BigDecimal mPrice) {
		this.mPrice = mPrice;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice2() {
		return this.price2;
	}

	public void setPrice2(BigDecimal price2) {
		this.price2 = price2;
	}

	public BigDecimal getPrice3() {
		return this.price3;
	}

	public void setPrice3(BigDecimal price3) {
		this.price3 = price3;
	}

	public BigDecimal getPrice4() {
		return this.price4;
	}

	public void setPrice4(BigDecimal price4) {
		this.price4 = price4;
	}

	public BigDecimal getPrice5() {
		return this.price5;
	}

	public void setPrice5(BigDecimal price5) {
		this.price5 = price5;
	}

	public BigDecimal getPrice6() {
		return this.price6;
	}

	public void setPrice6(BigDecimal price6) {
		this.price6 = price6;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public BigDecimal getTPrice() {
		return this.tPrice;
	}

	public void setTPrice(BigDecimal tPrice) {
		this.tPrice = tPrice;
	}

}