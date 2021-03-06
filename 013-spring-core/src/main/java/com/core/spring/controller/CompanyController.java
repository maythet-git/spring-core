package com.core.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.core.spring.dao.dto.Company;
import com.core.spring.service.CompanyService;

@Controller
public class CompanyController {

	CompanyService companyService;
	
	@Autowired
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	public Company getCompany() {
		return companyService.findCompanyService();
	}
}
