package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BarcodeSetMX database table.
 * 
 */
@Entity
@Table(name="BarcodeSetMX")
public class BarcodeSetMX implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BarType")
	private int barType;

	@Column(name="Caption", length=30)
	private String caption;

	@Column(name="FieldCaption", length=30)
	private String fieldCaption;

	@Column(name="FieldName", length=30)
	private String fieldName;

	@Column(name="FontName", length=30)
	private String fontName;

	@Column(name="FontSize")
	private int fontSize;

	@Column(name="FontStyle")
	private int fontStyle;

	@Column(name="Height", precision=8, scale=2)
	private BigDecimal height;

	@Column(precision=8, scale=2)
	private BigDecimal ileft;

	@Column(precision=8, scale=2)
	private BigDecimal itop;

	@Column(name="LineWidth", precision=8, scale=2)
	private BigDecimal lineWidth;

	@Column(name="MainID")
	private int mainID;

	@Column(name="ShowText")
	private int showText;

	@Column(name="Type")
	private int type;

	@Column(precision=8, scale=2)
	private BigDecimal width;

	public BarcodeSetMX() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBarType() {
		return this.barType;
	}

	public void setBarType(int barType) {
		this.barType = barType;
	}

	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getFieldCaption() {
		return this.fieldCaption;
	}

	public void setFieldCaption(String fieldCaption) {
		this.fieldCaption = fieldCaption;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFontName() {
		return this.fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public int getFontSize() {
		return this.fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public int getFontStyle() {
		return this.fontStyle;
	}

	public void setFontStyle(int fontStyle) {
		this.fontStyle = fontStyle;
	}

	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getIleft() {
		return this.ileft;
	}

	public void setIleft(BigDecimal ileft) {
		this.ileft = ileft;
	}

	public BigDecimal getItop() {
		return this.itop;
	}

	public void setItop(BigDecimal itop) {
		this.itop = itop;
	}

	public BigDecimal getLineWidth() {
		return this.lineWidth;
	}

	public void setLineWidth(BigDecimal lineWidth) {
		this.lineWidth = lineWidth;
	}

	public int getMainID() {
		return this.mainID;
	}

	public void setMainID(int mainID) {
		this.mainID = mainID;
	}

	public int getShowText() {
		return this.showText;
	}

	public void setShowText(int showText) {
		this.showText = showText;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

}