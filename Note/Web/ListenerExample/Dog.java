import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Dog 
	implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable{
	
	private String breed;
	// ���ﻹ�кܶ��Serializableʵ������
	
	public void valueBound( HttpSessionBindingEvent event ) {
		// ��һ���Ự��Ҫ���еĴ��� 
	}
	
	public void valueUnbound( HttpSessionBindingEvent event ) {
		// ����һ���ػ���ʱҪ���еĴ���
	}
	
	public void sessionWillPassivate( HttpSessionEvent event ) {
		// ��Щ���뽫��Serializeable�ֶ�����Ϊĳ��״̬,�Ա�Ǩ�Ƶ��µ�vm
	}
	
	public void sessionDidActivate( HttpSessionEvent event ) {
		// ��д��������ָ��ֶ�
	}
}