package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SMS database table.
 * 
 */
@Entity
@Table(name="SMS")
public class Sm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private Timestamp adddate;

	private int errsl;

	private Timestamp fsDate;

	@Column(length=500)
	private String fsnote;

	private Timestamp fswcDate;

	@Column(length=30)
	private String oper;

	private int succsl;

	private int zsl;

	private int zt;

	public Sm() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getAdddate() {
		return this.adddate;
	}

	public void setAdddate(Timestamp adddate) {
		this.adddate = adddate;
	}

	public int getErrsl() {
		return this.errsl;
	}

	public void setErrsl(int errsl) {
		this.errsl = errsl;
	}

	public Timestamp getFsDate() {
		return this.fsDate;
	}

	public void setFsDate(Timestamp fsDate) {
		this.fsDate = fsDate;
	}

	public String getFsnote() {
		return this.fsnote;
	}

	public void setFsnote(String fsnote) {
		this.fsnote = fsnote;
	}

	public Timestamp getFswcDate() {
		return this.fswcDate;
	}

	public void setFswcDate(Timestamp fswcDate) {
		this.fswcDate = fswcDate;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public int getSuccsl() {
		return this.succsl;
	}

	public void setSuccsl(int succsl) {
		this.succsl = succsl;
	}

	public int getZsl() {
		return this.zsl;
	}

	public void setZsl(int zsl) {
		this.zsl = zsl;
	}

	public int getZt() {
		return this.zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

}