package question;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q_566_26 {

	public static ArrayList<String> openFile( String fileName ) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		
		FileChannel fc = new RandomAccessFile( fileName, "r" ).getChannel();
		MappedByteBuffer mb = fc.map( FileChannel.MapMode.READ_ONLY, 0, fc.size() );
		//CharBuffer cb = mb.asCharBuffer();
		
		StringBuilder strings = new StringBuilder("");
		/*System.out.println( fc.size() );
		System.out.println( "position : " + mb.position() );
		System.out.println( "limit : " + mb.limit() );*/
		while( mb.hasRemaining() ) {
			strings.append( (char)mb.get() );
		}
		
		ArrayList<String> tmp = new ArrayList<String>(Arrays.asList( strings.toString().split( " " ) ));
		for( String str : tmp )
			list.add( str + " " );
		
		return list;
	}
	
	public static void main( String[] args ) throws Exception {
		if (args.length < 2) {
			System.out.println( "Usage: java JGrep file regex" );
			System.exit( 0 );
		}
		Pattern p = Pattern.compile( args[1] );
		// Iterate through the lines of the input file:
		// F:\\EclipseJava\\ThinkingInJava\\src\\testfiles\\data.txt
		int index = 0;
		Matcher m = p.matcher( "" );
		for (String line : openFile( args[0] )) {
			m.reset( line );
			while (m.find())
				System.out.println( index++ + ": " + m.group() + ": " + m.start() );
		}
	}
}
