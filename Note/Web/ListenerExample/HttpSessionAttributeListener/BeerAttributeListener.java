import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerAttributeListener implements HttpSessionAttributeListener {
	
	// ������һ���Ự����ʱ
	@Override
	public void attributeAdded( HttpSessionBindingEvent event ) {
		//  ����HttpSessionBindingEvent���Եõ��¼����Ե�����ֵ
		String name = event.getName();
		Object value = event.getValue();
	}
	
	// ��ɾ��һ���Ự����ʱ
	@Override
	public void attributeRemoved( HttpSessionBindingEvent event ) {
		
	}
	
	// ���滻һ���Ự����ʱ 
	@Override
	public void attributeReplace( HttpSessionBindingEvent event ) {
		
	}
}