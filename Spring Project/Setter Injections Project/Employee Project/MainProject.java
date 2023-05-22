package com.EmployeeProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProject {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
		
		Employee e=(Employee)context.getBean("e1");
		Employee e2=(Employee)context.getBean("e2");
		System.out.println(e);
		System.out.println(e2);
	}

}
