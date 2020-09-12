package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;
/**
 * 1.导入sql包
 * 2.加载数据源的驱动程序
 * 3.使用connection
 */
@SuppressWarnings("unused")
public class ConnetDB {

	public static void main( String[] args ) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Connection conn = null;
		Statement sta = null;
		// 注册驱动:注册到程序
		Class.forName( "com.mysql.jdbc.Driver" ).newInstance();
		// 创建链接对象
		String url = "jdbc:mysql://localhost:3306/fkjava2";
		String user = "root";
		String pass = "982599829";
		
		try {
			conn = DriverManager.getConnection( url, user, pass );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			sta = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} // 创建sta对象，执行sql命令:
		
		//执行insert命令
		//String sqlInsert = "insert into member values( '007', '大飞下, default, default' )";
		String sql = "select * from simon2";
		
		
		// ResultSet保存结果集
		ResultSet rel = sta.executeQuery( sql );
		while( rel.next() ) {
			System.out.println( rel.getString( 1 ) );
			System.out.println( rel.getString( 2 ) );
			System.out.println( rel.getString( 3 ) );
		}
	}
}
