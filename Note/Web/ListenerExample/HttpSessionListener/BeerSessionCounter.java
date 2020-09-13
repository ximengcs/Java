import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerSessionCounter implements HttpSessionListener {
	
	// ��ǰwebӦ�õĻỰ��
	private static int activeSessions;
	
	// ��õ�ǰ�ĻỰ��
	public int getActiveSessions() {
		return activeSessions;
	}
	
	// ������һ���Ựʱ
	@Override
	public void sessionCreated( HttpSessionEvent event ) {
		activeSessions++;
	}
	
	// ������һ���Ựʱ
	@Override
	public void sessionDestroyed( HttpSessionEvent event ) {
		activeSessions--;
	}
}