package com.durgasoft.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.durgasoft.beans.HelloBean;

public class test {

public static void main(String[] args)throws Exception {
Resource resource = new ClassPathResource("sprint_config.xml");
BeanFactory factory = new XmlBeanFactory(resource);

HelloBean bean = (HelloBean)factory.getBean("helloBean");
String message = bean.wish();
System.out.println(message);


}

}