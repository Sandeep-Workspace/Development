package com.sandeep.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();

		//begin transaction
		session.beginTransaction();

		List<Student> students = session.createQuery("from Student").getResultList();
/*		
		for(Student obj: students)
		{
			System.out.println("==========================================================");
			System.out.println("Student Details:"+obj);
			System.out.println("==========================================================");
		}
		
		System.out.println("Fetch All ends here");
		students= session.createQuery("from Student s where s.firstName='Sandeep'").getResultList();
		
		for(Student obj: students)
		{
			System.out.println("==========================================================");
			System.out.println("Student Details:"+obj);
			System.out.println("==========================================================");
		}
	*/	
		System.out.println("Fetch with firstName ends here");
		students= session.createQuery("from Student s where s.firstName='Sandeep'"+" OR s.email='abc@gmail.com'").getResultList();
		
		for(Student obj: students)
		{
			System.out.println("==========================================================");
			System.out.println("Student Details:"+obj);
			System.out.println("==========================================================");
		}
		
		//perform get operation
		Student obj = session.get(Student.class, 1);
		obj.setFirstName("Vijay");
		System.out.println("Get: "+obj);
		
		//Update all students at once
		session.createQuery("update Student set email='test@gmail.com'").executeUpdate();
		
		//To delete object without fetching it
		session.createQuery("Delete from Student where id in (9,10)").executeUpdate();
		
		//commit transaction
		session.getTransaction().commit(); 

	//	session = sessionFactory.getCurrentSession();
	//	session.beginTransaction();
		//System.out.println("Student details are:"+session.get(Student.class,id));
		//System.out.println("Reading Done!");

		System.out.println("Done!");


		session.close();

	}

}
