package com.sandeep.configuration.java;

public class RunningCoach implements Coach {

	//Private field for injecting dependency
	private FortuneService fortuneService;
	
	public RunningCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	
	public RunningCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 10km everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
