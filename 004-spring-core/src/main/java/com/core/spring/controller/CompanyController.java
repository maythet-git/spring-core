package com.core.spring.controller;

import com.core.spring.service.CompanyService;

public class CompanyController {

	private CompanyService companyService;
	
	

	public CompanyController(CompanyService comService) {
		super();
		this.companyService = comService;
	}



	public void getCompany() {
		companyService.showCompany();
	}
}
