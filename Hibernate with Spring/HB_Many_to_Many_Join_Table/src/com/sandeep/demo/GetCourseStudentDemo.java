package com.sandeep.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sandeep.entity.Course;
import com.sandeep.entity.Instructor;
import com.sandeep.entity.InstructorDetail;
import com.sandeep.entity.Review;
import com.sandeep.entity.Student;

public class GetCourseStudentDemo {

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
/*
			int id=1;
			Student tempStudent = session.get(Student.class,id);
			
			System.out.println("Student Details:"+tempStudent);
			System.out.println("==========================================");
			System.out.println("Course enrolled by Student:"+tempStudent.getCourses());
*/
			int id =10;
			
			Course course = session.get(Course.class, id);
			
			System.out.println("Course Details:"+course);
			System.out.println("============================================");
			System.out.println("Student enrolled for course:"+course.getStudents());
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
