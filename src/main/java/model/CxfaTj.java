package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CXFA_TJ database table.
 * 
 */
@Entity
@Table(name="CXFA_TJ")
public class CxfaTj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int colorsizetj;

	@Column(name="FAID")
	private int faid;

	private int spid;

	private BigDecimal tj;

	private BigDecimal zk;

	private int zklx;

	public CxfaTj() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getColorsizetj() {
		return this.colorsizetj;
	}

	public void setColorsizetj(int colorsizetj) {
		this.colorsizetj = colorsizetj;
	}

	public int getFaid() {
		return this.faid;
	}

	public void setFaid(int faid) {
		this.faid = faid;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public BigDecimal getTj() {
		return this.tj;
	}

	public void setTj(BigDecimal tj) {
		this.tj = tj;
	}

	public BigDecimal getZk() {
		return this.zk;
	}

	public void setZk(BigDecimal zk) {
		this.zk = zk;
	}

	public int getZklx() {
		return this.zklx;
	}

	public void setZklx(int zklx) {
		this.zklx = zklx;
	}

}