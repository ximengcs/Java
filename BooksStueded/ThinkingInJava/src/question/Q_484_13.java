package question;

import lib.containers.AssociativeArray;
import lib.net.mindview.util.TextFile;

public class Q_484_13 {

	public static void main( String[] args ) {
		int SIZE = 100;
		int count = 0;
		
		AssociativeArray<String, Integer> test = new AssociativeArray<String, Integer>( SIZE );
		TextFile file = new TextFile( "F:\\test\\1.c", "\\s+|\\W+" );
		
		for( String word : file ) {
			if( count >= SIZE )
				break;
			if( test.get( word ) == null )
				test.put( word, 1 );
			else {
				test.put( word, test.get(word)+1 );
			}
			
			count++;
		}
		
		System.out.println( test );
	}
}
