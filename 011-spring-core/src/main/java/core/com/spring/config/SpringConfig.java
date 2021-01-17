package core.com.spring.config;

import org.springframework.context.annotation.Bean;

import core.com.spring.controller.CompanyController;
import core.com.spring.dto.Company;
import core.com.spring.service.CompanyService;
import core.com.spring.service.impl.CompanyServiceImpl;

public class SpringConfig {

	@Bean
	public CompanyController getCompanyController() {
		return new CompanyController(getCompanyService());
	}
	
	public CompanyService getCompanyService() {
		return new CompanyServiceImpl(getCompany());
	}
	
	public Company getCompany() {
		Company company = new Company();
		company.setId(11);
		company.setName("GIC");
		company.setAddress("Tokyo Japan");
		company.setPhone("01111122");
		return company;
	}
}
