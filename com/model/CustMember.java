package com.model;

public class CustMember {
	private static String name;
	private static String username;
	private static String password;
	private static String phone;
	
	public CustMember() {
		super();
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		CustMember.name = name;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		CustMember.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		CustMember.password = password;
	}
	public static String getPhone() {
		return phone;
	}
	public static void setPhone(String phone) {
		CustMember.phone = phone;
	}
	
	
	
}
