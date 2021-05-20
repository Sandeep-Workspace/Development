package com.sandeep.spring;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	Random rand = new Random();
	
	private String fortune[] = {"Fortune and Love favor the brave",
								"Formal education will make you a living; self-education will make you a fortune",
								"Every man is the architect of his own fortune",
								"A wise man turns chance into good fortune"};
	@Override
	public String getFortune() {
					
		return fortune[rand.nextInt(4)];
	}

}
