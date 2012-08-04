package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SPXX database table.
 * 
 */
@Entity
@Table(name="SPXX")
public class Spxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BarCode", length=50)
	private String barCode;

	private int barcodelx;

	@Column(name="BH", length=30)
	private String bh;

	@Column(name="Brand", length=50)
	private String brand;

	@Column(name="BZ", length=300)
	private String bz;

	private int canCL;

	private int canDiscount;

	private int canGroup;

	private int canPoints;

	private int canUse;

	@Column(name="CLBL")
	private int clbl;

	private BigDecimal CLPrice;

	@Column(length=30)
	private String CLUnit;

	@Column(name="ColorID")
	private int colorID;

	@Column(name="ColorName", length=50)
	private String colorName;

	private BigDecimal cPrice;

	private int curPrice;

	private int iFlag;

	private int isCalcSL;

	private int isSerial;

	private int issgcb;

	private BigDecimal LDis;

	@Column(name="Model", length=50)
	private String model;

	private BigDecimal mPrice;

	@Column(name="Name", length=150)
	private String name;

	private int nocb;

	private int noStock;

	@Column(length=50)
	private String place;

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

	@Column(length=150)
	private String producer;

	@Column(name="PYM", length=150)
	private String pym;

	@Column(name="QuaMonth")
	private int quaMonth;

	private int sizecolorlx;

	@Column(name="SizeID")
	private int sizeID;

	@Column(name="SizeName", length=50)
	private String sizeName;

	private BigDecimal sLBound;

	@Column(name="SortID")
	private int sortID;

	@Column(name="Spec", length=50)
	private String spec;

	private BigDecimal sUBound;

	@Column(name="SZZDY1")
	private BigDecimal szzdy1;

	@Column(name="SZZDY2")
	private BigDecimal szzdy2;

	@Column(name="TCFS")
	private int tcfs;

	@Column(name="TCJE")
	private BigDecimal tcje;

	private BigDecimal tPrice;

	@Column(name="TypeID")
	private int typeID;

	@Column(name="TypeName", length=50)
	private String typeName;

	@Column(name="Unit", length=30)
	private String unit;

	@Column(name="ZDY1", length=50)
	private String zdy1;

	@Column(name="ZDY2", length=50)
	private String zdy2;

	@Column(name="ZDY3", length=50)
	private String zdy3;

	@Column(name="ZDY4", length=50)
	private String zdy4;

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

	@Column(name="ZFZDY7", length=50)
	private String zfzdy7;

	@Column(name="ZFZDY8", length=50)
	private String zfzdy8;

	@Column(name="ZXZDY1")
	private int zxzdy1;

	@Column(name="ZXZDY2")
	private int zxzdy2;

	public Spxx() {
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

	public int getBarcodelx() {
		return this.barcodelx;
	}

	public void setBarcodelx(int barcodelx) {
		this.barcodelx = barcodelx;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public int getCanCL() {
		return this.canCL;
	}

	public void setCanCL(int canCL) {
		this.canCL = canCL;
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

	public int getCanUse() {
		return this.canUse;
	}

	public void setCanUse(int canUse) {
		this.canUse = canUse;
	}

	public int getClbl() {
		return this.clbl;
	}

	public void setClbl(int clbl) {
		this.clbl = clbl;
	}

	public BigDecimal getCLPrice() {
		return this.CLPrice;
	}

	public void setCLPrice(BigDecimal CLPrice) {
		this.CLPrice = CLPrice;
	}

	public String getCLUnit() {
		return this.CLUnit;
	}

	public void setCLUnit(String CLUnit) {
		this.CLUnit = CLUnit;
	}

	public int getColorID() {
		return this.colorID;
	}

	public void setColorID(int colorID) {
		this.colorID = colorID;
	}

	public String getColorName() {
		return this.colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public BigDecimal getCPrice() {
		return this.cPrice;
	}

	public void setCPrice(BigDecimal cPrice) {
		this.cPrice = cPrice;
	}

	public int getCurPrice() {
		return this.curPrice;
	}

	public void setCurPrice(int curPrice) {
		this.curPrice = curPrice;
	}

	public int getIFlag() {
		return this.iFlag;
	}

	public void setIFlag(int iFlag) {
		this.iFlag = iFlag;
	}

	public int getIsCalcSL() {
		return this.isCalcSL;
	}

	public void setIsCalcSL(int isCalcSL) {
		this.isCalcSL = isCalcSL;
	}

	public int getIsSerial() {
		return this.isSerial;
	}

	public void setIsSerial(int isSerial) {
		this.isSerial = isSerial;
	}

	public int getIssgcb() {
		return this.issgcb;
	}

	public void setIssgcb(int issgcb) {
		this.issgcb = issgcb;
	}

	public BigDecimal getLDis() {
		return this.LDis;
	}

	public void setLDis(BigDecimal LDis) {
		this.LDis = LDis;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getMPrice() {
		return this.mPrice;
	}

	public void setMPrice(BigDecimal mPrice) {
		this.mPrice = mPrice;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNocb() {
		return this.nocb;
	}

	public void setNocb(int nocb) {
		this.nocb = nocb;
	}

	public int getNoStock() {
		return this.noStock;
	}

	public void setNoStock(int noStock) {
		this.noStock = noStock;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
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

	public int getQuaMonth() {
		return this.quaMonth;
	}

	public void setQuaMonth(int quaMonth) {
		this.quaMonth = quaMonth;
	}

	public int getSizecolorlx() {
		return this.sizecolorlx;
	}

	public void setSizecolorlx(int sizecolorlx) {
		this.sizecolorlx = sizecolorlx;
	}

	public int getSizeID() {
		return this.sizeID;
	}

	public void setSizeID(int sizeID) {
		this.sizeID = sizeID;
	}

	public String getSizeName() {
		return this.sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
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

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public BigDecimal getSUBound() {
		return this.sUBound;
	}

	public void setSUBound(BigDecimal sUBound) {
		this.sUBound = sUBound;
	}

	public BigDecimal getSzzdy1() {
		return this.szzdy1;
	}

	public void setSzzdy1(BigDecimal szzdy1) {
		this.szzdy1 = szzdy1;
	}

	public BigDecimal getSzzdy2() {
		return this.szzdy2;
	}

	public void setSzzdy2(BigDecimal szzdy2) {
		this.szzdy2 = szzdy2;
	}

	public int getTcfs() {
		return this.tcfs;
	}

	public void setTcfs(int tcfs) {
		this.tcfs = tcfs;
	}

	public BigDecimal getTcje() {
		return this.tcje;
	}

	public void setTcje(BigDecimal tcje) {
		this.tcje = tcje;
	}

	public BigDecimal getTPrice() {
		return this.tPrice;
	}

	public void setTPrice(BigDecimal tPrice) {
		this.tPrice = tPrice;
	}

	public int getTypeID() {
		return this.typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getZdy1() {
		return this.zdy1;
	}

	public void setZdy1(String zdy1) {
		this.zdy1 = zdy1;
	}

	public String getZdy2() {
		return this.zdy2;
	}

	public void setZdy2(String zdy2) {
		this.zdy2 = zdy2;
	}

	public String getZdy3() {
		return this.zdy3;
	}

	public void setZdy3(String zdy3) {
		this.zdy3 = zdy3;
	}

	public String getZdy4() {
		return this.zdy4;
	}

	public void setZdy4(String zdy4) {
		this.zdy4 = zdy4;
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

	public String getZfzdy7() {
		return this.zfzdy7;
	}

	public void setZfzdy7(String zfzdy7) {
		this.zfzdy7 = zfzdy7;
	}

	public String getZfzdy8() {
		return this.zfzdy8;
	}

	public void setZfzdy8(String zfzdy8) {
		this.zfzdy8 = zfzdy8;
	}

	public int getZxzdy1() {
		return this.zxzdy1;
	}

	public void setZxzdy1(int zxzdy1) {
		this.zxzdy1 = zxzdy1;
	}

	public int getZxzdy2() {
		return this.zxzdy2;
	}

	public void setZxzdy2(int zxzdy2) {
		this.zxzdy2 = zxzdy2;
	}

}