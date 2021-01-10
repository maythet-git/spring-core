package com.core.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring.controller.CompanyController;
import com.core.spring.dto.Company;
import com.core.spring.service.CompanyService;

@Configuration
public class SpringConfig {

	@Bean(name = "CompanyContrller")
	public CompanyController CompanyControllerBean() {
		CompanyController companyController = new CompanyController();
		companyController.setCompanyService(CompanyServiceBean());
		return companyController;
	}
	
	@Bean(name = "CompanyService")
	public CompanyService CompanyServiceBean() {
		CompanyService companyService = new CompanyService();
		companyService.setCompany(getCompanyBean());
		return companyService;
	}

	public Company getCompanyBean() {
		Company company = new Company();
		company.setId(1);
		company.setName("GIC");
		company.setAddress("JP");
		company.setPhone("011111111");
		return company;
	}
}
