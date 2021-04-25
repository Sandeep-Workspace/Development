package com.sandeep.spring;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on Batting Practice";
	}
}
