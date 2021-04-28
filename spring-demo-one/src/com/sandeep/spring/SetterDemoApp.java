package com.sandeep.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load the Spring Configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//Retrieve bean from Container
				CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
				
				//call methods on bean
				System.out.println(coach.getDailyWorkout());
				
				System.out.println(coach.getDailyFortune());
				
				System.out.println(coach.getEmailAddress());
				
				System.out.println(coach.getTeam());
				
				//close the context
				context.close();
	}

}
