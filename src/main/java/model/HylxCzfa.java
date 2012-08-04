package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HYLX_CZFA database table.
 * 
 */
@Entity
@Table(name="HYLX_CZFA")
public class HylxCzfa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="CZJE")
	private BigDecimal czje;

	private int hylbid;

	@Column(length=50)
	private String hylbname;

	@Column(name="Name", length=50)
	private String name;

	@Column(name="ZSJE")
	private BigDecimal zsje;

	public HylxCzfa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getCzje() {
		return this.czje;
	}

	public void setCzje(BigDecimal czje) {
		this.czje = czje;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getZsje() {
		return this.zsje;
	}

	public void setZsje(BigDecimal zsje) {
		this.zsje = zsje;
	}

}