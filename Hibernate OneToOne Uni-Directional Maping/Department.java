package com.hibernateOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id // declare primary key.
	private int did;
	private String dname; // create dname variable.
	
	// setter and getter.
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
}
