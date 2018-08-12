 package com.durgasoft.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean ,DisposableBean{
	
	public HelloBean()
	{
		System.out.println("Object is Created");
	}
	
	private String name;
	
	public void  setName(String name)
	{
		System.out.println("Setname----methofd execute");
		this.name=name;
	}
	public String getName() {
		System.out.println("getName ---method is exxcute");
		return name;
	}
	
	// for 2nd method
   /*
    public void init()
    
	{
		System.out.println("init_Method is execute");
	}
	
	public void destroy()
	{
		System.out.println("destroy menthod is execute");
	}
	*/
	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("after properties --method ");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Destroy method is execute");
		
	}
	public String sayHello()
	{
		return "Hello "+name+"!";
	}

}
