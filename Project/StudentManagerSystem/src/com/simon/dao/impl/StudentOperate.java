package com.simon.dao.impl;

import java.sql.*;
import java.util.List;

import com.simon.dao.StudentDao;
import com.simon.model.Student;

public class StudentOperate implements StudentDao {

	@Override
	public Student findById(String id) {
		return null;
	}

	@Override
	public List<Student> selectAll() {
		return null;
	}

	@Override
	public boolean add(Student student) {
		boolean flag = true;
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
		} catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/studentmanager";
			connection = DriverManager.getConnection(url,"root","982599829");
			statement = connection.createStatement();
			String sql = "insert into student values( '"+student.getId()+"','"
					+ student.getName() + "',"
					+ student.getAge() + ",'"
					+ student.getSex() + "','"
					+ student.getDept() + "','"
					+ student.getTel() + "' );";
			statement.execute(sql);
		} catch( SQLException e ) {
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
		return flag;
	}

	@Override
	public boolean updateById(Student student) {
		return false;
	}

	@Override
	public boolean deleteById(String id) {
		return false;
	}

	public static void main(String[] args) {
		StudentOperate op = new StudentOperate();
		Student stu = new Student( "7", "simon2", "19", "男", "软件", "177" );
		System.out.println(op.add(stu));
	}
}
