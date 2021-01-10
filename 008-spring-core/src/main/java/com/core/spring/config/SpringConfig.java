package com.core.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.core.spring.dto.Company;

@Configuration
public class SpringConfig {

	@Bean(name = "company", initMethod = "initCompany", destroyMethod = "destroyCompany")
	public Company getCompanyBean() {
		Company company = new Company();
		return company;
	}
}
