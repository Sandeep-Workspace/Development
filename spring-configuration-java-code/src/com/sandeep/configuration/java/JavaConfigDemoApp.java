package com.sandeep.configuration.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Read Java config file
				AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
				
				//get bean from spring container
				RunningCoach coach = context.getBean("runningCoach", RunningCoach.class);
				
				//call to method
				System.out.println(coach.getDailyWorkout());
			
				System.out.println(coach.getDailyFortune());
			
				//Close context
				context.close();
	}

}
