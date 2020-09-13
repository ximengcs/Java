package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnector;
import util.Transform;

public class IssueTimeDaoImplement implements IssueTimeDao{

	//数据库连接
	DBConnector dbConnection = new DBConnector();
	
	/**
	 * 修改发布时间
	 */
	@Override
	public boolean verifyRockTime(Date date) {
		int row = 0;
		
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "update tb_publish_time set "+ 
					"ROCKTIME=?;";
			statement = connection.prepareStatement(sql);
			statement.setDate(1, date);
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
		
		return false;
	}
	
	/**
	 * 修改选房时间
	 */
	@Override
	public boolean verifySelectHouseTime(Date date) {
		int row = 0;
		
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "update tb_publish_time set "+ 
					"SELECTHOUSETIME=?;";
			statement = connection.prepareStatement(sql);
			statement.setDate(1, date);
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
		
		return false;
	}
	
	/**
	 * 获取摇号发布时间
	 */
	@Override
	public Date getVerifyTime() {
		Date date = null;
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "SELECT ROCKTIME FROM tb_publish_time ;";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next())
				date = resultSet.getDate("ROCKTIME");
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
		return date;
	}
	
	/**
	 * 获取选房时间
	 */
	@Override
	public Date getSelectHouseTime() {
		Date date = null;
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = dbConnection.connect();
			// 预编译sql语句
			String sql = "SELECT SELECTHOUSETIME FROM tb_publish_time ;";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next())
				date = resultSet.getDate("SELECTHOUSETIME");
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
		return date;
	}
}
