package question;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import lib.net.mindview.util.BinaryFile;

public class Q_548_19 {

	static String fileName = "F:\\EclipseJava\\ThinkingInJava\\src\\TestFiles\\BasicFileOutput.txt";
	
	public static void main( String[] args ) throws IOException {
		Map<Byte, Integer> byteTime = new HashMap<Byte, Integer>();
		for( byte temp : BinaryFile.read(fileName) )
			byteTime.put( temp, byteTime.get(temp) == null ? 1 : byteTime.get(temp)+1 );
		
		System.out.println( byteTime );
	}
}
