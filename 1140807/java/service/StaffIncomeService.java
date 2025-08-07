package service;

import model.StaffIncome;

public interface StaffIncomeService {
	//create
	void addStaffIncome();

	//read
	String viewStaffIncome();
	String viewStaffName(String staffName);
	String viewStaffFood();

	//update
	boolean changeStaffIncome(StaffIncome staffIncome);

	//delete
	boolean deleteStaffIncome(StaffIncome staffIncome);
}
