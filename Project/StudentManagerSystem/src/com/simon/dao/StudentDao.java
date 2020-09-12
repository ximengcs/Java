package com.simon.dao;

import java.util.List;

import com.simon.model.Student;

/**
 * 数据库访问学生类的接口
 * 
 * @author SIMON
 *
 */
public interface StudentDao {

	/**
	 * 按学号查找学生
	 * 
	 * @param 学生id
	 * @return 匹配的学生包装类
	 */
	public Student findById(String id);

	/**
	 * 检索有所学生
	 * 
	 * @return 所有学生的集合
	 */
	public List<Student> selectAll();

	/**
	 * 添加学生信息
	 * 
	 * @param 学生包装类
	 * @return 成功返回true
	 */
	public boolean add(Student student);

	/**
	 * 更改学生信息
	 * 
	 * @param 更改后的学生包装类
	 * @return 更改成功返回true
	 */
	public boolean updateById(Student student);

	/**
	 * 删除学生信息
	 * 
	 * @param 学生id
	 * @return 删除成功返回true
	 */
	public boolean deleteById(String id);
}
