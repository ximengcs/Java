package com.simon.dao;

import com.simon.model.Manager;

/**
 * 管理员操作接口
 * @author SIMON
 *
 */
public interface ManagerDao {

	/**
	 * 更改管理员密码
	 * @param 管理员id
	 * @return 更改成功返回true
	 */
	public boolean updatePassword( String id );
	
	/**
	 * 管理员登录
	 * @param 管理员用户名
	 * @param 管理员密码
	 * @return 登录成功返回一个管理员的包装类
	 */
	public Manager login( String username, String password );
}
