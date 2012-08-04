package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HYLX database table.
 * 
 */
@Entity
@Table(name="HYLX")
public class Hylx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="AutoSJ")
	private int autoSJ;

	@Column(name="CZK")
	private int czk;

	@Column(name="Dis")
	private BigDecimal dis;

	@Column(length=30)
	private String HYJField;

	@Column(name="JCK")
	private int jck;

	@Column(name="JFDS")
	private int jfds;

	@Column(name="JFFS")
	private int jffs;

	@Column(name="JFJE")
	private BigDecimal jfje;

	@Column(name="JFK")
	private int jfk;

	@Column(name="JG")
	private BigDecimal jg;

	@Column(name="MRJE")
	private BigDecimal mrje;

	@Column(length=50)
	private String name;

	@Column(name="SJJF")
	private int sjjf;

	@Column(name="SJLB", length=50)
	private String sjlb;

	private int useCZZS;

	@Column(name="YXTS")
	private int yxts;

	@Column(name="ZKFS")
	private int zkfs;

	@Column(name="ZKK")
	private int zkk;

	public Hylx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAutoSJ() {
		return this.autoSJ;
	}

	public void setAutoSJ(int autoSJ) {
		this.autoSJ = autoSJ;
	}

	public int getCzk() {
		return this.czk;
	}

	public void setCzk(int czk) {
		this.czk = czk;
	}

	public BigDecimal getDis() {
		return this.dis;
	}

	public void setDis(BigDecimal dis) {
		this.dis = dis;
	}

	public String getHYJField() {
		return this.HYJField;
	}

	public void setHYJField(String HYJField) {
		this.HYJField = HYJField;
	}

	public int getJck() {
		return this.jck;
	}

	public void setJck(int jck) {
		this.jck = jck;
	}

	public int getJfds() {
		return this.jfds;
	}

	public void setJfds(int jfds) {
		this.jfds = jfds;
	}

	public int getJffs() {
		return this.jffs;
	}

	public void setJffs(int jffs) {
		this.jffs = jffs;
	}

	public BigDecimal getJfje() {
		return this.jfje;
	}

	public void setJfje(BigDecimal jfje) {
		this.jfje = jfje;
	}

	public int getJfk() {
		return this.jfk;
	}

	public void setJfk(int jfk) {
		this.jfk = jfk;
	}

	public BigDecimal getJg() {
		return this.jg;
	}

	public void setJg(BigDecimal jg) {
		this.jg = jg;
	}

	public BigDecimal getMrje() {
		return this.mrje;
	}

	public void setMrje(BigDecimal mrje) {
		this.mrje = mrje;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSjjf() {
		return this.sjjf;
	}

	public void setSjjf(int sjjf) {
		this.sjjf = sjjf;
	}

	public String getSjlb() {
		return this.sjlb;
	}

	public void setSjlb(String sjlb) {
		this.sjlb = sjlb;
	}

	public int getUseCZZS() {
		return this.useCZZS;
	}

	public void setUseCZZS(int useCZZS) {
		this.useCZZS = useCZZS;
	}

	public int getYxts() {
		return this.yxts;
	}

	public void setYxts(int yxts) {
		this.yxts = yxts;
	}

	public int getZkfs() {
		return this.zkfs;
	}

	public void setZkfs(int zkfs) {
		this.zkfs = zkfs;
	}

	public int getZkk() {
		return this.zkk;
	}

	public void setZkk(int zkk) {
		this.zkk = zkk;
	}

}