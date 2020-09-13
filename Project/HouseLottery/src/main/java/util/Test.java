package util;

import java.sql.Date;
import java.util.List;

import dao.PurchaserDaoImplement;
import entry.Purchaser;

public class Test {

	public void addPucharserData() {
		int ROCKNUMBER = 1;//抽奖序号
		String REALNAME = "..";//真实姓名
		String CARDTYPE = "身份证";//证件类型
		String CARDCODE = "6122522";//证件号码
		String MOBILEPHONE = "177922024525";//手机号码
		String PURCHASETYPE = "刚需";//购置类型(购置类型：刚需or普通类型)
		String PASSWORD = "123456";//登录密码
		int ISMARGIN = 1;//是否缴纳保证金
		String VERIFYSTATUS = "未审核";//审核状态，未审核、审核未通过、审核通过
		String REQUESTSTATUS = "正常";//请求状态，正常或撤销
		int ESTATE_ID = 1;//楼盘ID
		Date REGISTRATIONTIME = new Date(System.currentTimeMillis());//提交时间
		String SELECT_HOUSE_RESULT = "1";//选房结果
		new PurchaserDaoImplement().addInfo(ROCKNUMBER, REALNAME, 
				CARDTYPE, CARDCODE, MOBILEPHONE, PURCHASETYPE, PASSWORD, ISMARGIN, 
				VERIFYSTATUS, REQUESTSTATUS, ESTATE_ID, REGISTRATIONTIME, SELECT_HOUSE_RESULT);
	}
	
	public void verifyInfo() {
		int ROCKNUMBER = 1;//抽奖序号
		String REALNAME = "ww";//真实姓名
		String CARDTYPE = "身份证";//证件类型
		String CARDCODE = "6125222";//证件号码
		String MOBILEPHONE = "177920224525";//手机号码
		String PURCHASETYPE = "刚需";//购置类型(购置类型：刚需or普通类型)
		String PASSWORD = "123456";//登录密码
		int ISMARGIN = 1;//是否缴纳保证金
		String VERIFYSTATUS = "未审核";//审核状态，未审核、审核未通过、审核通过
		String REQUESTSTATUS = "正常";//请求状态，正常或撤销
		int ESTATE_ID = 1;//楼盘ID
		Date REGISTRATIONTIME = new Date(System.currentTimeMillis());//提交时间
		String SELECT_HOUSE_RESULT = "1";//选房结果
		new PurchaserDaoImplement().verifyInfo(9 ,ROCKNUMBER, REALNAME, 
				CARDTYPE, CARDCODE, MOBILEPHONE, PURCHASETYPE, PASSWORD, ISMARGIN, 
				VERIFYSTATUS, REQUESTSTATUS, ESTATE_ID, REGISTRATIONTIME, SELECT_HOUSE_RESULT);
	}
	
	public void selectInfo() {
		Purchaser list = new PurchaserDaoImplement().selectInfo("612522");
		System.out.println(list);
	}
	
	public void getSum() {
		System.out.println(new PurchaserDaoImplement().getSum());
	}
	
	public void selectAllInfo() {
		List<Purchaser> list = new PurchaserDaoImplement().selectAllInfo();
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		System.out.println(Transform.StringToDate("1100-1-1"));
	}
}
