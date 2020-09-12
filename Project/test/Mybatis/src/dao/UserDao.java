package dao;

import pojo.User;

public interface UserDao {

	// 增
	public void insertUser( User user ) throws Exception;
	
	// 删
	public void deleteUser( int id ) throws Exception;
	
	// 改
	public void updateUser( User user ) throws Exception;
	
	// 查
	public void selectUser( int id ) throws Exception;
}
