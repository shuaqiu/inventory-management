package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GridSet database table.
 * 
 */
@Entity
@Table(name="GridSet")
public class GridSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	@Column(name="FieldName", length=50)
	private String fieldName;

	@Column(name="GridName", length=50)
	private String gridName;

	private int isShow;

	@Column(name="ModalID")
	private int modalID;

	@Column(name="SortID")
	private int sortID;

	@Column(name="Title", length=50)
	private String title;

	@Column(name="Width")
	private int width;

	@Column(length=50)
	private String ZDYTitle;

	public GridSet() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getGridName() {
		return this.gridName;
	}

	public void setGridName(String gridName) {
		this.gridName = gridName;
	}

	public int getIsShow() {
		return this.isShow;
	}

	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}

	public int getModalID() {
		return this.modalID;
	}

	public void setModalID(int modalID) {
		this.modalID = modalID;
	}

	public int getSortID() {
		return this.sortID;
	}

	public void setSortID(int sortID) {
		this.sortID = sortID;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getZDYTitle() {
		return this.ZDYTitle;
	}

	public void setZDYTitle(String ZDYTitle) {
		this.ZDYTitle = ZDYTitle;
	}

}