package com.durgasoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;

@Configuration
public class HelloBeanConfig {
	
	@Bean
	public HelloBean helloBean() {
		
	return new HelloBean();
	}

	
	public class WelcomBeanConfig {
		
		@Bean
		public WelcomeBean welcomeBean() {
		return new WelcomeBean();
		}
	
	
}
}
