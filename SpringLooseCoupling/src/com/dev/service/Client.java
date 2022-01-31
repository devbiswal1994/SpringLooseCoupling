package com.dev.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Jio jio = applicationContext.getBean("jio",Jio.class);
		jio.activateService();
		
	}
	

}
