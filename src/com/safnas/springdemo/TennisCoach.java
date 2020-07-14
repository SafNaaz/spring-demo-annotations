package com.safnas.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("fileFortuneService")
	FortuneService fortuneService;
	
	public TennisCoach() {
	}
	
	//init method
	@PostConstruct
	public void doMyStartUpStuff(){
		System.out.println("inside doMyStartUpStuff");
	}
	
	//destroy method
	@PreDestroy
	public void doMyDestroytuff(){
		System.out.println("inside doMyDestroytuff");
	}
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
