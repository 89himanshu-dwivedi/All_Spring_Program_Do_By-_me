package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.EmployeeService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

	EmployeeService emp = (EmployeeService)context.getBean("empService");
	emp.getEmpDetails();
	}

}
