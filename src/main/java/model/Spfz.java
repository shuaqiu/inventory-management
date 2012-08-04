package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SPFZ database table.
 * 
 */
@Entity
@Table(name="SPFZ")
public class Spfz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BH", length=50)
	private String bh;

	@Column(name="Flag")
	private int flag;

	@Column(name="GroupName", length=50)
	private String groupName;

	@Column(name="Name", length=50)
	private String name;

	public Spfz() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}