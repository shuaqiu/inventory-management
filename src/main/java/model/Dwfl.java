package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DWFL database table.
 * 
 */
@Entity
@Table(name="DWFL")
public class Dwfl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BH", length=30)
	private String bh;

	@Column(name="Flag")
	private int flag;

	@Column(name="Name", length=50)
	private String name;

	@Column(name="ParentID")
	private int parentID;

	@Column(name="PriceField", length=30)
	private String priceField;

	@Column(name="PriceName", length=30)
	private String priceName;

	@Column(name="PYM", length=50)
	private String pym;

	@Column(name="SortID")
	private int sortID;

	private BigDecimal YFLimit;

	private BigDecimal YSLimit;

	public Dwfl() {
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

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentID() {
		return this.parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public String getPriceField() {
		return this.priceField;
	}

	public void setPriceField(String priceField) {
		this.priceField = priceField;
	}

	public String getPriceName() {
		return this.priceName;
	}

	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}

	public String getPym() {
		return this.pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

	public BigDecimal getYFLimit() {
		return this.YFLimit;
	}

	public void setYFLimit(BigDecimal YFLimit) {
		this.YFLimit = YFLimit;
	}

	public BigDecimal getYSLimit() {
		return this.YSLimit;
	}

	public void setYSLimit(BigDecimal YSLimit) {
		this.YSLimit = YSLimit;
	}

}