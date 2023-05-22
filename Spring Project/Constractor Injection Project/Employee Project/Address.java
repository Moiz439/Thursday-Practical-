package com.EmployeeEx;

public class Address {

	int houseno;
	String societyname;
	
	public Address(int houseno, String societyname) {
		super();
		this.houseno = houseno;
		this.societyname = societyname;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", societyname=" + societyname + "]";
	}
	
	
	
}
