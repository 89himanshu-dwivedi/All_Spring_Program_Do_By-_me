package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
Student std=(Student)context.getBean("studentBean");
std.getStudentDetails();

	}

}
