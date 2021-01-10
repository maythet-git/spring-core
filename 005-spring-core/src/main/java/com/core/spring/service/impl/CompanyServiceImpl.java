package com.core.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.spring.dao.CompanyDao;
import com.core.spring.dto.Company;
import com.core.spring.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao dao;
	
	@Override
	public Company findCompanyService() {
		Company company = dao.findCompany();
		return company;
	}

}
