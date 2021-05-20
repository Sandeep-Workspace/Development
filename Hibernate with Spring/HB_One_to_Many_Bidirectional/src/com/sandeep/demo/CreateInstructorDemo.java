package com.sandeep.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Course;
import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;

public class CreateInstructorDemo {

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
			/*
			//create the object
			Instructor tempInstructor = new Instructor("Sandeep","Chouhan","chouhan.sandeep003@gmail.com");

			InstructorDetail tempInstructorDetail = new InstructorDetail("www.youtube.cpm/luv2code","luv2code");

			Instructor tempInstructor = new Instructor("Mayank","Chouhan","mayankchouhan@gmail.com");

			InstructorDetail tempInstructorDetail = new InstructorDetail("www.youtube.com/luv2help","luv2help");

			//associate the object
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			 */
			int id =5;
			// Course object created to add and associate with instructor
			Course tempCourse1 = new Course("Java Complete Master Class");
			Course tempCourse2 = new Course("Spring Complete Master Class");

			//begin transaction
			session.beginTransaction();	

			Instructor tempInstructor = session.get(Instructor.class,id);


			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);

			session.save(tempCourse1);
			session.save(tempCourse2);

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
