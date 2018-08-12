package com.durgasoft.beans;

public class HelloBean {
static {
System.out.println("Bean Class Loading....");
}
public HelloBean() {
System.out.println("Bean class Object Creating....");
}
public String wish() {
return "Welcome To Durga Software Solutions";
}
}