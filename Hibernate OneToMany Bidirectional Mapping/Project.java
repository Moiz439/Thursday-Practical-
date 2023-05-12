package com.hibernateOneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // It is used to create table as a name Project .
public class Project { // create Project Class.

	@Id // it is to give a primary key to the specific column. 
	@Column(name="project_Id") 
	private int pid;
	@Column(name="project_Name") // it is used to give the name to the column.
	private String pname;
	@OneToMany(mappedBy="proj") // it is used to give relation of One to Many and mappedBy is used to avoid the extra 3rd table.
	private List<Employee> emp; // create Employee Class type List.

	//getter and setter
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
	
}
