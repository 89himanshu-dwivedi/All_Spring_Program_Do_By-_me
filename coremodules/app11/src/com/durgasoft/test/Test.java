package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext applc=new ClassPathXmlApplicationContext("applicationContext.xml");
		
        HelloBean bean=(HelloBean)applc.getBean("helloBean");
        System.out.println(bean.sayHello());
        applc.registerShutdownHook();
	}

}
