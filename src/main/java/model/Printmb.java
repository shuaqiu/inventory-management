package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the printmb database table.
 * 
 */
@Entity
@Table(name="printmb")
public class Printmb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BodyField", length=500)
	private String bodyField;

	@Column(precision=6, scale=2)
	private BigDecimal bottommargin;

	private int djlx;

	@Column(length=50)
	private String filename;

	private int fontsize;

	private int footcolumn;

	@Column(name="FootField", length=500)
	private String footField;

	private int headcolumn;

	@Column(name="HeadField", length=500)
	private String headField;

	private int isdefault;

	private int islxz;

	private int isRow;

	@Column(precision=6, scale=2)
	private BigDecimal leftmargin;

	@Column(name="Logo")
	private Object logo;

	private int mxys;

	@Column(length=50)
	private String name;

	@Column(precision=6, scale=2)
	private BigDecimal pageheight;

	@Column(precision=6, scale=2)
	private BigDecimal pagewidth;

	private int printfx;

	private int printpage;

	private int printpagehj;

	@Column(precision=6, scale=2)
	private BigDecimal rightmargin;

	@Column(name="Rows")
	private int rows;

	@Column(name="ShowLogo")
	private int showLogo;

	@Column(length=50)
	private String sm;

	@Column(precision=6, scale=2)
	private BigDecimal topmargin;

	public Printmb() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBodyField() {
		return this.bodyField;
	}

	public void setBodyField(String bodyField) {
		this.bodyField = bodyField;
	}

	public BigDecimal getBottommargin() {
		return this.bottommargin;
	}

	public void setBottommargin(BigDecimal bottommargin) {
		this.bottommargin = bottommargin;
	}

	public int getDjlx() {
		return this.djlx;
	}

	public void setDjlx(int djlx) {
		this.djlx = djlx;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getFontsize() {
		return this.fontsize;
	}

	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}

	public int getFootcolumn() {
		return this.footcolumn;
	}

	public void setFootcolumn(int footcolumn) {
		this.footcolumn = footcolumn;
	}

	public String getFootField() {
		return this.footField;
	}

	public void setFootField(String footField) {
		this.footField = footField;
	}

	public int getHeadcolumn() {
		return this.headcolumn;
	}

	public void setHeadcolumn(int headcolumn) {
		this.headcolumn = headcolumn;
	}

	public String getHeadField() {
		return this.headField;
	}

	public void setHeadField(String headField) {
		this.headField = headField;
	}

	public int getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(int isdefault) {
		this.isdefault = isdefault;
	}

	public int getIslxz() {
		return this.islxz;
	}

	public void setIslxz(int islxz) {
		this.islxz = islxz;
	}

	public int getIsRow() {
		return this.isRow;
	}

	public void setIsRow(int isRow) {
		this.isRow = isRow;
	}

	public BigDecimal getLeftmargin() {
		return this.leftmargin;
	}

	public void setLeftmargin(BigDecimal leftmargin) {
		this.leftmargin = leftmargin;
	}

	public Object getLogo() {
		return this.logo;
	}

	public void setLogo(Object logo) {
		this.logo = logo;
	}

	public int getMxys() {
		return this.mxys;
	}

	public void setMxys(int mxys) {
		this.mxys = mxys;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPageheight() {
		return this.pageheight;
	}

	public void setPageheight(BigDecimal pageheight) {
		this.pageheight = pageheight;
	}

	public BigDecimal getPagewidth() {
		return this.pagewidth;
	}

	public void setPagewidth(BigDecimal pagewidth) {
		this.pagewidth = pagewidth;
	}

	public int getPrintfx() {
		return this.printfx;
	}

	public void setPrintfx(int printfx) {
		this.printfx = printfx;
	}

	public int getPrintpage() {
		return this.printpage;
	}

	public void setPrintpage(int printpage) {
		this.printpage = printpage;
	}

	public int getPrintpagehj() {
		return this.printpagehj;
	}

	public void setPrintpagehj(int printpagehj) {
		this.printpagehj = printpagehj;
	}

	public BigDecimal getRightmargin() {
		return this.rightmargin;
	}

	public void setRightmargin(BigDecimal rightmargin) {
		this.rightmargin = rightmargin;
	}

	public int getRows() {
		return this.rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getShowLogo() {
		return this.showLogo;
	}

	public void setShowLogo(int showLogo) {
		this.showLogo = showLogo;
	}

	public String getSm() {
		return this.sm;
	}

	public void setSm(String sm) {
		this.sm = sm;
	}

	public BigDecimal getTopmargin() {
		return this.topmargin;
	}

	public void setTopmargin(BigDecimal topmargin) {
		this.topmargin = topmargin;
	}

}