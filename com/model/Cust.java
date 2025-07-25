package com.model;

public class Cust {
	private static String name;
	private static String phone;
	
	public Cust() {
		super();
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Cust.name = name;
	}
	public static String getPhone() {
		return phone;
	}
	public static void setPhone(String phone) {
		Cust.phone = phone;
	}
	
	

}
