package com.sandeep.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Read config file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		//call to method
		System.out.println(coach.getDailyWorkout());
	
		System.out.println(coach.getDailyFortune());
		
		//Close context
		context.close();
	}

}
