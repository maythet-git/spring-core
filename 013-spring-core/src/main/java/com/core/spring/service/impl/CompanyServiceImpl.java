package com.core.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.core.spring.dao.CompanyDao;
import com.core.spring.dao.dto.Company;
import com.core.spring.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	CompanyDao dao;
	
	@Autowired
	public void setDao(CompanyDao dao) {
		this.dao = dao;
	}

	@Override
	public Company findCompanyService() {
		Company company = dao.findCompany();
		return company;

	}

}
