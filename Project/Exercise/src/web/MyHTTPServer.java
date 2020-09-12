package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHTTPServer {

	public static void main( String[] args ) throws IOException {
		ServerSocket ser = new ServerSocket( 8080 ); //监听8080端口
		//F:\EclipseJava\Study\sohu.html
		Socket client = ser.accept();
		
		FileInputStream input = new FileInputStream( "F:\\EclipseJava\\Study\\suhu.html" );
		OutputStream out = client.getOutputStream();
		byte[] b = new byte[2048];
		int len = 0;
		while( ( len =input.read( b ) ) > 0 ) {
			out.write( b, 0, len );
		}
		out.close();
		input.close();
		ser.close();
	}
}
