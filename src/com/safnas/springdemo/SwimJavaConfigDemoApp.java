package com.safnas.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SportConfig.class);

		Coach theCoach = applicationContext.getBean("swimCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		// calling autowired method
		System.out.println(theCoach.getDailyFortune());

		applicationContext.close();
	}

}
