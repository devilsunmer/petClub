package com.model;

public class Staff {
		/*
		enum StaffTittle；
		SHYBABY("害羞小孩"),
		HAPPYBABY("活潑小孩"),
		MADBABY("易怒小孩");
		*/
	
	private static String name;
	private static String username;
	private static String password;
	
	public Staff() {
		super();
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Staff.name = name;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		Staff.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Staff.password = password;
	}
	
	
	
}
