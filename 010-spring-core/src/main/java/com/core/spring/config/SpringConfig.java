package com.core.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring.controller.CompanyController;
import com.core.spring.dto.Company;
import com.core.spring.service.CompanyService;
import com.core.spring.service.impl.CompanyServiceImpl;

@Configuration
public class SpringConfig {

	@Bean
	public CompanyController getCompanyController() {
		CompanyController companyController = new CompanyController();
		companyController.setCompanyService(getCompanyService());
		return companyController;
	}

	public CompanyService getCompanyService() {
		CompanyServiceImpl companyService = new CompanyServiceImpl();
		companyService.setCompany(getCompany());
		return companyService;
		
	}
	
	
	public Company getCompany() {
		Company company = new Company();
		company.setId(10);
		company.setName("GIC");
		company.setAddress("Tokyo Japan");
		company.setPhone("01111122");
		return company;
	}
}
