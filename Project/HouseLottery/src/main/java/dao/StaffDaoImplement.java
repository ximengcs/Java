package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entry.Purchaser;
import entry.Staff;
import util.DBConnector;

/**
 * StaffDao实现类
 * @author lenovo
 *
 */
public class StaffDaoImplement implements StaffDao {

	//数据库连接
	DBConnector dbConnection = new DBConnector();
	
	/**
	 * 添加员工信息
	 */
	@Override
	public int addInfo(int EMPLOYEE_ID, String EMPLOYEE_NAME, 
			String EMPLOYEE_PASSWORD, int PRIVILEGE) {
		int row = 0;
		
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "insert into tb_employees_info"
					+ "(EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEE_PASSWORD, PRIVILEGE) "
					+ "values(?,?,?,?);";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, EMPLOYEE_ID);
			statement.setString(2, EMPLOYEE_NAME);
			statement.setString(3, EMPLOYEE_PASSWORD);
			statement.setInt(4, PRIVILEGE);
			row = statement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return row;
	}
	
	/**
	 * 根据员工工号删除信息
	 */
	@Override
	public int deleteInfo(int EMPLOYEE_ID) {
		int row = 0;
		
		Connection connection = null;
		Statement statement = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "DELETE FROM tb_employees_info WHERE EMPLOYEE_ID = " + EMPLOYEE_ID;
			statement = connection.createStatement();
			row = statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return row;
	}
	
	/**
	 * 获取员工数量
	 */
	@Override
	public int getSum() {
		int sum = 0;
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "SELECT COUNT(*) FROM tb_employees_info;";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next())
				sum = resultSet.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
	
	/**
	 * 查询所有员工信息
	 */
	@Override
	public List<Staff> selectAllInfo() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		List<Staff> list = new ArrayList<Staff>();
		
		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "select * from tb_employees_info;";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			//迭代list
			while (resultSet.next()) {
				Staff staff = new Staff();
				
				staff.setEMPLOYEE_ID(resultSet.getInt("EMPLOYEE_ID"));
				staff.setEMPLOYEE_NAME(resultSet.getString("EMPLOYEE_NAME"));
				staff.setEMPLOYEE_PASSWORD(resultSet.getString("EMPLOYEE_PASSWORD"));
				staff.setPRIVILEGE(resultSet.getInt("PRIVILEGE"));
				
				list.add(staff);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public Staff selectInfo(int EMPLOYEE_ID) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		Staff staff = new Staff();
		
		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "select * from tb_employees_info where EMPLOYEE_ID = " + EMPLOYEE_ID + ";";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			//迭代list
			while (resultSet.next()) {
				staff.setEMPLOYEE_ID(resultSet.getInt("EMPLOYEE_ID"));
				staff.setEMPLOYEE_NAME(resultSet.getString("EMPLOYEE_NAME"));
				staff.setEMPLOYEE_PASSWORD(resultSet.getString("EMPLOYEE_PASSWORD"));
				staff.setPRIVILEGE(resultSet.getInt("PRIVILEGE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return staff;
	}
	
	/**
	 * 修改用户信息
	 */
	@Override
	public int verifyInfo(int EMPLOYEE_ID, String EMPLOYEE_NAME, 
			String EMPLOYEE_PASSWORD, int PRIVILEGE) {
		int row = 0;
		
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "update tb_employees_info set "+ 
					"EMPLOYEE_NAME='" + EMPLOYEE_NAME +
					"', EMPLOYEE_PASSWORD='" + EMPLOYEE_PASSWORD + 
					"', PRIVILEGE=" + PRIVILEGE +
					" where EMPLOYEE_ID = " + EMPLOYEE_ID;
			statement = connection.prepareStatement(sql);
			row = statement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return row;
	}
}
