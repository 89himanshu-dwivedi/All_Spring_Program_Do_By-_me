package com.durgasoft.beans;

public class Employee {

	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	
	public Employee(String eid,String ename,float esal,String eaddr)

{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
		
}
	public void getEmpDetails()
	{
		System.out.println("Emplyee Details");
				System.out.println("...................");
				System.out.println("Emp Id  :"+eid);
				System.out.println("Emp Name  :"+ename);
				System.out.println("Emp Sal  :"+esal);
				System.out.println("Emp Address  :"+eaddr);

	}
}
