package com.durgasoft.beans;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EmployeeService {

	private String driver_Class;
	private String driver_URL;
	private String db_User_Name;
	private String db_Pwd;
	
	Connection con;
	Statement  st;
	
	public String getDriver_Class() {
		return driver_Class;
	}
	public void setDriver_Class(String driver_Class) {
		this.driver_Class = driver_Class;
	}
	public String getDriver_URL() {
		return driver_URL;
	}
	public void setDriver_URL(String driver_URL) {
		this.driver_URL = driver_URL;
	}
	public String getDb_User_Name() {
		return db_User_Name;
	}
	public void setDb_User_Name(String db_User_Name) {
		this.db_User_Name = db_User_Name;
	}
	public String getDb_Pwd() {
		return db_Pwd;
	}
	public void setDb_Pwd(String db_Pwd) {
		this.db_Pwd = db_Pwd;
	}
	public void init() {
		try
		{
			Class.forName(driver_Class);
		 con=DriverManager.getConnection(driver_URL,db_User_Name,db_Pwd);
		 st=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();}
		}
	
	public void getEmpDetails()
	{
		try
		{
			
		/*	Class.forName(driver_Class);
			 con=DriverManager.getConnection(driver_URL,db_User_Name,db_Pwd);
		 st=con.createStatement();
		*/
		ResultSet rs=st.executeQuery("select * from emp1");
		System.out.println("EID\tENAME\tESAL\tEADDR");
		System.out.println("..............................................");
		while(rs.next())
		{
			System.out.print(rs.getString("EID")+"\t");
			System.out.print(rs.getString("ENAME")+"\t");
			System.out.print(rs.getString("ESAL")+"\t");
			System.out.println(rs.getString("EADDR")+"\t");
			
	
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println
	}
	
}
