package core.com.spring.controller;

import core.com.spring.service.CompanyService;

public class CompanyController {

	CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	public void getComapny() {
		companyService.showCompany();
	}
}
