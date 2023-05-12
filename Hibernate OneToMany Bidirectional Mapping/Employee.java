package com.hibernateOneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id // It is used to create table as a name Project .
	@Column(name="employee_Id")
	private int eid;
	@Column(name="employee_Name") // it is used to give a name to the column of table.
	private String ename;
	@ManyToOne // it is used to give the relation Many to One in a tables.
	private Project proj; // create Project Class Object.
	
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
	public Project getProj() {
		return proj;
	}
	public void setProj(Project proj) {
		this.proj = proj;
	}
	
}
