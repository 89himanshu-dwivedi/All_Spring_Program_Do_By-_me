package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =new ClassPathXmlApplicationContext("spring_config.xml");
	
	HelloBean bean=(HelloBean)context.getBean("helloBean");
	bean.setName("himanshu");
	String message=bean.sayHello();
   System.out.println(message);
	}

}
