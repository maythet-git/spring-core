package com.core.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.spring.controller.CompanyController;
import com.core.spring.dto.Company;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		CompanyController controller = ctx.getBean(CompanyController.class);
		Company company = controller.getCompany();
		
		System.out.println(company);
		
		ctx.close();
	}
}
