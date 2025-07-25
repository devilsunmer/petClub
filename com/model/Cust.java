package com.model;

public class Cust {
	private Integer id;
	private String username=null;
	private String password=null;
	private String name;
	private String phone;
	
	public Cust() {
		super();
	}

	public Cust(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
