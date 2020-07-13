package com.safnas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//calling autowired method
		System.out.println(theCoach.getDailyFortune());
		
		applicationContext.close();
	}

}
