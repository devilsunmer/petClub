package com.model;

public class Staff {
		/*
		enum StaffTittle；
		SHYBABY("害羞小孩"),
		HAPPYBABY("活潑小孩"),
		MADBABY("易怒小孩");
		*/
	Integer id;
	String name;
	String username;
	String password;
	
	public Staff() {
		super();
	}

	public Staff(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
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
	
	
	
	
	
	
	
}
