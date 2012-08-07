package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DWXX database table.
 * 
 */
@Entity
@Table(name="DWXX")
public class Dwxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=250)
	private String address;

	@Column(name="BankName", length=100)
	private String bankName;

	@Column(name="BankNo", length=50)
	private String bankNo;

	@Column(name="BH", length=30)
	private String bh;

	@Column(name="BZ", length=150)
	private String bz;

	private int canqf;

	private int canUse;

	@Column(name="DQ", length=30)
	private String dq;

	@Column(name="DQYF")
	private BigDecimal dqyf;

	@Column(name="DQYS")
	private BigDecimal dqys;

	@Column(name="Email", length=50)
	private String email;

	@Column(name="Fax", length=50)
	private String fax;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="FKQX")
	private int fkqx;

	@Column(name="Flag")
	private int flag;

	private int isCom;

	@Column(length=50)
	private String lx;

	@Column(name="LXR", length=30)
	private String lxr;

	@Column(name="Mobile", length=30)
	private String mobile;

	@Column(name="Name", length=150)
	private String name;

	@Column(name="PriceField", length=30)
	private String priceField;

	@Column(name="PriceName", length=30)
	private String priceName;

	@Column(name="PYM", length=50)
	private String pym;

	@Column(name="QCYF")
	private BigDecimal qcyf;

	@Column(name="QCYS")
	private BigDecimal qcys;

	@Column(length=30)
	private String qq;

	@Column(name="SEX", length=10)
	private String sex;

	@Column(name="SortID")
	private int sortID;

	@Column(name="TaxNo", length=50)
	private String taxNo;

	@Column(name="Tel", length=50)
	private String tel;

	@Column(name="TypeID")
	private int typeID;

	@Column(name="TypeName", length=50)
	private String typeName;

	@Column(length=150)
	private String url;

	private BigDecimal YFLimit;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	private BigDecimal YSLimit;

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

	public Dwxx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public int getCanqf() {
		return this.canqf;
	}

	public void setCanqf(int canqf) {
		this.canqf = canqf;
	}

	public int getCanUse() {
		return this.canUse;
	}

	public void setCanUse(int canUse) {
		this.canUse = canUse;
	}

	public String getDq() {
		return this.dq;
	}

	public void setDq(String dq) {
		this.dq = dq;
	}

	public BigDecimal getDqyf() {
		return this.dqyf;
	}

	public void setDqyf(BigDecimal dqyf) {
		this.dqyf = dqyf;
	}

	public BigDecimal getDqys() {
		return this.dqys;
	}

	public void setDqys(BigDecimal dqys) {
		this.dqys = dqys;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public int getFkqx() {
		return this.fkqx;
	}

	public void setFkqx(int fkqx) {
		this.fkqx = fkqx;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getIsCom() {
		return this.isCom;
	}

	public void setIsCom(int isCom) {
		this.isCom = isCom;
	}

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public BigDecimal getQcyf() {
		return this.qcyf;
	}

	public void setQcyf(BigDecimal qcyf) {
		this.qcyf = qcyf;
	}

	public BigDecimal getQcys() {
		return this.qcys;
	}

	public void setQcys(BigDecimal qcys) {
		this.qcys = qcys;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public BigDecimal getYFLimit() {
		return this.YFLimit;
	}

	public void setYFLimit(BigDecimal YFLimit) {
		this.YFLimit = YFLimit;
	}

	public int getYgid() {
		return this.ygid;
	}

	public void setYgid(int ygid) {
		this.ygid = ygid;
	}

	public String getYGName() {
		return this.YGName;
	}

	public void setYGName(String YGName) {
		this.YGName = YGName;
	}

	public BigDecimal getYSLimit() {
		return this.YSLimit;
	}

	public void setYSLimit(BigDecimal YSLimit) {
		this.YSLimit = YSLimit;
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