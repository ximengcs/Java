package mapper;

import java.util.List;

import pojo.User;
/**
 * mapper接口:方法名和statement中的id名相同,输入参数和statement中
 * 的parametertype相同,返回值类型和statement的resulttype指定的类型一致
 * @author Simon
 *
 */
public interface UserMapper {

	/**
	 * 如果mapper方法返回单个pojo
	 * @param id
	 * @return d
	 * @throws Exception
	 */
	public User findUserById( int id ) throws Exception;
	
	public User findUserByName( String username ) throws Exception;
	
	public void insertUser( User user ) throws Exception;
	
	public List<User> findInfo() throws Exception;
}
