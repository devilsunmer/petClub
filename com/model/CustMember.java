package com.model;

public class CustMember {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String phone;
	
	public CustMember() {
		super();
	}

	public CustMember(String name, String username, String password, String phone) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
}
