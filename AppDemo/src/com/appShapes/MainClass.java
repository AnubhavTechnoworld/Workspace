package com.appShapes;

import org.aspectj.lang.annotation.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ShapesService service= (ShapesService) context.getBean("shapesService");
		System.out.println(service.getCircle().getName());

	}
	
	

}
