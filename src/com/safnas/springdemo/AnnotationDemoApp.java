package com.safnas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = applicationContext.getBean("thatSillyCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		applicationContext.close();
	}

}
