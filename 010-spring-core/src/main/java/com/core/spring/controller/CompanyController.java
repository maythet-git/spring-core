package com.core.spring.controller;

import com.core.spring.service.CompanyService;

public class CompanyController {

	CompanyService companyService;
	
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	public void getCompany() {
		companyService.showComapny();
	}
}
