package web;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main( String[] args ) throws UnknownHostException, IOException {
		Socket s = new Socket( "localhost", 9999 );
		InputStream in = s.getInputStream();
		byte[] b = new byte[1024];
		in.read(b);
		System.out.println( new String(b) );
	}
}
