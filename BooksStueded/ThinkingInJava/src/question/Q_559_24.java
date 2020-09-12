package question;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class Q_559_24 {

	private static final int BSIZE = 1024;
	
	public static void main( String[] args ) {
		
		// 创建大小为1024字节的缓冲区
		ByteBuffer bb = ByteBuffer.allocate( BSIZE );
		
		// 获取字节缓冲区的double视图
		DoubleBuffer ib = bb.asDoubleBuffer();
		
		ib.put( new double[]{ 11, 63, 67, 87, 19, 18, 12112 } );
		
		System.out.println( ib.get(3) );
		
		// index = 3, value = 1811
		ib.put( 3, 1811 );
		
		// position = 0, limit = (last position is 7), capacity不变
		ib.flip();
		
		
		// hasRemaining返回position到limit之间是否有元素
		while( ib.hasRemaining() ) {
			double i = ib.get();
			System.out.println( i );
		}
	}
}
