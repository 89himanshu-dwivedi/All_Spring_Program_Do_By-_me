package com.durgasoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;

@Configuration
public class BeanConfig {

	
	@Bean
	public HelloBean helloBean(){
		System.out.println("from helloBean Method()");
	return new HelloBean();
		}

		
		@Bean
			public WelcomeBean welcomeBean() {
			System.out.println("from welcomeBean Method()");
			return new WelcomeBean();
			}
}
