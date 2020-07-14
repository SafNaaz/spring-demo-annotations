package com.safnas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\npointing to same location :"+result);
		System.out.println("\nmemory location of theCoach :"+theCoach);
		System.out.println("\nmemory location of alphaCoach :"+alphaCoach);
		
		applicationContext.close();
		
		
	}

}
