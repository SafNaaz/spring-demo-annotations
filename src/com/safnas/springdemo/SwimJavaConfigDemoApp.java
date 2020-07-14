package com.safnas.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SportConfig.class);

		SwimCoach theCoach = applicationContext.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkout());

		// calling autowired method
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("email : "+theCoach.getEmail());
		System.out.println("team : "+theCoach.getTeam());

		applicationContext.close();
	}

}
