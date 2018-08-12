package com.durgasoft;

public class MyThread1 extends Thread {
	
	A a;
	MyThread1(A a)
	{
		this.a=a;
		
	}
	public void run()
	{
		ThreadScope.scope.set("AAA");
		//mt1.setName("XXThread");
		
		a.m1();
	}

}
