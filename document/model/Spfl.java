package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SPFL database table.
 * 
 */
@Entity
@Table(name="SPFL")
public class Spfl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BH", length=30)
	private String bh;

	private int canDiscount;

	private int canGroup;

	private int canPoints;

	private int curPrice;

	private BigDecimal LDis;

	@Column(name="Name", length=50)
	private String name;

	private int noStock;

	@Column(name="ParentID")
	private int parentID;

	@Column(length=50)
	private String place;

	@Column(length=150)
	private String producer;

	@Column(name="PYM", length=50)
	private String pym;

	private BigDecimal sLBound;

	@Column(name="SortID")
	private int sortID;

	private BigDecimal sUBound;

	public Spfl() {
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

	public int getCanDiscount() {
		return this.canDiscount;
	}

	public void setCanDiscount(int canDiscount) {
		this.canDiscount = canDiscount;
	}

	public int getCanGroup() {
		return this.canGroup;
	}

	public void setCanGroup(int canGroup) {
		this.canGroup = canGroup;
	}

	public int getCanPoints() {
		return this.canPoints;
	}

	public void setCanPoints(int canPoints) {
		this.canPoints = canPoints;
	}

	public int getCurPrice() {
		return this.curPrice;
	}

	public void setCurPrice(int curPrice) {
		this.curPrice = curPrice;
	}

	public BigDecimal getLDis() {
		return this.LDis;
	}

	public void setLDis(BigDecimal LDis) {
		this.LDis = LDis;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoStock() {
		return this.noStock;
	}

	public void setNoStock(int noStock) {
		this.noStock = noStock;
	}

	public int getParentID() {
		return this.parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getProducer() {
		return this.producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getPym() {
		return this.pym;
	}

	public void setPym(String pym) {
		this.pym = pym;
	}

	public BigDecimal getSLBound() {
		return this.sLBound;
	}

	public void setSLBound(BigDecimal sLBound) {
		this.sLBound = sLBound;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

	public BigDecimal getSUBound() {
		return this.sUBound;
	}

	public void setSUBound(BigDecimal sUBound) {
		this.sUBound = sUBound;
	}

}