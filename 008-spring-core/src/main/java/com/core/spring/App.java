package com.core.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.core.spring.config.SpringConfig;
import com.core.spring.dto.Company;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Company company = (Company) ctx.getBean("company");
		Company company1 = (Company) ctx.getBean("company");
		
		if(company == company1) {
			System.out.println("Same Company Bean");
		} else {
			System.out.println("Not Same Company Bean");
		}
		
		ctx.close();
	}
}
