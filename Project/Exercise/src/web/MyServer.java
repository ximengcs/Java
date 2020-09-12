package web;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main( String[] args ) throws IOException {
		ServerSocket server = new ServerSocket( 9999 );

		System.out.println( "等待客户端" );
		Socket soc = server.accept();
		
		OutputStream out = soc.getOutputStream();
		out.write( "hello".getBytes() );
		out.close();
		server.close();
	}
}
