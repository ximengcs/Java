package web;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {

	public static void main( String[] args ) throws IOException {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		
		byte b[] = new byte[1024];
		// 在8888端口等待信息
		ds = new DatagramSocket( 8888 );
		dp = new DatagramPacket( b, b.length );
		
		ds.receive( dp );
		// 从数据包取
		String str = new String( dp.getData(), 0, dp.getLength() );
		System.out.println( "接受到的数据为:" + str );
		ds.close();
	}
}
