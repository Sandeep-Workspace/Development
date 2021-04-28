package com.sandeep.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load the Spring Configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
				
				//Retrieve bean from Container
				Coach coach = context.getBean("myCoach",BaseballCoach.class);
				
				//call methods on bean
				System.out.println(coach.getDailyWorkout());
				
				System.out.println(coach.getDailyFortune());
								
				//close the context
				context.close();
	}

}
