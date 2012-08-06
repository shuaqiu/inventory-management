package com.qiuq.inventory.bean.base

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * 倉庫信息
 * The persistent class for the CKXX database table.
 *
 */
@Entity
@Table(name="CKXX")
class Storage implements Serializable{
	static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	int id;

	/**
	 * 編號
	 */
	@Column(name="BH", length=30)
	String serialNumber;

	/**
	 * 倉庫名稱
	 */
	@Column(name="Name", length=50)
	String name;

	/**
	 * 拼音碼: 拼音的首字母
	 */
	@Column(name="PYM", length=50)
	String firstPinyin;

	/**
	 * 是否停用:
	 * <li>1: 表示已停用
	 * <li>0(或者為null): 表示未停用
	 */
	@Column(name="canUse")
	int disabled;

	// 以下的字段沒有使用
	//	int bmID;
	//
	//	@Column(length=50)
	//	String bmName;
	//
	//	@Column(name="FDID")
	//	int fdid;
	//
	//	@Column(length=50)
	//	String FDName;
	//
	//	@Column(name="SortID")
	//	int sortID;
}
