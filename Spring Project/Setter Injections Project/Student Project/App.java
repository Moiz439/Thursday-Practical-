package com.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // here application context for configuration.
    	ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
    	
    	Student std=(Student)context.getBean("s1");
    	//Student std2=(Student)context.getBean("s2");
    	System.out.println(std);
    	//System.out.println(std2);
    	
    }
}
