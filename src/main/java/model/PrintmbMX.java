package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the printmbMX database table.
 * 
 */
@Entity
@Table(name="printmbMX")
public class PrintmbMX implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="Aligment")
	private int aligment;

	@Column(name="Caption", length=250)
	private String caption;

	@Column(name="DisplayFormat", length=30)
	private String displayFormat;

	@Column(name="FieldName", length=250)
	private String fieldName;

	@Column(name="FontName", length=30)
	private String fontName;

	@Column(name="FontSize")
	private int fontSize;

	@Column(name="FontStyle")
	private int fontStyle;

	private int iBody;

	private int iFlag;

	private int iHeight;

	private int iLeft;

	private int iTop;

	private int iType;

	private int iWidth;

	@Column(name="MBID")
	private int mbid;

	@Column(name="Name", length=50)
	private String name;

	public PrintmbMX() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAligment() {
		return this.aligment;
	}

	public void setAligment(int aligment) {
		this.aligment = aligment;
	}

	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDisplayFormat() {
		return this.displayFormat;
	}

	public void setDisplayFormat(String displayFormat) {
		this.displayFormat = displayFormat;
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

	public int getIBody() {
		return this.iBody;
	}

	public void setIBody(int iBody) {
		this.iBody = iBody;
	}

	public int getIFlag() {
		return this.iFlag;
	}

	public void setIFlag(int iFlag) {
		this.iFlag = iFlag;
	}

	public int getIHeight() {
		return this.iHeight;
	}

	public void setIHeight(int iHeight) {
		this.iHeight = iHeight;
	}

	public int getILeft() {
		return this.iLeft;
	}

	public void setILeft(int iLeft) {
		this.iLeft = iLeft;
	}

	public int getITop() {
		return this.iTop;
	}

	public void setITop(int iTop) {
		this.iTop = iTop;
	}

	public int getIType() {
		return this.iType;
	}

	public void setIType(int iType) {
		this.iType = iType;
	}

	public int getIWidth() {
		return this.iWidth;
	}

	public void setIWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getMbid() {
		return this.mbid;
	}

	public void setMbid(int mbid) {
		this.mbid = mbid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}