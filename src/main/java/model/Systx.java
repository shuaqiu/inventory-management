package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SYSTX database table.
 * 
 */
@Entity
@Table(name="SYSTX")
public class Systx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="Flag")
	private int flag;

	@Column(name="Mac", length=50)
	private String mac;

	@Column(length=150)
	private String name;

	private int num;

	public Systx() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}