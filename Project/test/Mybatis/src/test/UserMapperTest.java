package test;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import mapper.UserMapper;
import pojo.User;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception {
		
		String resource = "SqlMapConfig.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}


	public void testFindUserById() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//User user = userMapper.findUserById(1);
		
		//System.out.println(user);
		
		User user = new User();
		user.setUsername("testmapper");
		user.setPassword("mapper");
		
		userMapper.insertUser(user);
		
		sqlSession.commit();
		
		sqlSession.close();
	}

	@Test
	public void findInfo() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		List<User> list = mapper.findInfo();
		
		show(list);
		
		sqlSession.close();
	}
	
	private void show( List<User> list ) {
		System.out.println();
		
		Iterator<User> it = list.iterator();
		
		System.out.printf( "%-10s%-20s%-10s\n", "id", "username", "password" );
		
		while( it.hasNext() ) {
			User user = it.next();
			System.out.printf( "%-10s%-20s%-10s\n", user.getId(), user.getUsername(), user.getPassword() );
		}
		
		System.out.println();
	}
}
