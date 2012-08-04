package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the DJXX database table.
 * 
 */
@Entity
@Table(name="DJXX")
public class Djxx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BM", length=50)
	private String bm;

	@Column(name="BMID")
	private int bmid;

	@Column(length=30)
	private String BMName;

	@Column(name="BZ", length=150)
	private String bz;

	@Column(name="CKID")
	private int ckid;

	@Column(name="CKID2")
	private int ckid2;

	@Column(length=50)
	private String CKName;

	@Column(length=50)
	private String CKName2;

	@Column(name="CZY", length=30)
	private String czy;

	@Column(name="DH", length=30)
	private String dh;

	private Timestamp DJDate;

	@Column(name="DJLX")
	private int djlx;

	@Column(length=30)
	private String DJName;

	@Column(name="DJXH")
	private int djxh;

	@Column(length=150)
	private String DWAddress;

	@Column(name="DWBH", length=30)
	private String dwbh;

	@Column(name="DWID")
	private int dwid;

	@Column(length=30)
	private String DWMobile;

	@Column(length=150)
	private String DWName;

	@Column(length=50)
	private String DWTel;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="FHFS", length=30)
	private String fhfs;

	@Column(name="Flag")
	private int flag;

	@Column(name="HJJE")
	private BigDecimal hjje;

	private BigDecimal HJNum;

	@Column(length=30)
	private String hykh;

	private Timestamp iDate;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="QTSM", length=150)
	private String qtsm;

	@Column(name="RQZDY1")
	private Timestamp rqzdy1;

	@Column(name="RQZDY2")
	private Timestamp rqzdy2;

	@Column(name="SGDH", length=30)
	private String sgdh;

	@Column(name="SHCZY", length=30)
	private String shczy;

	@Column(name="SHR0", length=30)
	private String shr0;

	@Column(name="SHR1", length=30)
	private String shr1;

	@Column(name="SHR2", length=30)
	private String shr2;

	@Column(name="SHR3", length=30)
	private String shr3;

	@Column(name="SHR4", length=30)
	private String shr4;

	@Column(name="SHR5", length=30)
	private String shr5;

	@Column(name="SHRID0")
	private int shrid0;

	@Column(name="SHRID1")
	private int shrid1;

	@Column(name="SHRID2")
	private int shrid2;

	@Column(name="SHRID3")
	private int shrid3;

	@Column(name="SHRID4")
	private int shrid4;

	@Column(name="SHRID5")
	private int shrid5;

	@Column(name="SKJE")
	private BigDecimal skje;

	@Column(name="SZZDY1")
	private BigDecimal szzdy1;

	@Column(name="SZZDY2")
	private BigDecimal szzdy2;

	private int tsflag;

	@Column(name="YGID")
	private int ygid;

	@Column(length=30)
	private String YGName;

	@Column(name="YSJE")
	private BigDecimal ysje;

	@Column(name="ZFFS", length=30)
	private String zffs;

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

	@Column(name="ZKJE")
	private BigDecimal zkje;

	@Column(name="ZT")
	private int zt;

	@Column(name="ZZSPBH", length=30)
	private String zzspbh;

	@Column(name="ZZSPID")
	private int zzspid;

	@Column(length=150)
	private String ZZSPName;

	private BigDecimal ZZSPNum;

	@Column(length=30)
	private String ZZSPUnit;

	public Djxx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBm() {
		return this.bm;
	}

	public void setBm(String bm) {
		this.bm = bm;
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

	public int getCkid2() {
		return this.ckid2;
	}

	public void setCkid2(int ckid2) {
		this.ckid2 = ckid2;
	}

	public String getCKName() {
		return this.CKName;
	}

	public void setCKName(String CKName) {
		this.CKName = CKName;
	}

	public String getCKName2() {
		return this.CKName2;
	}

	public void setCKName2(String CKName2) {
		this.CKName2 = CKName2;
	}

	public String getCzy() {
		return this.czy;
	}

	public void setCzy(String czy) {
		this.czy = czy;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public Timestamp getDJDate() {
		return this.DJDate;
	}

	public void setDJDate(Timestamp DJDate) {
		this.DJDate = DJDate;
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

	public int getDjxh() {
		return this.djxh;
	}

	public void setDjxh(int djxh) {
		this.djxh = djxh;
	}

	public String getDWAddress() {
		return this.DWAddress;
	}

	public void setDWAddress(String DWAddress) {
		this.DWAddress = DWAddress;
	}

	public String getDwbh() {
		return this.dwbh;
	}

	public void setDwbh(String dwbh) {
		this.dwbh = dwbh;
	}

	public int getDwid() {
		return this.dwid;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public String getDWMobile() {
		return this.DWMobile;
	}

	public void setDWMobile(String DWMobile) {
		this.DWMobile = DWMobile;
	}

	public String getDWName() {
		return this.DWName;
	}

	public void setDWName(String DWName) {
		this.DWName = DWName;
	}

	public String getDWTel() {
		return this.DWTel;
	}

	public void setDWTel(String DWTel) {
		this.DWTel = DWTel;
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

	public String getFhfs() {
		return this.fhfs;
	}

	public void setFhfs(String fhfs) {
		this.fhfs = fhfs;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public BigDecimal getHjje() {
		return this.hjje;
	}

	public void setHjje(BigDecimal hjje) {
		this.hjje = hjje;
	}

	public BigDecimal getHJNum() {
		return this.HJNum;
	}

	public void setHJNum(BigDecimal HJNum) {
		this.HJNum = HJNum;
	}

	public String getHykh() {
		return this.hykh;
	}

	public void setHykh(String hykh) {
		this.hykh = hykh;
	}

	public Timestamp getIDate() {
		return this.iDate;
	}

	public void setIDate(Timestamp iDate) {
		this.iDate = iDate;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getQtsm() {
		return this.qtsm;
	}

	public void setQtsm(String qtsm) {
		this.qtsm = qtsm;
	}

	public Timestamp getRqzdy1() {
		return this.rqzdy1;
	}

	public void setRqzdy1(Timestamp rqzdy1) {
		this.rqzdy1 = rqzdy1;
	}

	public Timestamp getRqzdy2() {
		return this.rqzdy2;
	}

	public void setRqzdy2(Timestamp rqzdy2) {
		this.rqzdy2 = rqzdy2;
	}

	public String getSgdh() {
		return this.sgdh;
	}

	public void setSgdh(String sgdh) {
		this.sgdh = sgdh;
	}

	public String getShczy() {
		return this.shczy;
	}

	public void setShczy(String shczy) {
		this.shczy = shczy;
	}

	public String getShr0() {
		return this.shr0;
	}

	public void setShr0(String shr0) {
		this.shr0 = shr0;
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

	public int getShrid0() {
		return this.shrid0;
	}

	public void setShrid0(int shrid0) {
		this.shrid0 = shrid0;
	}

	public int getShrid1() {
		return this.shrid1;
	}

	public void setShrid1(int shrid1) {
		this.shrid1 = shrid1;
	}

	public int getShrid2() {
		return this.shrid2;
	}

	public void setShrid2(int shrid2) {
		this.shrid2 = shrid2;
	}

	public int getShrid3() {
		return this.shrid3;
	}

	public void setShrid3(int shrid3) {
		this.shrid3 = shrid3;
	}

	public int getShrid4() {
		return this.shrid4;
	}

	public void setShrid4(int shrid4) {
		this.shrid4 = shrid4;
	}

	public int getShrid5() {
		return this.shrid5;
	}

	public void setShrid5(int shrid5) {
		this.shrid5 = shrid5;
	}

	public BigDecimal getSkje() {
		return this.skje;
	}

	public void setSkje(BigDecimal skje) {
		this.skje = skje;
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

	public int getTsflag() {
		return this.tsflag;
	}

	public void setTsflag(int tsflag) {
		this.tsflag = tsflag;
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

	public BigDecimal getYsje() {
		return this.ysje;
	}

	public void setYsje(BigDecimal ysje) {
		this.ysje = ysje;
	}

	public String getZffs() {
		return this.zffs;
	}

	public void setZffs(String zffs) {
		this.zffs = zffs;
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

	public BigDecimal getZkje() {
		return this.zkje;
	}

	public void setZkje(BigDecimal zkje) {
		this.zkje = zkje;
	}

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

	public String getZzspbh() {
		return this.zzspbh;
	}

	public void setZzspbh(String zzspbh) {
		this.zzspbh = zzspbh;
	}

	public int getZzspid() {
		return this.zzspid;
	}

	public void setZzspid(int zzspid) {
		this.zzspid = zzspid;
	}

	public String getZZSPName() {
		return this.ZZSPName;
	}

	public void setZZSPName(String ZZSPName) {
		this.ZZSPName = ZZSPName;
	}

	public BigDecimal getZZSPNum() {
		return this.ZZSPNum;
	}

	public void setZZSPNum(BigDecimal ZZSPNum) {
		this.ZZSPNum = ZZSPNum;
	}

	public String getZZSPUnit() {
		return this.ZZSPUnit;
	}

	public void setZZSPUnit(String ZZSPUnit) {
		this.ZZSPUnit = ZZSPUnit;
	}

}