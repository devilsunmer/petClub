package com.dao.impl;

import java.sql.Connection;

import com.dao.CustMemberDao;
import com.model.CustMember;
import com.util.petClubConnection;

public class CustMemberDaoImpl implements CustMemberDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static Connection connection=petClubConnection.getDb();


	@Override
	public void addCustMember(String name, String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCustMember(CustMember custMember) {
		// TODO Auto-generated method stub
		
	}

}
