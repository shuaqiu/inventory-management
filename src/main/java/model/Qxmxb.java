package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the QXMXB database table.
 * 
 */
@Entity
@Table(name="QXMXB")
public class Qxmxb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="Groupid")
	private int groupid;

	private int lbid;

	@Column(length=30)
	private String xm;

	private BigDecimal zkl;

	public Qxmxb() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupid() {
		return this.groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public int getLbid() {
		return this.lbid;
	}

	public void setLbid(int lbid) {
		this.lbid = lbid;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public BigDecimal getZkl() {
		return this.zkl;
	}

	public void setZkl(BigDecimal zkl) {
		this.zkl = zkl;
	}

}