package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main( String[] args ) throws IOException {
		// 使用serversocket
		ServerSocket server = null;
		// 每个用户在程序中就是一个socket
		server = new ServerSocket( 8888 );
		// 等待客户端链接
		Socket client = server.accept();
		// 向客户端打印音息
		PrintWriter out = null;
		out = new PrintWriter( client.getOutputStream() );
		out.println( "hello mldn" );
		out.close();
		client.close();
		server.close();
	}
}
