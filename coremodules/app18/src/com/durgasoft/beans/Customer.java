package com.durgasoft.beans;

public class Customer {

	private String cid;
	private String cname;
	private String caddr;
	public Customer(String cid,String cname,String caddr)
	{
		this.cid=cid;
		this.cname=cname;
		this.caddr=caddr;
		System.out.println("construction dependancy injection");
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
		System.out.println("setter dependaancy injection");
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	
public void fetCustomerDetails()
{
	System.out.println("customer details ");
	System.out.println("0........................0");

System.out.println("customer id:\t"+cid);
System.out.println("customer name:\t"+cname);
System.out.println("customer eaadr:\t"+caddr);
}
}
