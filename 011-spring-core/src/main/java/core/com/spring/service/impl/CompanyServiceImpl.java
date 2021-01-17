package core.com.spring.service.impl;

import core.com.spring.dto.Company;
import core.com.spring.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	Company company;
	
	public CompanyServiceImpl(Company company) {
		super();
		this.company = company;
	}

	@Override
	public void showCompany() {
		System.out.println("showCompany() Method in CompanyService.");
		System.out.println(company);
	}

}
