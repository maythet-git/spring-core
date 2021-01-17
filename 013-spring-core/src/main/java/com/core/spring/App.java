package com.core.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.core.spring.config.SpringConfig;
import com.core.spring.controller.CompanyController;
import com.core.spring.dao.dto.Company;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		CompanyController controller = context.getBean(CompanyController.class);
		
		Company company = controller.getCompany();
		
		System.out.println(company);
		
		context.close();
	}
}
