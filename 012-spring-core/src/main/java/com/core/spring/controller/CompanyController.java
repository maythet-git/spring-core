package com.core.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.core.spring.dao.dto.Company;
import com.core.spring.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	public Company getCompany() {
		return companyService.findCompanyService();
	}
}
