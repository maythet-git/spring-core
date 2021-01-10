package com.core.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.spring.config.SpringConfig;
import com.core.spring.controller.CompanyController;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		CompanyController controller = (CompanyController) ctx.getBean("CompanyContrller");
		controller.getCompany();
		
		ctx.close();
	}
}
