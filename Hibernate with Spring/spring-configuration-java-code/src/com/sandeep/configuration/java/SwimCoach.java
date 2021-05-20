package com.sandeep.configuration.java;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	//Private field to inject dependencies
	private FortuneService fortuneService;
	
	//private field to inject values from properties file
	@Value("${User.email}")
	private String email;
	
	//private field to inject values from properties file
	@Value("${User.team}")
	private String team;
	
	public SwimCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim with more speed and improve technique";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
}
