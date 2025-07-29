package com.dao;

import com.model.CustMember;

public interface CustMemberDao {
	// create
	void addCustMember(String name,String username, String password,String phone);
	void addCustMember(CustMember custMember);

	// read
	CustMember readCustMember(int id);
	String readCustMember(CustMember custMember);

	// update
	CustMember updateCustMember(CustMember custMember);
	

	// delete
	CustMember deleteCustMember(CustMember custMember);

}
