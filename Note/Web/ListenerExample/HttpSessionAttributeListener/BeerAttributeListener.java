import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerAttributeListener implements HttpSessionAttributeListener {
	
	// 当增加一个会话属性时
	@Override
	public void attributeAdded( HttpSessionBindingEvent event ) {
		//  利用HttpSessionBindingEvent可以得到事件属性的名和值
		String name = event.getName();
		Object value = event.getValue();
	}
	
	// 当删除一个会话属性时
	@Override
	public void attributeRemoved( HttpSessionBindingEvent event ) {
		
	}
	
	// 当替换一个会话属性时 
	@Override
	public void attributeReplace( HttpSessionBindingEvent event ) {
		
	}
}