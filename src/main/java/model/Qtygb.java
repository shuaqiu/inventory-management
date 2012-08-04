package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the QTYGB database table.
 * 
 */
@Entity
@Table(name="QTYGB")
public class Qtygb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BZ", length=150)
	private String bz;

	@Column(name="DH", length=30)
	private String dh;

	private Timestamp idate;

	@Column(name="KH", length=30)
	private String kh;

	@Column(name="KHID")
	private int khid;

	@Column(name="L_AXI", precision=8, scale=2)
	private BigDecimal lAxi;

	@Column(name="L_AXI2", precision=8, scale=2)
	private BigDecimal lAxi2;

	@Column(name="L_CYL", precision=8, scale=2)
	private BigDecimal lCyl;

	@Column(name="L_CYL2", precision=8, scale=2)
	private BigDecimal lCyl2;

	@Column(name="L_NV", precision=8, scale=2)
	private BigDecimal lNv;

	@Column(name="L_NV2", precision=8, scale=2)
	private BigDecimal lNv2;

	@Column(name="L_PD", precision=8, scale=2)
	private BigDecimal lPd;

	@Column(name="L_PD2", precision=8, scale=2)
	private BigDecimal lPd2;

	@Column(name="L_SPH", precision=8, scale=2)
	private BigDecimal lSph;

	@Column(name="L_SPH2", precision=8, scale=2)
	private BigDecimal lSph2;

	@Column(name="L_V", precision=8, scale=2)
	private BigDecimal lV;

	@Column(name="L_V2", precision=8, scale=2)
	private BigDecimal lV2;

	@Column(name="PD", precision=8, scale=2)
	private BigDecimal pd;

	@Column(name="R_AXI", precision=8, scale=2)
	private BigDecimal rAxi;

	@Column(name="R_AXI2", precision=8, scale=2)
	private BigDecimal rAxi2;

	@Column(name="R_CYL", precision=8, scale=2)
	private BigDecimal rCyl;

	@Column(name="R_CYL2", precision=8, scale=2)
	private BigDecimal rCyl2;

	@Column(name="R_NV", precision=8, scale=2)
	private BigDecimal rNv;

	@Column(name="R_NV2", precision=8, scale=2)
	private BigDecimal rNv2;

	@Column(name="R_PD", precision=8, scale=2)
	private BigDecimal rPd;

	@Column(name="R_PD2", precision=8, scale=2)
	private BigDecimal rPd2;

	@Column(name="R_SPH", precision=8, scale=2)
	private BigDecimal rSph;

	@Column(name="R_SPH2", precision=8, scale=2)
	private BigDecimal rSph2;

	@Column(name="R_V", precision=8, scale=2)
	private BigDecimal rV;

	@Column(name="R_V2", precision=8, scale=2)
	private BigDecimal rV2;

	@Column(name="SZZDY1", precision=8, scale=2)
	private BigDecimal szzdy1;

	@Column(name="SZZDY2", precision=8, scale=2)
	private BigDecimal szzdy2;

	@Column(name="SZZDY3", precision=8, scale=2)
	private BigDecimal szzdy3;

	@Column(name="SZZDY4", precision=8, scale=2)
	private BigDecimal szzdy4;

	private int useflag;

	@Column(name="ZFZDY1", length=50)
	private String zfzdy1;

	@Column(name="ZFZDY2", length=50)
	private String zfzdy2;

	@Column(name="ZFZDY3", length=100)
	private String zfzdy3;

	@Column(name="ZFZDY4", length=150)
	private String zfzdy4;

	public Qtygb() {
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

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getKh() {
		return this.kh;
	}

	public void setKh(String kh) {
		this.kh = kh;
	}

	public int getKhid() {
		return this.khid;
	}

	public void setKhid(int khid) {
		this.khid = khid;
	}

	public BigDecimal getLAxi() {
		return this.lAxi;
	}

	public void setLAxi(BigDecimal lAxi) {
		this.lAxi = lAxi;
	}

	public BigDecimal getLAxi2() {
		return this.lAxi2;
	}

	public void setLAxi2(BigDecimal lAxi2) {
		this.lAxi2 = lAxi2;
	}

	public BigDecimal getLCyl() {
		return this.lCyl;
	}

	public void setLCyl(BigDecimal lCyl) {
		this.lCyl = lCyl;
	}

	public BigDecimal getLCyl2() {
		return this.lCyl2;
	}

	public void setLCyl2(BigDecimal lCyl2) {
		this.lCyl2 = lCyl2;
	}

	public BigDecimal getLNv() {
		return this.lNv;
	}

	public void setLNv(BigDecimal lNv) {
		this.lNv = lNv;
	}

	public BigDecimal getLNv2() {
		return this.lNv2;
	}

	public void setLNv2(BigDecimal lNv2) {
		this.lNv2 = lNv2;
	}

	public BigDecimal getLPd() {
		return this.lPd;
	}

	public void setLPd(BigDecimal lPd) {
		this.lPd = lPd;
	}

	public BigDecimal getLPd2() {
		return this.lPd2;
	}

	public void setLPd2(BigDecimal lPd2) {
		this.lPd2 = lPd2;
	}

	public BigDecimal getLSph() {
		return this.lSph;
	}

	public void setLSph(BigDecimal lSph) {
		this.lSph = lSph;
	}

	public BigDecimal getLSph2() {
		return this.lSph2;
	}

	public void setLSph2(BigDecimal lSph2) {
		this.lSph2 = lSph2;
	}

	public BigDecimal getLV() {
		return this.lV;
	}

	public void setLV(BigDecimal lV) {
		this.lV = lV;
	}

	public BigDecimal getLV2() {
		return this.lV2;
	}

	public void setLV2(BigDecimal lV2) {
		this.lV2 = lV2;
	}

	public BigDecimal getPd() {
		return this.pd;
	}

	public void setPd(BigDecimal pd) {
		this.pd = pd;
	}

	public BigDecimal getRAxi() {
		return this.rAxi;
	}

	public void setRAxi(BigDecimal rAxi) {
		this.rAxi = rAxi;
	}

	public BigDecimal getRAxi2() {
		return this.rAxi2;
	}

	public void setRAxi2(BigDecimal rAxi2) {
		this.rAxi2 = rAxi2;
	}

	public BigDecimal getRCyl() {
		return this.rCyl;
	}

	public void setRCyl(BigDecimal rCyl) {
		this.rCyl = rCyl;
	}

	public BigDecimal getRCyl2() {
		return this.rCyl2;
	}

	public void setRCyl2(BigDecimal rCyl2) {
		this.rCyl2 = rCyl2;
	}

	public BigDecimal getRNv() {
		return this.rNv;
	}

	public void setRNv(BigDecimal rNv) {
		this.rNv = rNv;
	}

	public BigDecimal getRNv2() {
		return this.rNv2;
	}

	public void setRNv2(BigDecimal rNv2) {
		this.rNv2 = rNv2;
	}

	public BigDecimal getRPd() {
		return this.rPd;
	}

	public void setRPd(BigDecimal rPd) {
		this.rPd = rPd;
	}

	public BigDecimal getRPd2() {
		return this.rPd2;
	}

	public void setRPd2(BigDecimal rPd2) {
		this.rPd2 = rPd2;
	}

	public BigDecimal getRSph() {
		return this.rSph;
	}

	public void setRSph(BigDecimal rSph) {
		this.rSph = rSph;
	}

	public BigDecimal getRSph2() {
		return this.rSph2;
	}

	public void setRSph2(BigDecimal rSph2) {
		this.rSph2 = rSph2;
	}

	public BigDecimal getRV() {
		return this.rV;
	}

	public void setRV(BigDecimal rV) {
		this.rV = rV;
	}

	public BigDecimal getRV2() {
		return this.rV2;
	}

	public void setRV2(BigDecimal rV2) {
		this.rV2 = rV2;
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

	public BigDecimal getSzzdy3() {
		return this.szzdy3;
	}

	public void setSzzdy3(BigDecimal szzdy3) {
		this.szzdy3 = szzdy3;
	}

	public BigDecimal getSzzdy4() {
		return this.szzdy4;
	}

	public void setSzzdy4(BigDecimal szzdy4) {
		this.szzdy4 = szzdy4;
	}

	public int getUseflag() {
		return this.useflag;
	}

	public void setUseflag(int useflag) {
		this.useflag = useflag;
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

}