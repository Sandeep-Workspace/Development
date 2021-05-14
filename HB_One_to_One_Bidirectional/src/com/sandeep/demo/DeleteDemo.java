package com.sandeep.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).
				addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();
		
		try {
			//get instructor by primary key/id
			int id=2;
			
			//begin transaction
			session.beginTransaction();
			
			Instructor temp = session.get(Instructor.class,id);
			
			System.out.println("Found Instructor:"+temp);
					
			//delete instructor
			session.delete(temp);
			
			System.out.println("Object Deleted");
			
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
	}

}
