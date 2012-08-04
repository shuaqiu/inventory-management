package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the DJMX database table.
 * 
 */
@Entity
@Table(name="DJMX")
public class Djmx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BarCode", length=50)
	private String barCode;

	private BigDecimal cbprice;

	@Column(name="DH", length=30)
	private String dh;

	@Column(name="Dis")
	private BigDecimal dis;

	@Column(name="DJBH", length=30)
	private String djbh;

	@Column(name="DJID")
	private int djid;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="FKJE")
	private BigDecimal fkje;

	@Column(name="Flag")
	private int flag;

	private BigDecimal FNum;

	@Column(name="JE")
	private BigDecimal je;

	@Column(name="JYJE")
	private BigDecimal jyje;

	@Column(name="KCJE")
	private BigDecimal kcje;

	@Column(name="KCSL")
	private BigDecimal kcsl;

	@Column(name="Num")
	private BigDecimal num;

	@Column(name="PDJE")
	private BigDecimal pdje;

	@Column(name="PDSL")
	private BigDecimal pdsl;

	@Column(name="PKJE")
	private BigDecimal pkje;

	@Column(name="PKSL")
	private BigDecimal pksl;

	@Column(name="Price")
	private BigDecimal price;

	@Column(name="PYJE")
	private BigDecimal pyje;

	@Column(name="PYSL")
	private BigDecimal pysl;

	@Column(name="RQZDY1")
	private Timestamp rqzdy1;

	@Column(name="RQZDY2")
	private Timestamp rqzdy2;

	@Column(length=1000)
	private String serialbh;

	@Column(length=500)
	private String serialBZ;

	@Column(name="SPBH", length=30)
	private String spbh;

	@Column(name="SPID")
	private int spid;

	@Column(length=150)
	private String SPName;

	@Column(name="SZZDY1")
	private BigDecimal szzdy1;

	@Column(name="SZZDY2")
	private BigDecimal szzdy2;

	@Column(name="Unit", length=30)
	private String unit;

	@Column(name="WFJE")
	private BigDecimal wfje;

	@Column(name="YSJE")
	private BigDecimal ysje;

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

	public Djmx() {
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

	public BigDecimal getCbprice() {
		return this.cbprice;
	}

	public void setCbprice(BigDecimal cbprice) {
		this.cbprice = cbprice;
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

	public String getDjbh() {
		return this.djbh;
	}

	public void setDjbh(String djbh) {
		this.djbh = djbh;
	}

	public int getDjid() {
		return this.djid;
	}

	public void setDjid(int djid) {
		this.djid = djid;
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

	public BigDecimal getFkje() {
		return this.fkje;
	}

	public void setFkje(BigDecimal fkje) {
		this.fkje = fkje;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public BigDecimal getFNum() {
		return this.FNum;
	}

	public void setFNum(BigDecimal FNum) {
		this.FNum = FNum;
	}

	public BigDecimal getJe() {
		return this.je;
	}

	public void setJe(BigDecimal je) {
		this.je = je;
	}

	public BigDecimal getJyje() {
		return this.jyje;
	}

	public void setJyje(BigDecimal jyje) {
		this.jyje = jyje;
	}

	public BigDecimal getKcje() {
		return this.kcje;
	}

	public void setKcje(BigDecimal kcje) {
		this.kcje = kcje;
	}

	public BigDecimal getKcsl() {
		return this.kcsl;
	}

	public void setKcsl(BigDecimal kcsl) {
		this.kcsl = kcsl;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public BigDecimal getPdje() {
		return this.pdje;
	}

	public void setPdje(BigDecimal pdje) {
		this.pdje = pdje;
	}

	public BigDecimal getPdsl() {
		return this.pdsl;
	}

	public void setPdsl(BigDecimal pdsl) {
		this.pdsl = pdsl;
	}

	public BigDecimal getPkje() {
		return this.pkje;
	}

	public void setPkje(BigDecimal pkje) {
		this.pkje = pkje;
	}

	public BigDecimal getPksl() {
		return this.pksl;
	}

	public void setPksl(BigDecimal pksl) {
		this.pksl = pksl;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPyje() {
		return this.pyje;
	}

	public void setPyje(BigDecimal pyje) {
		this.pyje = pyje;
	}

	public BigDecimal getPysl() {
		return this.pysl;
	}

	public void setPysl(BigDecimal pysl) {
		this.pysl = pysl;
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

	public String getSerialbh() {
		return this.serialbh;
	}

	public void setSerialbh(String serialbh) {
		this.serialbh = serialbh;
	}

	public String getSerialBZ() {
		return this.serialBZ;
	}

	public void setSerialBZ(String serialBZ) {
		this.serialBZ = serialBZ;
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

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getWfje() {
		return this.wfje;
	}

	public void setWfje(BigDecimal wfje) {
		this.wfje = wfje;
	}

	public BigDecimal getYsje() {
		return this.ysje;
	}

	public void setYsje(BigDecimal ysje) {
		this.ysje = ysje;
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