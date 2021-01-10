package com.core.spring.dto;

public class Company {
	
	private Integer id;
	private String name;
	private String address;
	private String phone;
	
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
	
	public void initCompany() {
		this.id = 1;
		this.name = "GIC Japan";
		this.address = "Japan";
		System.out.println("Init Method" + this);
	}
	
	public void destroyCompany() {
		this.id = 1;
		this.name = "GIC destroy";
		this.address = "Japan destroy";
		System.out.println("Destroy Method" + this);
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
}
