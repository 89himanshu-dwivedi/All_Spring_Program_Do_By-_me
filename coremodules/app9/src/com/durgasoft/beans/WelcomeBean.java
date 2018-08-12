package com.durgasoft.beans;

public class WelcomeBean {

	static {
		System.out.println("W Bean Loading.....");
		}
	
	public WelcomeBean() {
		System.out.println("W Bean Created....");
		}
		public String sayHello() {
		return "W Hello User";
		}
}
