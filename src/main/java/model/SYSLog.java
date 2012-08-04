package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SYSLog database table.
 * 
 */
@Entity
@Table(name="SYSLog")
public class SYSLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="FDID")
	private int fdid;

	@Column(length=50)
	private String FDName;

	private Timestamp idate;

	@Column(name="Note", length=250)
	private String note;

	@Column(name="Oper", length=30)
	private String oper;

	@Column(name="OpIP", length=30)
	private String opIP;

	@Column(name="OpType", length=100)
	private String opType;

	public SYSLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFdid() {
		return this.fdid;
	}

	public void setFdid(int fdid) {
		this.fdid = fdid;
	}

	public String getFDName() {
		return this.FDName;
	}

	public void setFDName(String FDName) {
		this.FDName = FDName;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getOpIP() {
		return this.opIP;
	}

	public void setOpIP(String opIP) {
		this.opIP = opIP;
	}

	public String getOpType() {
		return this.opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

}