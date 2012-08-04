package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tempdb database table.
 * 
 */
@Entity
@Table(name="tempdb")
public class Tempdb implements Serializable {
	private static final long serialVersionUID = 1L;

	private int minid;

	public Tempdb() {
	}

	public int getMinid() {
		return this.minid;
	}

	public void setMinid(int minid) {
		this.minid = minid;
	}

}