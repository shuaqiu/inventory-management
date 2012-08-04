package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SPGYS database table.
 * 
 */
@Entity
@Table(name="SPGYS")
public class Spgy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="GYSID")
	private int gysid;

	@Column(name="SPID")
	private int spid;

	public Spgy() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGysid() {
		return this.gysid;
	}

	public void setGysid(int gysid) {
		this.gysid = gysid;
	}

	public int getSpid() {
		return this.spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

}