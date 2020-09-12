package question;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q_484_12 {
	
	public static void main( String[] args ) {
		Map<String, String> map = new HashMap<String, String>(6);
		map.put( "sky", "blue" );
		map.put( "grass", "green" );
		map.put( "ocean", "dancing" );
		map.put( "tree", "tall" );
		map.put( "earth", "warm" );
		try {
			map.put( "extra", "object" );
		} catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println( "Too man" );
		}
		System.out.println( map );
		System.out.println( map.get( "ocean" ) );
		
		Map<String, String> map2 = new TreeMap<String, String>();
		map.put( "sky", "blue" );
		map.put( "grass", "green" );
		map.put( "ocean", "dancing" );
		map.put( "tree", "tall" );
		map.put( "earth", "warm" );
		try {
			map.put( "extra", "object" );
		} catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println( "Too man" );
		}
		System.out.println( map );
		System.out.println( map.get( "ocean" ) );
		
		Map<String, String> map3 = new LinkedHashMap<String, String>();
		map.put( "sky", "blue" );
		map.put( "grass", "green" );
		map.put( "ocean", "dancing" );
		map.put( "tree", "tall" );
		map.put( "earth", "warm" );
		try {
			map.put( "extra", "object" );
		} catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println( "Too man" );
		}
		System.out.println( map );
		System.out.println( map.get( "ocean" ) );
	}
}
