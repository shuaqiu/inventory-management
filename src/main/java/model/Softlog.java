package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the softlog database table.
 * 
 */
@Entity
@Table(name="softlog")
public class Softlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(length=50)
	private String caption;

	private int flag;

	@Column(nullable=false)
	private int id;

	private Timestamp lasttime;

	@Column(length=30)
	private String oper;

	private int sl;

	public Softlog() {
	}

	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getLasttime() {
		return this.lasttime;
	}

	public void setLasttime(Timestamp lasttime) {
		this.lasttime = lasttime;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public int getSl() {
		return this.sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

}