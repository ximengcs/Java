package login.service;

import java.sql.*;

import entry.User;

public class LoginService {

	public User check( String username, String password ) {
		User tmp = null;
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
		} catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/user1";
			String user = "root";
			String pass = "982599829";
			connection = DriverManager.getConnection( url, user, pass );
			statement = connection.createStatement();
			String sql = "select * from user_info where username = '" + username + "' and password = '" + password+"';";
			result = statement.executeQuery(sql);
			
			if( result.next() ) {
				tmp = new User();
				tmp.setUsername( result.getString("username") );
				tmp.setPassword( result.getString("password") );
				tmp.setQq( result.getInt("qq") );
				tmp.setPhone( result.getInt("phone") );
			}
		} catch( SQLException e ) {
			e.printStackTrace();
		} finally {
			try {
				if( connection != null )
					connection.close();
				if( statement != null )
					statement.close();
			} catch( SQLException e ) {
				e.printStackTrace();
			}
		}
		
		return tmp;
	}
}
