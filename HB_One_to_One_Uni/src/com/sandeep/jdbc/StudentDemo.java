package com.sandeep.jdbc;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Student;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).
				buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();

		String date="11/12/1993";

		Date dob;
		//begin transaction
		session.beginTransaction();

		Student object ;
		try {
			dob = DateUtils.parseDate(date);
			//Create a Student Object
			System.out.println("Creating student object");
			object = new Student("Sandeep","Chouhan","abc@gmail.com",dob);

			//Save entity object
			int id = (int) session.save(object);

			System.out.println("Your Id is:"+id);

			//commit transaction
			session.getTransaction().commit(); 
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			System.out.println("Studen details are:"+session.get(Student.class,id));
			System.out.println("Reading Done!");



			System.out.println("Done!");


			session.close();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
