package com.durgasoft.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeBean {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
/*	public EmployeeBean()
	{
		
	}
	*/
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
public void displayEmployeeDetails()
{
	System.out.println("Employee Deatails");
	System.out.println("E");
	
	System.out.println("id ....  ..."+eno);
	System.out.println("name......."+ename);
	System.out.println("sal........"+esal);
System.out.println("address........"+eaddr);
	
}
	
}
