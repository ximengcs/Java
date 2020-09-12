package question;

import static lib.net.mindview.util.Countries.names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Q_470_1 {

	public static void main( String[] args ) {
		List<String> linkedList = new LinkedList<String>( names(8) );
		List<String> arrayList = new ArrayList<String>( names(8) );
		Collections.sort( linkedList );
		System.out.println( linkedList );
		for( int i = 0; i < 3; i++ ) {
			Collections.shuffle( linkedList, new Random() );
			System.out.println( linkedList );
		}
		
		System.out.println(  );
		
		Collections.sort( arrayList );
		System.out.println( arrayList );
		for( int i = 0; i < 5; i++ ) {
			Collections.shuffle( arrayList, new Random() );
			System.out.println( arrayList );
		}
	}
}
