package com.sandeep.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;

public class CreateDemo {

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
			//create the object
		/*	Instructor tempInstructor = new Instructor("Sandeep","Chouhan","chouhan.sandeep003@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.youtube.cpm/luv2code","luv2code");
		*/	
			Instructor tempInstructor = new Instructor("Mayank","Chouhan","mayankchouhan@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.youtube.com/luv2help","luv2help");
			
			//associate the object
			tempInstructor.setInstructorDetail(tempInstructorDetail);

			//begin transaction
			session.beginTransaction();	

			System.out.println("Saving Instructor: "+tempInstructor);
			//this will also save InstructorDetail object because of CascadeType.ALL
			session.save(tempInstructor);
			
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
