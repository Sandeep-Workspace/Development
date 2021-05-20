package com.sandeep.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	//Field Injection
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	
	/*Constructor Injection
	 * public TennisCoach(FortuneService thefortuneService){
	 * 		fortuneService =thefortuneService;
	 * }
	 */
	
	/*Setter Injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	 */	
	
	public String getDailyWorkout() {
		return "Practice Backhand Daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
