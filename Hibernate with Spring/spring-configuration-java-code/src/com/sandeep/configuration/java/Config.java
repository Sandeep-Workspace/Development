package com.sandeep.configuration.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.sandeep.configuration.java")
@PropertySource("classpath:sport.properties")
public class Config {

	//define bean for our sad fortune service
	@Bean
	public FortuneService angryFortuneService() {
		return new AngryFortuneService();
	}
	
	//Define bean for our swim coach and inject dependency
	@Bean
	public Coach runningCoach() {
		return new RunningCoach(angryFortuneService());
	}
}
