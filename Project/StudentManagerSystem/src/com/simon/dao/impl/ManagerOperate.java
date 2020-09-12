package com.simon.dao.impl;

import java.sql.*;

import com.simon.dao.ManagerDao;
import com.simon.model.Manager;;

public class ManagerOperate implements ManagerDao {

	@Override
	public boolean updatePassword(String id) {
		return false;
	}

	@Override
	public Manager login(String username, String password) {

		Manager manager = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			String url = "jdbc:mysql://localhost:3306/studentmanager";
			connection = DriverManager.getConnection(url, "root", "982599829");
			statement = connection.createStatement();
			String sql = "select * from manager where username='"+username+"' and password='"+password+"';";
			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				manager = new Manager(resultSet.getString("id"), resultSet.getString("username"),
						resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return manager;
	}
}
