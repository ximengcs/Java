package question;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Q_545_16 {

	private static String file = "F:\\EclipseJava\\ThinkingInJava\\src\\testfiles\\.TestFile.txt";
	
	static void display() throws IOException {
		RandomAccessFile rf = new RandomAccessFile( file, "r" );
		
		// int read();
		System.out.println( rf.read() );
		
		// int read( byte[] b )
		byte[] b1 = new byte[10];
		rf.read( b1 );
		for( byte tmp : b1 )
			System.out.print( tmp );
		System.out.println(  );
		
		// int read( byte[] b, int off, int len )
		byte[] b2 = new byte[10];
		rf.read( b2, 0, 10 );
		for( byte tmp : b2 )
			System.out.print( tmp );
		System.out.println(  );
		
		// boolean readBoolean();
		System.out.println( rf.readBoolean() );
		
		// byte readByte();
		System.out.println( rf.readByte() );
		
		// char readChar();
		System.out.println( rf.readChar() );
		
		// double readDouble();
		System.out.println( rf.readDouble() );
		
		// float readFloat();
		System.out.println( rf.readFloat() );
		
		// void readFully( byte[] b );
		byte[] b3 = new byte[10];
		rf.readFully( b3 );
		for( byte tmp : b3 )
			System.out.print( tmp );
		System.out.println(  );
		
		// void readFully( byte[] b, int off, int len )
		byte[] b4 = new byte[10];
		rf.readFully( b4, 0, 10 );
		for( byte tmp : b4 )
			System.out.print( tmp );
		System.out.println(  );
		
		// int readInt();
		System.out.println( rf.readInt() );
		
		// String readLine();
		System.out.println( rf.readLine() );
		
		// long readLong();
		System.out.println( rf.readLong() );
		
		// short readShort();
		System.out.println( rf.readShort() );
		
		// int readUnsignedByte();
		System.out.println( rf.readUnsignedByte() );
		
		// int readUnsignedShort();
		System.out.println( rf.readUnsignedShort() );
		
		// String readUTF();
		System.out.println( rf.readUTF() );
		
		rf.close();
	}
	
	public static void main( String[] args ) throws IOException {
		RandomAccessFile rf = new RandomAccessFile( file, "rw" );
		
		// int read();
		// void write();
		rf.write( 47 );
		
		// int read( byte[] b )
		// void write( byte[] b )
		byte[] b1 = new byte[10];
		for( int i = 0; i < b1.length; i++ )
			b1[i] = (byte)i;
		rf.write( b1 );
		
		// int read( byte[] b, int off, int len )
		// void write( byte[] b, int off, int len )
		byte[] b2 = new byte[10];
		for( int i = 0; i < b2.length; i++ )
			b2[i] = (byte)i;
		rf.write( b2, 0, 10 );
		
		// boolean readBoolean();
		// void writeBoolean( boolean );
		rf.writeBoolean( true );
		
		// byte readByte();
		// void writeByte( int );                                              
		rf.writeByte( 47 );
		
		// char readChar();
		// void writeChar( int )
		rf.writeChar( 47 );
		
		// double readDouble();
		// void writeDouble( double );
		rf.writeDouble( 47.0 );
		
		// float readFloat();
		// void writeFloat( float );
		rf.writeFloat( 47.0F );
		
//		// void readFully( byte[] b );
		byte[] b3 = new byte[10];
		for( int i = 0; i < 10; i++ )
			b3[i] = (byte)i;
		rf.write( b3 );
		
//		// void readFully( byte[] b, int off, int len )
		byte[] b4 = new byte[10];
		for( int i = 0; i < b4.length; i++ )
			b4[i] = (byte)i;
		rf.write( b4, 0, 10 );
		
		// int readInt();
		// void writeInt( int );
		rf.writeInt( 47 );
		
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//      读取行 '\n'
//		// String readLine(); 
		// void writeBytes( String );
		rf.writeBytes( "writeBytes\n" );
		
		// long readLong();
		// void writeLong( long );
		rf.writeLong( 47L );
		
		// short readShort();
		// void writeShort( short );
		rf.writeShort( 47 );
		
//		// int readUnsignedByte();
		rf.writeByte( (byte)47 );
		
//		// int readUnsignedShort();
		rf.writeChar( (char)47 );
		
		// String readUTF();
		// void writeUTF( String );
		rf.writeUTF( "writeUTF" );
		
		display();
	}
}
