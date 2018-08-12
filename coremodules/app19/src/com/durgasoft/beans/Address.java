package com.durgasoft.beans;

public class Address {
	
private String pno;
private String street;
private String city;
private String state;

public Address(String pno,String street,String city ,String state)
{
	this.pno=pno;
	this.street=street;
	this.city=city;
  this.state=state;
	
}

/*
public String getPno() {
	return pno;
}

public void setPno(String pno) {
	this.pno = pno;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

*/

public String toString()
{
	return "["+pno+","+street+","+city+","+state+"]";
}

}


