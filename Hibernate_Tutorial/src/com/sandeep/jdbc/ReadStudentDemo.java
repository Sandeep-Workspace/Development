package com.sandeep.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();

		//Insert a record int db
		
		//create session
	/*	Session session = sessionFactory.getCurrentSession();

		//Create a Student Object
		System.out.println("Creating student object");
		Student object = new Student("Gaurank","Chouhan","goru@gmail.com");

		//begin transaction
		session.beginTransaction();

		//Save entity object
		session.save(object);

		//commit transaction
		session.getTransaction().commit();

		System.out.println("Done!");

		session.close();

		//Read a record from db
		session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Student temp = session.get(Student.class, object.getId());
		
		System.out.println("Object fetched from db:"+temp);
		
		System.out.println("Reading part done");
	*/		
	}

}
