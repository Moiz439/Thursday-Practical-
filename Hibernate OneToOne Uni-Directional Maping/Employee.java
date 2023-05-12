package com.hibernateOneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // it is used to define this is a table 
public class Employee {

	@Id // this is used to give the primary key that eid column.
	private int eid;
	@Column // it indicates this is a column.
	private String ename;
	@OneToOne // this is used to create column with foreign key.
	private Department dpt; // create Department class object.
	
	// getter and setter
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDpt() {
		return dpt;
	}
	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}
	
	
}
