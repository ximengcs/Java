package question;

import static lib.net.mindview.util.Countries.names;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q_470_3 {

	public static void main( String[] args ) {
		HashSet<String> hashSet = new HashSet<String>( names(10) );
		System.out.println( hashSet );
		// repeat time 1000
		for( int i = 0; i < 1000; i++ )
			hashSet.addAll( names(10) );
		System.out.println( hashSet );
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>( names(10) ); 
		System.out.println(  );
		System.out.println( linkedHashSet );
		for( int i = 0; i < 100; i++ )
			linkedHashSet.addAll( names(10) );
		System.out.println( linkedHashSet );
	}
}
