package first;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;

public class MybatisFirst {

	// 根据id查询记录
	@Test   
	public void fingById() throws IOException {
		
		String resource = "SqlMapConfig.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		// 创建回话工厂,参数是一个流
		SqlSessionFactory sqlSF = new SqlSessionFactoryBuilder().build(inputStream);
			
		// 创建会话
		SqlSession session = sqlSF.openSession();
		// 第一个参数：statement：命名空间+id
		// 第二个参数:指定和user.xml中所匹配的输入参数：xml中指定类型，这里是实际参数
		// 返回：和映射文件结果所匹配的对象
		User user = session.selectOne("test.findUserById", 1);
		
		// use
		System.out.println(user);
		
		// 释放资源
		session.close();
	}
	
	/**
	 * 根据用户名查询信息
	 * @throws IOException
	 */
	@Test
	public void findInfoByUsername() throws IOException {
		
		// mybatis环境配置文件路径
		String resource = "SqlMapConfig.xml";
		
		// 获取文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//1.创建会话工厂
		SqlSessionFactory sqlSF = new SqlSessionFactoryBuilder().build(inputStream);
				
		//2.创建sql会话
		SqlSession sqlS = sqlSF.openSession();
		
		//3.使用
		List<User> list = sqlS.selectList("test.findUserByName", "si");
		
		System.out.println(list);
		
		//4.关闭资源
		sqlS.close();
	}
	
	@Test
	public void insertUser() throws IOException {
		
		String resource = "SqlMapConfig.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//1.创建回话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//2.用会话工厂创建会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//3.使用 第二个参数是要插入的用户对象User实例
		User user = new User();
		//user.setId(1);
		user.setUsername("test");
		user.setPassword("123");
		sqlSession.insert("test.insertUser", user);
		// 提交事务
		sqlSession.commit();
		
		System.out.println(user.getId());
		
		//4.释放资源
		sqlSession.close();
	}
	
	/**
	 * 删除
	 * @throws IOException 
	 */
	@Test
	public void deleteUser() throws IOException {
		
		String resource = "SqlMapConfig.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.delete("test.deleteUser", 13);
		
		sqlSession.commit();
		
		sqlSession.close();
	}
	
	/**
	 * 更新
	 * @throws IOException 
	 */
	@Test
	public void updateUser() throws IOException {
		String resource = "SqlMapConfig.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = new User();
		
		user.setId(12);
		user.setUsername("simon");
		user.setPassword("0000");
		
		sqlSession.update("test.updateUser", user);
		
		sqlSession.commit();
		
		sqlSession.close();
	}
}
