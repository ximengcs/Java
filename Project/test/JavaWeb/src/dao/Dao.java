package dao;

public class Dao {

	/**
	 * 检查用户名是否正确
	 * @param username 用户名
	 * @param password 密码
	 * @return 真为正确,假为错误
	 */
	public boolean check( String username, String password ) {
		boolean flag = false;
		
		if( username.equals("simon") && password.equals("123456") )
			flag = true;
		
		return flag;
	}
}
