package com.hibernateOneToMany;

import java.util.List;



import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOnToMany {

	public static void main(String[] args) {
		
		// Create Configuration Class object.
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml"); // configure the configuration file here.
		
		SessionFactory factory=cfg.buildSessionFactory(); // create sessionFactory class Object and build it.
		
		Project p1=new Project(); // create Project Class Object p1.
		p1.setPid(101); // set pid.
		p1.setPname("Liblary Management System"); // set pname.
		
		Employee e1=new Employee(); // create Employee Class Object e1.
		e1.setEid(401); // set eid.
		e1.setEname("Mueez Shaikh"); // set ename.
		e1.setProj(p1); // set project object.
		
		Employee e2=new Employee(); // create Employee Class Object e2.
		e2.setEid(402); // set eid.
		e2.setEname("Mazen Shaikh"); // set ename.
		e2.setProj(p1); //set Project object.
		
		Employee e3=new Employee(); // create Employee Class Object e3.
		e3.setEid(403); // set eid.
		e3.setEname("Mantasha Shaikh"); // set ename.
		e3.setProj(p1); // set project object.
		
		List<Employee> li=new ArrayList<Employee>(); // Create ArrayList Object.
		li.add(e1); // add all Employee Class Objects .
		li.add(e2);
		li.add(e3);
		
		p1.setEmp(li); // set ArrayList object to Employee List.
		
		Session s=factory.openSession(); // Create Session Object and openSession.
		Transaction tx=s.beginTransaction(); // create Transaction object and beginTransaction.
		
		s.save(p1); // save project p1 object to session
		s.save(e1); // save project e1 object to session
		s.save(e2); // save project e2 object to session
		s.save(e3); // save project e3 object to session
		
		tx.commit(); // commit the transaction.
		s.close();  // close session.
		factory.close(); // closs sessionfactory.
		
	}

}
