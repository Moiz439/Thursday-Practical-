package com.hibernateMamyToMany;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateManyToManyMain {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("Mueez");
		
		Employee e2=new Employee();
		e2.setEid(102);
		e2.setEname("Sk");
		
		Employee e3=new Employee();
		e3.setEid(103);
		e3.setEname("Joshma");
		
		Project p1=new Project();
		p1.setPid(401);
		p1.setPname("Library Management System");
		
		Project p2=new Project();
		p2.setPid(402);
		p2.setPname("Restaurant Management System");
		
		Project p3=new Project();
		p3.setPid(403);
		p3.setPname("School Project");
		
		// List of Project.
		
		List<Project> pl1=new ArrayList<Project>();
		pl1.add(p1);
		pl1.add(p2);
		
		List<Project> pl2=new ArrayList<Project>();
		pl2.add(p2);
		pl2.add(p3);
		
		List<Employee> el1=new ArrayList<Employee>();
		el1.add(e1);
		el1.add(e2);
		el1.add(e3);
		
		List<Employee> el2=new ArrayList<Employee>();
		el2.add(e2);
		el2.add(e3);
		
		e1.setProj(pl1);
		e2.setProj(pl2);
		e3.setProj(pl2);
		
		p1.setEmp(el2);
		p1.setEmp(el1);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		tx.commit();
		s.close();
		factory.close();
		

	}

}
