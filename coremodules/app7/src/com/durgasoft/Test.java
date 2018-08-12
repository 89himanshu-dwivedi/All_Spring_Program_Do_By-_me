package com.durgasoft;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
		MyThread1 mt1=new MyThread1(a);
		mt1.start();
	//	scope.set("AAA");
	}

}
