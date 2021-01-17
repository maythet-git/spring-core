package com.core.spring.service;

import org.springframework.stereotype.Component;

import com.core.spring.dao.dto.Company;

@Component
public interface CompanyService {

	public Company findCompanyService();
}
