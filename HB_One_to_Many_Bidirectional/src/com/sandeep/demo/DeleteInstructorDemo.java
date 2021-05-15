package com.sandeep.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Course;
import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;

public class DeleteInstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).
				addAnnotatedClass(InstructorDetail.class).
				addAnnotatedClass(Course.class).buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();

		try {

			int id =13;

			//begin transaction
			session.beginTransaction();	

			Course tempCourse  = session.get(Course.class,id);

			session.delete(tempCourse);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
	}

}
