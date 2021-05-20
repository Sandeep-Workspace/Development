package com.sandeep.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Course;
import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;
import com.sandeep.entity.Review;
import com.sandeep.entity.Student;

public class AddCoursesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Session Factory
		SessionFactory sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class).
				addAnnotatedClass(InstructorDetail.class).
				addAnnotatedClass(Course.class).
				addAnnotatedClass(Review.class).
				addAnnotatedClass(Student.class).buildSessionFactory();

		//create session
		Session session = sessionFactory.getCurrentSession();

		try {

			//begin transaction
			session.beginTransaction();	

			int id=1;
			Student tempStudent = session.get(Student.class,id);
			
			Course course1 = new Course("Core Java");
			Course course2 = new Course("Advanced Java");
			
			course1.addStudent(tempStudent);
			course2.addStudent(tempStudent);
			
			session.save(course1);
			session.save(course2);
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
