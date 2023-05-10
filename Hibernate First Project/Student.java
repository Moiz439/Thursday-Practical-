package com.jdbcproject.HibernateEx;

import javax.persistence.Column; // import class file.
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//entity file ,pojo file

@Entity // it is used to create a table.
@Table(name="Student_Table") // set name to the Table.
public class Student { // create student class.

	@Id // it is used to set the column as primary key by using @Id annotation.
	@Column(name="Student_Id") // cset the column name @Column annotation.
	private int sid; // declare variables as private . 
	@Column(name="Student_Name")
	private String sname;
	@Column(name="Student_Age")
	private int sage;
	
	// create setter and getter methods here.
	public int getSid() { 
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}

	
}
