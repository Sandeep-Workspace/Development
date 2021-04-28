package com.sandeep.spring;

public class TrackCoach implements Coach{

	
	//define private dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	//defining constructor for dependency injection
	public TrackCoach(FortuneService thefortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
