package test.lib;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Copy {

	static int length = 0xffffffff;
	static String fileName = "F:\\bluej-bundled-316.zip";
	public static void main( String[] args ) throws IOException {
		MappedByteBuffer in = new RandomAccessFile( fileName, "rw" ).getChannel()
				.map( FileChannel.MapMode.READ_WRITE, 0, length );
		
		MappedByteBuffer out = new RandomAccessFile( "F:\\data.txt", "rw" ).getChannel()
				.map( FileChannel.MapMode.READ_WRITE, 0, length );
		
		for( int i = 0; i < length; i++ )
			out.put( in.get(i) );
		
	}
}
