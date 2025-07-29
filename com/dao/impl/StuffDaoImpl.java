package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.StuffDao;
import com.model.Staff;
import com.util.petClubConnection;

public class StuffDaoImpl implements StuffDao{
	public static void main(String[] args) {
		

	}
	
	private static Connection connection=petClubConnection.getDb();

	@Override
	public void addStuff(Staff stuff) {
		String sql="insert into stuff(stuffname,stuffusername,stuffpassword) values(?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, stuff.getName());
			preparedStatement.setString(2, stuff.getUsername());
			preparedStatement.setString(3, stuff.getPassword());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String searchAllStuff(Staff staff) {
		String sql="select * from stuff where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateStuff() {
		String sql="";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void deleteStuff(Staff staff) {
		String sql="";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void searchSomeStuff(int id) {
		// TODO Auto-generated method stub
		
	}

}
