package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entry.Ba;

/**
 * 访问吧信息
 * @author lenovo
 *
 */
public class BaDao {

	private String url = "jdbc:mysql://localhost/tieba";
	private String user = "root";
	private String password = "982599829";
	
	/**
	 * 查询所有吧信息
	 * @return
	 */
	public List<Ba> getAllBa() {
		List<Ba> list = new ArrayList<Ba>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
			statement = connection.createStatement();
			String sql = "select * from ba";
			result = statement.executeQuery(sql);
			while(result.next()) {
				list.add( new Ba( result.getInt("id"), result.getInt("master_id"), result.getString("name"), result.getString("icon") ) );
			}
		} catch( Exception e ) {
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
		
		return list;
	}
	
}
