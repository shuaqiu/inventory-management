package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dtproperties database table.
 * 
 */
@Entity
@Table(name="dtproperties")
public class Dtproperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DtpropertyPK id;

	private Object lvalue;

	private int objectid;

	@Column(length=255)
	private String uvalue;

	@Column(length=255)
	private String value;

	@Column(nullable=false)
	private int version;

	public Dtproperty() {
	}

	public DtpropertyPK getId() {
		return this.id;
	}

	public void setId(DtpropertyPK id) {
		this.id = id;
	}

	public Object getLvalue() {
		return this.lvalue;
	}

	public void setLvalue(Object lvalue) {
		this.lvalue = lvalue;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}

	public String getUvalue() {
		return this.uvalue;
	}

	public void setUvalue(String uvalue) {
		this.uvalue = uvalue;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}