package question;

import question.lib.SimpleHashMap;

public class Q_495_20 {

	public static void main( String[] args ) {
		SimpleHashMap<String, String> list = new SimpleHashMap<String, String>();
		list.put( "a", "1" );
		list.put( "b", "2" );
		list.put( "c", "3" );
		list.put( "d", "4" );
		list.put( "e", "5" );
		System.out.println( list );
		
		list.put( "b", "2" );
		System.out.println( list.remove( "b" ) );
		System.out.println( list );
		
	}
}
