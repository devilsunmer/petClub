package com.dao;

import com.model.CustMember;

public interface CustMemberDao {
	// create
	void addCustMember(String name,String username, String password);
	void addCustMember(CustMember custMember);

	// read

	// update

	// delete

}
