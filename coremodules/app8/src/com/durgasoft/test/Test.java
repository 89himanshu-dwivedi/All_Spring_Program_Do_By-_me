package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.scopes.ThreadScope;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean bean1 = (HelloBean)context.getBean("helloBean");
		HelloBean bean2 = (HelloBean)context.getBean("helloBean");
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1 == bean2);
		System.out.println(bean1.sayHello());
		System.out.println(bean2.sayHello());
		ThreadScope threadScope = (ThreadScope)context.getBean("threadScope");
		HelloBean bean3 = (HelloBean)threadScope.remove("helloBean");
		System.out.println(bean3);
		HelloBean bean4 = (HelloBean)context.getBean("helloBean");
		HelloBean bean5 = (HelloBean)context.getBean("helloBean");
		System.out.println(bean4);
		System.out.println(bean5);
		System.out.println(bean4 == bean5);
		System.out.println(bean4.sayHello());
		System.out.println(bean5.sayHello());
		}
		}

	


