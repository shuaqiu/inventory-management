package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TCFAMX database table.
 * 
 */
@Entity
@Table(name="TCFAMX")
public class Tcfamx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="FAID")
	private int faid;

	private BigDecimal JBEnd;

	private BigDecimal JBStart;

	private int sortid;

	@Column(name="TCBL")
	private BigDecimal tcbl;

	public Tcfamx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFaid() {
		return this.faid;
	}

	public void setFaid(int faid) {
		this.faid = faid;
	}

	public BigDecimal getJBEnd() {
		return this.JBEnd;
	}

	public void setJBEnd(BigDecimal JBEnd) {
		this.JBEnd = JBEnd;
	}

	public BigDecimal getJBStart() {
		return this.JBStart;
	}

	public void setJBStart(BigDecimal JBStart) {
		this.JBStart = JBStart;
	}

	public int getSortid() {
		return this.sortid;
	}

	public void setSortid(int sortid) {
		this.sortid = sortid;
	}

	public BigDecimal getTcbl() {
		return this.tcbl;
	}

	public void setTcbl(BigDecimal tcbl) {
		this.tcbl = tcbl;
	}

}