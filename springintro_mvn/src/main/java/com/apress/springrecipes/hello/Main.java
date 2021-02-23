package com.apress.springrecipes.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.hello();
		System.out.println(helloWorld.getHolidays());

	}
}
