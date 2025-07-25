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
	public void addStuff(String stuffname, String stuffusername, String stuffpassword) {
		String sql="insert into stuff(stuffname,stuffusername,stuffpassword)";
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, stuffname);
			ps.setString(2, stuffusername);
			ps.setString(3, stuffpassword);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addStuff(Staff stuff) {
		// TODO Auto-generated method stub
		
	}

}
