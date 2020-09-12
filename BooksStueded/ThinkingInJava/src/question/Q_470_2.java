package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import lib.net.mindview.util.Countries;

public class Q_470_2 {

	public static void main( String[] args ) {
		Map<String, String> contries = new HashMap<String, String>( Countries.capitals() );
		Set<String> tmp = new HashSet<String>( contries.keySet() );
		Map<String, String> result = new HashMap<String, String>();
		Iterator<String> it = tmp.iterator();
		while( it.hasNext() ) {
			String str = it.next();
			char ch = str.toCharArray()[0];
			if( ch == 'A' || ch == 'a' ) {
				result.put( str, contries.get(str) );
			}
		}
		
		System.out.println( result );
	}
}
