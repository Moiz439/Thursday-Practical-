package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@SpringBootApplication
public class DemoProjectSbApplication {

	public static void main(String[] args) {
		// Create ApplicationContext Class object.
		ApplicationContext con= SpringApplication.run(DemoProjectSbApplication.class, args);
		// Create StudentRepo Interface Class Object.
		StudentRepo sr=con.getBean(StudentRepo.class);
		
		// create Student Class objects.
		Student s1,s2;
		s1=new Student();
		s1.setSid(103);
		s1.setSname("Moiz");
		s1.setCity("Solapur");
		
		s2=new Student();
		s2.setSid(104);
		s2.setSname("Mueez");
		s2.setCity("Pune");
		
		// saving the objects.
		Student st1,st2;
		st1=sr.save(s1);
		st2=sr.save(s2);
		
		//printing objects.
		System.out.println(st1);
		System.out.println(st2);
		
		//creating the list of all the objects.
		List<Student> studentlist=List.of(s1,s2);
		
		// save the list.
		Iterator<Student> it1=sr.saveAll(studentlist).iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		// Update data.
		//changing the name of id 101.
		Optional<Student> optional=sr.findById(101);
		Student student=optional.get();
		student.setSname("Mueez Shaikh");
		System.out.println(sr.save(student));
	
		// Reteriving all data from table.
		
		// find the data inserted in the table.
		Iterable<Student> itr=sr.findAll();
		// find the data fro the table.
		Iterator<Student> iterator=itr.iterator();
		while(iterator.hasNext())
		{
			Student st=iterator.next();
			System.out.println(st);
		}
		
		//print data from table by using forEach() methor or lambda function.
		itr.forEach(stud->System.out.println(stud));
		
		// Deleting data from table by using Id number.
		// deleting a 1 record.
		sr.deleteById(101);
		System.out.println("Data Deleted Successully...!");
		
		// deleting all data from table.
		Iterable<Student> itr1=sr.findAll();
		itr1.forEach(stud->{System.out.println(stud);});
		sr.deleteAll(itr1);
	}

}
