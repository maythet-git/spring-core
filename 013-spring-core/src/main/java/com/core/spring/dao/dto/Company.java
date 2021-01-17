package com.core.spring.dao.dto;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private Integer id;
	private String name;
	private String address;
	private String phone;

	public Company() {
		//init();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*
	 * private void init() { this.id = 1; this.name = "GIC"; this.address = "Japan";
	 * this.phone = "012345"; }
	 */

	public Company init() {
		this.id = 1;
		this.name = "GIC";
		this.address = "Japan";
		this.phone = "012345";

		return this;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}
