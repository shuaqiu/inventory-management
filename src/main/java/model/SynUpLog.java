package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SynUpLog database table.
 * 
 */
@Entity
@Table(name="SynUpLog")
public class SynUpLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	private Timestamp iDate;

	@Column(name="TableID")
	private int tableID;

	@Column(name="TableName", length=50)
	private String tableName;

	public SynUpLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getIDate() {
		return this.iDate;
	}

	public void setIDate(Timestamp iDate) {
		this.iDate = iDate;
	}

	public int getTableID() {
		return this.tableID;
	}

	public void setTableID(int tableID) {
		this.tableID = tableID;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}