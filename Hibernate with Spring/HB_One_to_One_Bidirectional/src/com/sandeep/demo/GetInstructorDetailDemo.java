package com.sandeep.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;

public class GetInstructorDetailDemo {

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
		
			int id =3;
			session.beginTransaction();
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, id);
			
			System.out.println("Instructor Detail:"+tempInstructorDetail);
			
			System.out.println("Associated Instructor:"+tempInstructorDetail.getInstructor());
			
			//remove association between instructordetail and instructor
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
			//deleting Instructor by deleting InstructorDetail because of Bidirectional mapping
			session.delete(tempInstructorDetail);
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
