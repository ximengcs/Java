package test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.impl.UserDaoImpl;
import pojo.User;

public class UserDaoImplTest {

	SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testUpdateUser() throws Exception {
		UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
		User user = new User();
		user.setId(12);
		user.setUsername("simon");
		user.setPassword("0000");
		userDao.updateUser(user);
	}

}
