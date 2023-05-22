package com.EmployeeEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
		
		Employee e=(Employee)context.getBean("e1");
		
		System.out.println(e);

	}

}
