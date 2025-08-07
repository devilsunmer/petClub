package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.StaffIncomeDao;
import model.Boss;
import model.CustFreeMember;
import model.StaffIncome;
import util.DbConnection;

public class StaffIncomeDaoImpl implements StaffIncomeDao{

	public static void main(String[] args) {

	}
	
	Connection connection=DbConnection.getDb();

	@Override
	public void add(StaffIncome staffIncome) {
		String sql="insert into staff_icome(staffName,staffIncome,staffFood) values(?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<StaffIncome> selectAll() {
		String sql="select * from staff_icome";
		List<StaffIncome> staffIncomeList=new ArrayList<>();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				StaffIncome staffIncome=new StaffIncome();
				staffIncome.setIdStaffIncome(resultSet.getInt("idStaffIncome"));
				staffIncome.setStaffName(resultSet.getString("staffName"));
				staffIncome.setStaffIncome(resultSet.getDouble("staffIncome"));
				staffIncome.setStaffFood(resultSet.getString("staffFood"));
				staffIncomeList.add(staffIncome);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return staffIncomeList;
	}

	@Override
	public StaffIncome selectById(Integer id) {
		String sql="select * from staff_icome where idStaffIncome=?";
		StaffIncome someone=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
				{
				someone=new StaffIncome();
				someone.setIdStaffIncome(resultSet.getInt("idStaffIncome"));
				someone.setStaffName(resultSet.getString("staffName"));
				someone.setStaffIncome(resultSet.getDouble("staffIncome"));
				someone.setStaffFood(resultSet.getString("staffFood"));

				}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return someone;
	}

	@Override
	public StaffIncome selectByName(String staffName) {
		String sql="select * from staff_icome where staffName=?";
		StaffIncome someone=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, staffName);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
				{
				someone=new StaffIncome();
				someone.setIdStaffIncome(resultSet.getInt("idStaffIncome"));
				someone.setStaffName(resultSet.getString("staffName"));
				someone.setStaffIncome(resultSet.getDouble("staffIncome"));
				someone.setStaffFood(resultSet.getString("staffFood"));
				}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return someone;
	}

	@Override
	public StaffIncome selectByFood(String staffFood) {
		String sql="select * from staff_icome where staffFood=?";
		StaffIncome someone=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, staffFood);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
				{
				someone=new StaffIncome();
				someone.setIdStaffIncome(resultSet.getInt("idStaffIncome"));
				someone.setStaffName(resultSet.getString("staffName"));
				someone.setStaffIncome(resultSet.getDouble("staffIncome"));
				someone.setStaffFood(resultSet.getString("staffFood"));
				}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return someone;
	}

	@Override
	public StaffIncome updateIncome(StaffIncome staffIncome) {
		String sql="update staff_icome set staffName=?,staffIncome=?,staffFood=? where idStaffIncome=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			if(selectById(staffIncome.getIdStaffIncome())!=null) 
			{
				preparedStatement.setString(1, staffIncome.getStaffName());
				preparedStatement.setDouble(2, staffIncome.getStaffIncome());
				preparedStatement.setString(3, staffIncome.getStaffFood());
				preparedStatement.setInt(4, staffIncome.getIdStaffIncome());
				preparedStatement.executeUpdate();
				return staffIncome;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public StaffIncome deleteIncome(StaffIncome staffIncome) {
		String sql="delete from staff_icome where idStaffIncome=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			if(selectById(staffIncome.getIdStaffIncome())!=null)
			{
				preparedStatement.setInt(1, staffIncome.getIdStaffIncome());
				preparedStatement.executeUpdate();
				return staffIncome;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
