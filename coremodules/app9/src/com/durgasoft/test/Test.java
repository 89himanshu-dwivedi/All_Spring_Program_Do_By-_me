package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;
import com.durgasoft.config.BeanConfig;
import com.durgasoft.config.Bean_Config;
import com.durgasoft.config.HelloBeanConfig;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//ApplicationContext context = new AnnotationConfigApplicationContext(HelloBeanConfig.class);
		
//ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
				
		/*HelloBean bean = (HelloBean)context.getBean("helloBean");
		System.out.println(bean.sayHello());
		
		WelcomeBean wbean = (WelcomeBean)context.getBean("welcomeBean");
		System.out.println(wbean.sayHello());
*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Bean_Config.class);
		
		HelloBean helloBean1 = (HelloBean)context.getBean("bean1");
		System.out.println(helloBean1);
		
		HelloBean helloBean2 = (HelloBean)context.getBean("bean1");
		System.out.println(helloBean1);
		
		HelloBean helloBean3 = (HelloBean)context.getBean("bean1");
		System.out.println(helloBean1);
		
		
	}

}
