package create.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import entry.User;

public class CreateService {

	public boolean create(User user) {
		boolean flag = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/user1";
			String username = "root";
			String password = "982599829";
			Connection connection = null;
			Statement statement = null;

			try {
				connection = DriverManager.getConnection(url, username, password);
				statement = connection.createStatement();
				String sql = "insert into user_info values( null,'"
						+ user.getUsername() + "','" + user.getPassword() +
						"'," + user.getQq() + "," + user.getPhone() + ");";
				statement.executeUpdate( sql );
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (connection != null)
						connection.close();
					if (statement != null)
						statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return flag;
	}
}
