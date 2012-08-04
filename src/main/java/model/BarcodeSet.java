package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the BarcodeSet database table.
 * 
 */
@Entity
@Table(name="BarcodeSet")
public class BarcodeSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BottomMargin", precision=8, scale=2)
	private BigDecimal bottomMargin;

	@Column(name="ColCounts")
	private int colCounts;

	@Column(name="ColSpan", precision=8, scale=2)
	private BigDecimal colSpan;

	private int dkprint;

	@Column(name="Height", precision=8, scale=2)
	private BigDecimal height;

	private Timestamp idate;

	@Column(name="LeftMargin", precision=8, scale=2)
	private BigDecimal leftMargin;

	@Column(length=50)
	private String name;

	@Column(name="PageHeight", precision=8, scale=2)
	private BigDecimal pageHeight;

	@Column(name="PageWidth", precision=8, scale=2)
	private BigDecimal pageWidth;

	private int printfx;

	@Column(name="RightMargin", precision=8, scale=2)
	private BigDecimal rightMargin;

	@Column(name="RowCounts")
	private int rowCounts;

	@Column(name="RowSpan", precision=8, scale=2)
	private BigDecimal rowSpan;

	@Column(name="TopMargin", precision=8, scale=2)
	private BigDecimal topMargin;

	@Column(name="Width", precision=8, scale=2)
	private BigDecimal width;

	public BarcodeSet() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getBottomMargin() {
		return this.bottomMargin;
	}

	public void setBottomMargin(BigDecimal bottomMargin) {
		this.bottomMargin = bottomMargin;
	}

	public int getColCounts() {
		return this.colCounts;
	}

	public void setColCounts(int colCounts) {
		this.colCounts = colCounts;
	}

	public BigDecimal getColSpan() {
		return this.colSpan;
	}

	public void setColSpan(BigDecimal colSpan) {
		this.colSpan = colSpan;
	}

	public int getDkprint() {
		return this.dkprint;
	}

	public void setDkprint(int dkprint) {
		this.dkprint = dkprint;
	}

	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public BigDecimal getLeftMargin() {
		return this.leftMargin;
	}

	public void setLeftMargin(BigDecimal leftMargin) {
		this.leftMargin = leftMargin;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPageHeight() {
		return this.pageHeight;
	}

	public void setPageHeight(BigDecimal pageHeight) {
		this.pageHeight = pageHeight;
	}

	public BigDecimal getPageWidth() {
		return this.pageWidth;
	}

	public void setPageWidth(BigDecimal pageWidth) {
		this.pageWidth = pageWidth;
	}

	public int getPrintfx() {
		return this.printfx;
	}

	public void setPrintfx(int printfx) {
		this.printfx = printfx;
	}

	public BigDecimal getRightMargin() {
		return this.rightMargin;
	}

	public void setRightMargin(BigDecimal rightMargin) {
		this.rightMargin = rightMargin;
	}

	public int getRowCounts() {
		return this.rowCounts;
	}

	public void setRowCounts(int rowCounts) {
		this.rowCounts = rowCounts;
	}

	public BigDecimal getRowSpan() {
		return this.rowSpan;
	}

	public void setRowSpan(BigDecimal rowSpan) {
		this.rowSpan = rowSpan;
	}

	public BigDecimal getTopMargin() {
		return this.topMargin;
	}

	public void setTopMargin(BigDecimal topMargin) {
		this.topMargin = topMargin;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

}