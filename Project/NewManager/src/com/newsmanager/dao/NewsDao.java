package com.newsmanager.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.newsmanager.entity.News;

public class NewsDao {

	/**
	 * 方法描述：查询所有新闻集合
	 * 
	 * @return 新闻集合
	 */
	public List<News> getNewsList(Integer pageNumber, Integer pageSize) {
		List<News> newsList = new ArrayList<News>();

		/*
		 * 写访问数据库的方法
		 */
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 驱动管理器获取数据库连接
			String url = "jdbc:mysql://localhost:3306/filemanager";
			String user = "root";
			String password = "982599829";
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			int startSize = (pageNumber - 1) * pageSize;
			// 执行sql
			String sql = "select * from news limit " + startSize + "," + pageSize;
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				int newsId = resultSet.getInt("newsid");
				String newsTitle = resultSet.getString("newstitle");
				String newsStatus = resultSet.getString("newsStatus");
				String newsContent = resultSet.getString("newsContent");
				String newsType = resultSet.getString("newsType");
				Date createTime = resultSet.getDate("createTime");
				News news = new News(newsId, newsTitle, newsContent, newsStatus, newsType, createTime);
				newsList.add(news);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
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
		return newsList;
	}

	/**
	 * 方法描述 查询新闻总条数的方法
	 * 
	 * @return 总条数
	 */
	public int getCount() {
		int count = 0;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/filemanager";
			String user = "root";
			String password = "982599829";
			connection = DriverManager.getConnection(url, user, password);
			String sql = "select count(*) from news";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				count = resultSet.getInt(1);
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
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * 方法描述 添加新闻的方法
	 * 
	 * @param newstitle
	 *            新闻标题
	 * @param newstype
	 *            新闻栏目
	 * @param newscontent
	 *            新闻正文
	 * @return 返回数据库受影响的行数
	 */
	public int addNews(String newstitle, String newstype, String newscontent) {
		int row = 0;

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/filemanager";
			String user = "root";
			String password = "982599829";
			connection = DriverManager.getConnection(url, user, password);
			// 预编译sql语句？为变量
			String sql = "insert into news(newstitle, newsContent, newsStatus, newsType, createtime) values(?,?,?,?,?);";
			statement = connection.prepareStatement(sql);
			statement.setString(1, newstitle);
			statement.setString(2, newscontent);
			statement.setString(3, "未审核");
			statement.setString(4, newstype);
			statement.setDate(5, new Date(System.currentTimeMillis()));
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
	 * 方法描述 删除新闻
	 * @param id 新闻id
	 * 
	 * @return 返回删除的数量
	 */
	public int deleteNews( Integer id ) {
		int row = 0;
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
			String url = "jdbc:mysql://localhost:3306/filemanager";
			String user = "root";
			String password = "982599829";
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			String sql = "delete from news where newsid = "+id;
			row = statement.executeUpdate(sql);
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				if( connection != null ) {
					connection.close();
				}
				if( statement != null ) {
					statement.close();
				}
			} catch( SQLException e ) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	/**
	 * 方法描述 审核该新闻
	 * @param id 新闻id
	 * @return 审核的条数
	 */
	public int shenheNews( Integer id ) {
		int row = 0;
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
			String url = "jdbc:mysql://localhost:3306/filemanager";
			String user = "root";
			String password = "982599829";
			connection = DriverManager.getConnection(url, user, password);
			String sql = "update news set newsStatus = '已审核' where newsid = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			row = statement.executeUpdate();
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				if( connection != null ) {
					connection.close();
				}
				if( statement != null ) {
					statement.close();
				}
			} catch( SQLException e ) {
				e.printStackTrace();
			}
		}
		return row;
	}
}
