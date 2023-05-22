package com.EmployeeEx;

public class Employee {

	private int eid;
	private String ename;
	private Address a;
	
	public Employee(int eid, String ename, Address a) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.a = a;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", a=" + a + "]";
	}
	
	
	
}
