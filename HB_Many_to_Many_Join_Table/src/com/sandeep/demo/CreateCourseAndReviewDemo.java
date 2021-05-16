package com.sandeep.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Course;
import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;
import com.sandeep.entity.Review;

public class CreateCourseAndReviewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).
				addAnnotatedClass(InstructorDetail.class).
				addAnnotatedClass(Course.class).
				addAnnotatedClass(Review.class).buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();

		try {

			//begin transaction
			session.beginTransaction();	

			//Create course Object
			Course course =new Course("Rest Web Services");
						
			//Create multiple Review Object and add it to Course Object
			course.addReview(new Review("Great Course. Good Explanation."));
			course.addReview(new Review("I was looking for this curse for long time.It helped me a lot"));
			course.addReview(new Review("Minute details were not missed."));
			course.addReview(new Review("Hard to understand the accent"));
			
			//save
			session.save(course);
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
