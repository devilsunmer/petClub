package com.dao;

import com.model.Staff;

public interface StuffDao {

	// create
	void addStuff(Staff stuff);

	// read
	String searchAllStuff(Staff staff);
	void searchSomeStuff(int id);

	// update
	void updateStuff();

	// delete
	void deleteStuff(Staff staff);

}
