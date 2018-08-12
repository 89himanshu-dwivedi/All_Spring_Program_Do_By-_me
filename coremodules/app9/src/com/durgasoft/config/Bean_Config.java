package com.durgasoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.durgasoft.beans.HelloBean;

@Configuration
public class Bean_Config {

	
	
	@Bean(name= {"bean1" , "bean2" , "bean3"})
	@Scope("singleton")
	//@Scope("prototype")
	public HelloBean helloBean(){
		System.out.println("from helloBean Method()");
	return new HelloBean();
		}
}
