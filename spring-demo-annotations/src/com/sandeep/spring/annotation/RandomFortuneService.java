package com.sandeep.spring.annotation;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	Random rand = new Random();
	/*
	private String fortune[]= {"Behind every great fortune lies a great crime",
							   "Come what may, all bad fortune is to be conquered by endurance",
							   "Fortune and love favor the brave",
							   "Formal education will make you a living; self-education will make you a fortune.",
							   "Diligence is the mother of good fortune, and idleness, its opposite, never brought a man to the goal of any of his best wishes"};
	*/	
	@Value("${User.fortune}")
	private String fortune[];
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune[rand.nextInt(fortune.length)];
	}

}
