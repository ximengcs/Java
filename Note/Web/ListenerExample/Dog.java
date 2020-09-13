import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Dog 
	implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable{
	
	private String breed;
	// 这里还有很多非Serializable实例变量
	
	public void valueBound( HttpSessionBindingEvent event ) {
		// 在一个会话中要运行的代码 
	}
	
	public void valueUnbound( HttpSessionBindingEvent event ) {
		// 不在一个回话中时要运行的代码
	}
	
	public void sessionWillPassivate( HttpSessionEvent event ) {
		// 这些代码将非Serializeable字段设置为某种状态,以便迁移到新的vm
	}
	
	public void sessionDidActivate( HttpSessionEvent event ) {
		// 这写代码用与恢复字段
	}
}