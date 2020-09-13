import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerSessionCounter implements HttpSessionListener {
	
	// 当前web应用的会话数
	private static int activeSessions;
	
	// 获得当前的会话数
	public int getActiveSessions() {
		return activeSessions;
	}
	
	// 当创建一个会话时
	@Override
	public void sessionCreated( HttpSessionEvent event ) {
		activeSessions++;
	}
	
	// 当撤销一个会话时
	@Override
	public void sessionDestroyed( HttpSessionEvent event ) {
		activeSessions--;
	}
}