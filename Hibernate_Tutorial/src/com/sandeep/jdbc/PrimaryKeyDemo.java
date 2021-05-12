package com.sandeep.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
				SessionFactory sessionFactory = new Configuration().
												configure("hibernate.cfg.xml").
												addAnnotatedClass(Student.class).
												buildSessionFactory();
				
				//create session
			/*	Session session = sessionFactory.getCurrentSession();
				
				//Create a Student Object
				System.out.println("Creating student object");
				Student object = new Student("Sandeep","Chouhan","sandeep@gmail.com");
				Student object1 = new Student("Mayank","Chouhan","mayank@gmail.com");
				Student object2 = new Student("Nitu","Chouhan","nitu@gmail.com");
				Student object3 = new Student("Pooja","Chouhan","pooja@gmail.com");
				Student object4 = new Student("Anil","Chouhan","anil@gmail.com");
				
				//begin transaction
				session.beginTransaction();
				
				//Save entity object
				session.save(object);
				session.save(object1);
				session.save(object2);
				session.save(object3);
				session.save(object4);
				
				
				//commit transaction
				session.getTransaction().commit();
				
				System.out.println("Done!");
				
				session.close();
				*/

	}

}
