package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the QXZ database table.
 * 
 */
@Entity
@Table(name="QXZ")
public class Qxz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=50)
	private String name;

	public Qxz() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}