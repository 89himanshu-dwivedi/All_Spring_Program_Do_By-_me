package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;

public class Test {
	public static void main(String kl[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("/configs/applicationContext.xml");
			
			HelloBean bean=(HelloBean)context.getBean("helloBean");
	String message=bean.sayHello();
	System.out.println(message);
}
}
