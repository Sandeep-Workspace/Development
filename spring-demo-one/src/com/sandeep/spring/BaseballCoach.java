package com.sandeep.spring;

public class BaseballCoach implements Coach {

	//defining private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Inside init method");
	}
	
	//add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("Inside Destroy method");
	}
}
