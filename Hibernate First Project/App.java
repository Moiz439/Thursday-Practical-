package com.jdbcproject.HibernateEx;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Project has Started.!!!");
        // Create Configuration 
        Configuration cfg=new Configuration(); // create configuration object.
        cfg.configure("hibernate.cfg.xml"); // cofigure the hibernate.cfg.xml file.
        // building the session factory on the configuration.
        SessionFactory factory=cfg.buildSessionFactory(); // Create 
        // create the object.
        Student sd=new Student();
        sd.setSid(103);
        sd.setSname("Mantasha Shaikh");
        sd.setSage(17);
        
        // starting the session in the session factory.
        Session session=factory.openSession();
        // starting the transaction
        Transaction ts=session.beginTransaction();
        // Pushing the object in the session.
        session.save(sd);
        // save the transaction.
        ts.commit();
        // closing the session and the factory.
        session.close();
        factory.close();
    }
}
