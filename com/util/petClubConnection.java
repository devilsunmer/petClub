package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class petClubConnection {

	public static void main(String[] args) {
		System.out.println(petClubConnection.getDb());
	}
	
	public static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3306/pet_club";
		String user="root";
		String password="1234";
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	

}
