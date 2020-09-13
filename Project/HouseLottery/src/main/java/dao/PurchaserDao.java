package dao;

import java.sql.Date;
import java.util.List;

import entry.Purchaser;

/**
 * 
 * @author 
 *
 */
public interface PurchaserDao {

	/**
	 * 添加购房用户数据项
	 */
	public int addInfo(int ROCKNUMBER, String REALNAME, String CARDTYPE, 
			String CARDCODE, String MOBILEPHONE, 
			String PURCHASETYPE, String PASSWORD, int ISMARGIN, 
			String VERIFYSTATUS,  String REQUESTSTATUS, int ESTATE_ID, 
			Date REGISTRATIONTIME, String SELECT_HOUSE_RESULT);

	/**
	 * 修改购房用户数据项
	 */
	public int verifyInfo(int PURCHASERID, int 
			ROCKNUMBER, String REALNAME, String CARDTYPE, 
			String CARDCODE, String MOBILEPHONE, 
			String PURCHASETYPE, String PASSWORD, int ISMARGIN, 
			String VERIFYSTATUS, String REQUESTSTATUS, int ESTATE_ID, Date REGISTRATIONTIME,
			String SELECT_HOUSE_RESULT);
	
	/**
	 * 删除购房用户数据项
	 */
	public int deleteInfo(int CARDCODE);
	
	/**
	 * 查询购房用户数据项
	 */
	public Purchaser selectInfo(String CARDCODE);
	
	/**
	 * 查询数据项的数量
	 */
	public int getSum();
	
	/**
	 * 查询所有数据
	 */
	public List<Purchaser> selectAllInfo();
}
