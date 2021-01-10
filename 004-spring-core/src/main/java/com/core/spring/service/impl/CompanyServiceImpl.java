package com.core.spring.service.impl;

import com.core.spring.dto.Company;
import com.core.spring.service.CompanyService;

public class CompanyServiceImpl implements CompanyService{

	private Company company;

	public CompanyServiceImpl(Company company) {
		super();
		this.company = company;
	}

	public void showCompany() {
		System.out.println("showCompany() Method in CompanyService");
		System.out.println(company );
	}
}
