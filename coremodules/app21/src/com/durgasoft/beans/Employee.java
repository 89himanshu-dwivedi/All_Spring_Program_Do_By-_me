package com.durgasoft.beans;

public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
private Account acc;

public Employee(String eid,String ename,float esal,String eaddr,Account acc )
{
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
	this.eaddr=eaddr;
	this.acc=acc;
	
}

public void getEmployeeDetails() 
{
	System.out.println("Employee Details.");
System.out.println("..................");
System.out.println("Employee Id       "+eid);
System.out.println("Employee Name     "+ename);
System.out.println("Employee Sal       "+esal);
System.out.println("Employee Addresss  "+eaddr);
System.out.println("Account details    "+acc);
}

/*
public void getEmployeeDetails() {
	// TODO Auto-generated method stub
	
}
*/
}
