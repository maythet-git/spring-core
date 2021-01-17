package com.core.spring.service.impl;

import com.core.spring.dto.Company;
import com.core.spring.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	Company company;
	
	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public void showComapny() {
		System.out.println("showCompany() Method in CompanyService");
		System.out.println(company);

	}

}
