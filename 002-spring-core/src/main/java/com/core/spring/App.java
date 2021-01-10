package com.core.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.spring.controller.CompanyController;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		CompanyController controller = ctx.getBean(CompanyController.class);
		controller.getCompany();
		
		ctx.close();
	}
}
