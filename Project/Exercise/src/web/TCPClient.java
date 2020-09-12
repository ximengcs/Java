package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main( String[] args ) throws UnknownHostException, IOException {
		Socket client = null;
		BufferedReader buf = null;
		client = new Socket( "localhost", 8888 );
		buf = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
		System.out.println( buf.readLine() );
		buf.close();
		client.close();
	}
}
