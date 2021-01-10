package com.core.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.core.spring.dao.CompanyDao;
import com.core.spring.dto.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	private Company company;
	@Override
	public Company findCompany() {
		return company;
	}

}
