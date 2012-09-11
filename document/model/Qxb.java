package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the QXB database table.
 * 
 */
@Entity
@Table(name="QXB")
public class Qxb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=50)
	private String name;

	@Column(length=50)
	private String xm;

	@Column(length=250)
	private String xmValue;

	public Qxb() {
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

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXmValue() {
		return this.xmValue;
	}

	public void setXmValue(String xmValue) {
		this.xmValue = xmValue;
	}

}