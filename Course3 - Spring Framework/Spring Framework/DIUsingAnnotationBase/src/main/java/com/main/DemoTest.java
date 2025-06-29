package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.Employee;
import com.config.MyConfiguration;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource res = new ClassPathResource("beans.xml"); // load xml file it must be inside src folder
		//BeanFactory obj = new XmlBeanFactory(res);			// created BeanFactory reference.

//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");	// load xml file 
AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class); // load the configuration class. 
Address add = (Address)ac.getBean("address");
System.out.println(add);
add.setCity("Bangalore");
add.setState("Kar");
System.out.println(add);
Employee emp = (Employee)ac.getBean("employee");
System.out.println(emp);
	}

}








