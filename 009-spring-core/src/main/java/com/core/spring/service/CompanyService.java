package com.core.spring.service;

import com.core.spring.dto.Company;

public class CompanyService {
	
	private Company company;

	public void setCompany(Company company) {
		this.company = company;
	}

	public void showCompany() {
		System.out.println("showCompany() Method in CompanyService");
		System.out.println(company );
	}
}
