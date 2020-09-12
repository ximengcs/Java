package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main( String[] args ) throws IOException {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		
		// 要保证udp有一个运行的端口
		ds = new DatagramSocket( 5000 );
		String s = "dsfdsf";
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		s = buf.readLine();
		dp = new DatagramPacket( s.getBytes(), 0, s.length(), InetAddress.getByName("localhost"), 8888 );
		ds.send( dp );
		ds.close();
	}
}
