package com.durgasoft.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String sid;
	private String sname;
	private Address std_Temp_Addr;
	private  Address std_Perm_Addr;
	private List<String> squal;
	private Set<String> scourses;
	private Map<String,String>scourse_And_Faculty;
	private Properties scourse_And_Cost;
	
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getStd_Temp_Addr() {
		return std_Temp_Addr;
	}
	public void setStd_Temp_Addr(Address std_Temp_Addr) {
		this.std_Temp_Addr = std_Temp_Addr;
	}
	public Address getStd_Perm_Addr() {
		return std_Perm_Addr;
	}
	public void setStd_Perm_Addr(Address std_Perm_Addr) {
		this.std_Perm_Addr = std_Perm_Addr;
	}
	public List<String> getSqual() {
		return squal;
	}
	public void setSqual(List<String> squal) {
		this.squal = squal;
	}
	public Set<String> getScourses() {
		return scourses;
	}
	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}
	public Map<String, String> getScourse_And_Faculty() {
		return scourse_And_Faculty;
	}
	public void setScourse_And_Faculty(Map<String, String> scourse_And_Faculty) {
		this.scourse_And_Faculty = scourse_And_Faculty;
	}
	public Properties getScourse_And_Cost() {
		return scourse_And_Cost;
	}
	public void setScourse_And_Cost(Properties scourse_And_Cost) {
		this.scourse_And_Cost = scourse_And_Cost;
	}
	
	
	public void getStudentDetails()
	{
	
		System.out.println("Student Details");
		System.out.println("......................");
		
		System.out.println("student id                 :\t"+sid);   
		System.out.println("student name               :\t"+sname);
		System.out.println("student Temp Addr          :\t"+std_Temp_Addr);
		System.out.println("student Perm Addrr         :\t"+std_Perm_Addr);
		System.out.println("student Qualification      :\t"+squal);
		System.out.println("student Courses            :\t"+scourses);  
		System.out.println("student course and Faculty :\t"+scourse_And_Faculty);  
		System.out.println("students Course And Cost   :\t"+scourse_And_Cost);  
		
		
	}

}
