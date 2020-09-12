package question;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q_544_15 {

	static String file = "F:\\EclipseJava\\ThinkingInJava\\src\\testfiles\\.TestFile.txt";
	
	public static void main( String[] args ) throws IOException {
		DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream( 
						new FileOutputStream( file ) ) );
		
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream( file ) ) );
		
		//  void write(byte[] b, int off, int len)  数组偏移量  length
		byte[] b = new byte[10];
		for( int i = 0; i < 10; i++ )
			b[i] = (byte)i;
		out.write( b, 1, 9 );
		
		// void write( int b )
		out.write( 1 );
		
		// void write( boolean v )
		out.writeBoolean( true );
		
		// void writeByte( int v )
		out.writeByte( 47 );
		
		// void writeBytes( String s )
		out.writeBytes( "writebytes" );
		
		// void writeChar( int v )
		out.writeChar( 47 );
		
		// void writeInt( int v )
		out.writeInt( 47 );
		
		// finla void writeShort( int v )
		out.writeShort( 47 );
		
		// void writeLong( long v )
		out.writeLong( 47L );
		
		// final void writeDouble( double v )
		out.writeDouble( 47.0 );
		
		// final void writeFloat( float v )
		out.writeFloat( 47.0F );
		
		// final void writeChars( String s )
		out.writeChars( "writeChars" );
		
		// final void writeUTF( String s )
		out.writeUTF( "writeUTF" );
		
		out.close();
		
		// input
		byte[] input = new byte[5];
		// int read( byte[] b )
		in.read( input );
		for( int tmp : input )
			System.out.print( tmp );
		System.out.println(  );
		
		byte[] input2 = new byte[5];
		
		// int read( byte[] b, int off, int len )
		in.read( input2, 2, 3 );
		for( int tmp : input2 )
			System.out.print( tmp );
		System.out.println(  );
		
		System.out.println( in.readByte() ); // 写入8个低位
		
		System.out.println( in.readByte() );
		
		System.out.println( in.readBoolean() );
		
		System.out.println( in.readByte() );
		
		byte[] writeBytes = new byte[10];
		in.readFully( writeBytes );
		for( byte ch : writeBytes )
			System.out.print( (char)ch );
		
		System.out.println(  );
		
		System.out.println( (int)in.readChar() );
		System.out.println( in.readInt() );
		System.out.println( in.readShort() );
		System.out.println( in.readLong() );
		System.out.println( in.readDouble() );
		System.out.println( in.readFloat() );
		
		char[] writeChars = new char[10];
		for( int i = 0; i < writeChars.length; i++ )
			writeChars[i] = in.readChar();
		for( char ch : writeChars )
			System.out.print( ch );
		
		System.out.println(  );
		
		String UTFString = in.readUTF();
		System.out.println( UTFString );
	}
}
