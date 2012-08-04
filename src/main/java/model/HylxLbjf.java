package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HYLX_LBJF database table.
 * 
 */
@Entity
@Table(name="HYLX_LBJF")
public class HylxLbjf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private int hylbid;

	@Column(length=50)
	private String hylbname;

	@Column(name="JF")
	private int jf;

	private int spflID;

	@Column(length=50)
	private String spflName;

	@Column(name="XFJE")
	private BigDecimal xfje;

	public HylxLbjf() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHylbid() {
		return this.hylbid;
	}

	public void setHylbid(int hylbid) {
		this.hylbid = hylbid;
	}

	public String getHylbname() {
		return this.hylbname;
	}

	public void setHylbname(String hylbname) {
		this.hylbname = hylbname;
	}

	public int getJf() {
		return this.jf;
	}

	public void setJf(int jf) {
		this.jf = jf;
	}

	public int getSpflID() {
		return this.spflID;
	}

	public void setSpflID(int spflID) {
		this.spflID = spflID;
	}

	public String getSpflName() {
		return this.spflName;
	}

	public void setSpflName(String spflName) {
		this.spflName = spflName;
	}

	public BigDecimal getXfje() {
		return this.xfje;
	}

	public void setXfje(BigDecimal xfje) {
		this.xfje = xfje;
	}

}