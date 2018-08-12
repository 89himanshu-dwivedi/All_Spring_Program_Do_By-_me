package com.durgasoft;

public class ThreadScope extends ThreadLocal {
	
	static ThreadScope scope=new ThreadScope();
	
	protected Object initialValue()
	{
		return "default value";
	}

}
