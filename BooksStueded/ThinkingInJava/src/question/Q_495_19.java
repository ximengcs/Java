package question;

import lib.containers.SimpleHashMap;
import lib.net.mindview.util.TextFile;

public class Q_495_19 {

	public static void main( String[] args ) {
		
		SimpleHashMap<String, Integer> test = new SimpleHashMap<String, Integer>();
		TextFile file = new TextFile( "F:\\test\\1.c", "\\s+|\\W+" );
		
		for( String word : file ) {
			if( test.get( word ) == null )
				test.put( word, 1 );
			else {
				test.put( word, test.get(word)+1 );
			}
		}
		
		System.out.println( test );
	}
}
