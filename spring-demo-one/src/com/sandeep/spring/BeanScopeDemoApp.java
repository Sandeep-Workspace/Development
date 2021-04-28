package com.sandeep.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		//Retrieve bean from Container
		Coach coach = context.getBean("myCoach",BaseballCoach.class);
		
		//or testing scope
		Coach theCoach = context.getBean("myCoach",BaseballCoach.class);

		System.out.println("\n Both objects are equal: "+(coach == theCoach));
		
		System.out.println("\n Address of Coach:"+coach);
		
		System.out.println("\n Address of theCoach:"+theCoach);
		
		//close the context
		context.close();
	}

}
