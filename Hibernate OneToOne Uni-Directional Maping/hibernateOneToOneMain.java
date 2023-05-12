package com.hibernateOneToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateOneToOneMain {

	public static void main(String[] args) {

		// create configuration object.
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml"); // give the hibernate.cfg.xml file for configure.
		
		SessionFactory factory=cfg.buildSessionFactory(); // create SessionFactory object.
	
		Department d1=new Department(); // create Department class object.
		d1.setDid(401); // set department Id.
		d1.setDname("Finance"); // set department Name.
		
		Department d2=new Department(); // create Department class object d2.
		d2.setDid(402); // set department Id.
		d2.setDname("Manufacturing"); // set department Name
		
		Department d3=new Department(); // create Department class object d3
		d3.setDid(403); // set department Id.
		d3.setDname("HR"); // set department Name.
		
		Employee e1=new Employee(); // create Employee Object e1.
		e1.setEid(101); // set employee Id.
		e1.setEname("Mueez"); // set employee Name.
		e1.setDpt(d1); // set department object.
		
		Employee e2=new Employee(); // create Employee Object e2.
		e2.setEid(102); // set employee Id.
		e2.setEname("Mazen"); // set employee Name.
		e2.setDpt(d2); // set department object.
		
		Employee e3=new Employee(); // create Employee Object e3.
		e3.setEid(103); // set employee Id.
		e3.setEname("Mantasha"); // set employee Name.
		e3.setDpt(d3); // set department object.
		
		
		
		Session s=factory.openSession(); // create Session class object.
		
		Transaction tx=s.beginTransaction(); // create Transaction Class object.
		
		s.save(e1);// save e1 object data in session object s.
		s.save(e2);// save e1 object data in session object s.
		s.save(e3);// save e1 object data in session object s.
		
		s.save(d1);// save e1 object data in session object s.
		s.save(d2);// save e1 object data in session object s.
		s.save(d3);// save e1 object data in session object s.
		
		tx.commit(); // commit the transaction.
		s.close(); // close Session object.
		factory.close(); // close SessionFacroty object.
		

	}

}
