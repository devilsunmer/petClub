package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.CustMemberDao;
import com.model.CustMember;
import com.util.petClubConnection;

public class CustMemberDaoImpl implements CustMemberDao{

	public static void main(String[] args) {
		/*
		CustMember custMember=new CustMemberDaoImpl().readCustMember(3);
		if(custMember!=null)
		{
			new CustMemberDaoImpl().deleteCustMember(custMember);
		}
		*/
		
		/*
		CustMember custMember=new CustMemberDaoImpl().readCustMember(2);
		if(custMember!=null)
		{
			custMember.setName("楊春梅");
			custMember.setPassword("nunu");
			custMember.setPhone("0958585858");
			new CustMemberDaoImpl().updateCustMember(custMember);
		}
		*/
		
		/*
		CustMember custMember=new CustMemberDaoImpl().readCustMember(1);
		System.out.println("姓名:"+custMember.getName());
		*/
		
//		System.out.println(new CustMemberDaoImpl().readCustMember(new CustMember()));
		
		
//		new CustMemberDaoImpl().addCustMember(new CustMember("朱友朋", "user3", "756", "0911111111"));;
		
		/*CustMemberDaoImpl cm=new CustMemberDaoImpl();
		cm.addCustMember("張小明", "user", "123", "0900000000");*/

	}
	
	private static Connection connection=petClubConnection.getDb();


	@Override
	public void addCustMember(String name, String username, String password,String phone) {
		//以防萬一還是保留舊有的方式
		String sql="insert into cust_member(name,username,password,phone) values (?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, phone);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addCustMember(CustMember custMember) {
		//物件導向注入的方式
		String sql="insert into cust_member(name,username,password,phone) values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, custMember.getName());
			preparedStatement.setString(2, custMember.getUsername());
			preparedStatement.setString(3, custMember.getPassword());
			preparedStatement.setString(4, custMember.getPhone());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		};
		
	}

	@Override
	public CustMember readCustMember(int id) {
		String sql="select * from cust_member where id=?";
		CustMember custMember=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				custMember=new CustMember();
				custMember.setId(resultSet.getInt("id"));
				custMember.setName(resultSet.getString("name"));
				custMember.setUsername(resultSet.getString("username"));
				custMember.setPassword(resultSet.getString("password"));
				custMember.setPhone(resultSet.getString("phone"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return custMember;
	}

	@Override
	public String readCustMember(CustMember custMember) {
		String sql="select * from cust_member";
		String show="";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				show=show+"id:"+resultSet.getInt("id")
					+"\t姓名:"+resultSet.getString("name")
					+"\t使用者帳號:"+resultSet.getString("username")
					+"\n密碼:"+resultSet.getString("password")
					+"\t電話:"+resultSet.getString("phone")+"\n";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return show;
	}

	@Override
	public CustMember updateCustMember(CustMember custMember) {
		String sql="update cust_member set name=?,password=?,phone=? where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, custMember.getName());
			preparedStatement.setString(2, custMember.getPassword());
			preparedStatement.setString(3, custMember.getPhone());
			preparedStatement.setInt(4, custMember.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return null;
	}

	@Override
	public CustMember deleteCustMember(CustMember custMember) {
		String sql="delete from cust_member where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, custMember.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return null;
	}

}
