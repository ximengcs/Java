package question;

import java.io.File;
import java.io.IOException;

import lib.net.mindview.util.BinaryFile;
import lib.net.mindview.util.Directory;

public class Q_548_20 {

	static String fileName = "F:\\EclipseJava\\ThinkingInJava";
	static String regex = ".*.class";
	
	public static void main( String[] args ) throws IOException {
		Directory.TreeInfo tree = Directory.walk( fileName, regex );
		for( File file : tree.files ) {
			byte[] code = BinaryFile.read( file );
			for( int i = 0; i < 4; i++ )
				System.out.print( code[i] + " " );
			System.out.println(  );
		}
		System.out.print( "CAFEBABE : " + " " );
		System.out.println( 0XCA + " " + (byte)0XFE + " " + (byte)0XBA + " " + (byte)0XBE );
	}
}
