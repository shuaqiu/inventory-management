package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CXSP database table.
 * 
 */
@Entity
@Table(name="CXSP")
public class Cxsp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="FAID")
	private int faid;

	private int spid;

	public Cxsp() {
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

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

}