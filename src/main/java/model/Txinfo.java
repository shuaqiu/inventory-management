package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the txinfo database table.
 * 
 */
@Entity
@Table(name="txinfo")
public class Txinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private Timestamp dealdate;

	@Column(length=250)
	private String dealmsg;

	@Column(length=30)
	private String dealoper;

	private Timestamp idate;

	private int isdeal;

	@Column(length=250)
	private String msg;

	@Column(name="MsgID")
	private int msgID;

	@Column(name="Oper", length=30)
	private String oper;

	private Timestamp txDate;

	@Column(name="TXLX")
	private int txlx;

	private int ygid;

	@Column(length=30)
	private String ygname;

	public Txinfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDealdate() {
		return this.dealdate;
	}

	public void setDealdate(Timestamp dealdate) {
		this.dealdate = dealdate;
	}

	public String getDealmsg() {
		return this.dealmsg;
	}

	public void setDealmsg(String dealmsg) {
		this.dealmsg = dealmsg;
	}

	public String getDealoper() {
		return this.dealoper;
	}

	public void setDealoper(String dealoper) {
		this.dealoper = dealoper;
	}

	public Timestamp getIdate() {
		return this.idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public int getIsdeal() {
		return this.isdeal;
	}

	public void setIsdeal(int isdeal) {
		this.isdeal = isdeal;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getMsgID() {
		return this.msgID;
	}

	public void setMsgID(int msgID) {
		this.msgID = msgID;
	}

	public String getOper() {
		return this.oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public Timestamp getTxDate() {
		return this.txDate;
	}

	public void setTxDate(Timestamp txDate) {
		this.txDate = txDate;
	}

	public int getTxlx() {
		return this.txlx;
	}

	public void setTxlx(int txlx) {
		this.txlx = txlx;
	}

	public int getYgid() {
		return this.ygid;
	}

	public void setYgid(int ygid) {
		this.ygid = ygid;
	}

	public String getYgname() {
		return this.ygname;
	}

	public void setYgname(String ygname) {
		this.ygname = ygname;
	}

}