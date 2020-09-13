package dao;

import java.sql.Date;

/**
 * 发布时间Dao
 * @author lenovo
 *
 */
public interface IssueTimeDao {

	/**
	 * 修改发布时间
	 */
	public boolean verifyRockTime(Date date);
	
	/**
	 * 修改选房时间
	 */
	public boolean verifySelectHouseTime(Date date);
	
	/**
	 * 获取发布时间
	 */
	public Date getVerifyTime();
	
	/**
	 * 获取选房时间
	 */
	public Date getSelectHouseTime();
}
