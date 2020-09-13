package dao;

import java.sql.Date;
import java.util.List;

import entry.Purchaser;
import entry.Staff;

/**
 * StaffDao
 * @author ...
 *
 */
public interface StaffDao {

	/**
	 * 添加员工数据
	 */
	public int addInfo(int EMPLOYEE_ID, String EMPLOYEE_NAME, 
			String EMPLOYEE_PASSWORD, int PRIVILEGE);

	/**
	 * 修改员工信息
	 */
	public int verifyInfo(int EMPLOYEE_ID, String EMPLOYEE_NAME, 
			String EMPLOYEE_PASSWORD, int PRIVILEGE);

	/**
	 * 根据工号删除员工信息
	 */
	public int deleteInfo(int EMPLOYEE_ID);
	
	/**
	 * 根据工号查询员工信息
	 */
	public Staff selectInfo(int EMPLOYEE_ID);
	
	/**
	 * 查询员工的数量
	 */
	public int getSum();
	
	/**
	 * 查询所有员工数据
	 */
	public List<Staff> selectAllInfo();
}
