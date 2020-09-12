package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_499_27 {

	private static List<String> created = new ArrayList<String>();
	private String s;
	private int id = 0;
	private char ch = 0;
	public Q_499_27( String str ) {
		s = str;
		created.add( s );
		for( String s2 : created )
			if( s2.equals(s) )
				id++;
	}
	
	public String toString() {
		return "String: " + s + "id: " + id + " hashCode() : " + hashCode();
	}
	
	public int hashCode() {
		int result = 17;
		result = 37 * result + s.hashCode();
		//result = 37 * result + id;
		result = 37 * result + ch;
		return result;
	}
	
	public boolean equals( Object obj ) {
		return obj instanceof Q_499_27 &&
				((Q_499_27)obj).s.equals(s) &&
				//((Q_499_27)obj).id == id &&
				((Q_499_27)obj).ch == ch;
	}
	
	public static void main( String[] args ) {
		Map<Q_499_27, Integer> map = new HashMap<Q_499_27, Integer>();
		Q_499_27[] cs = new Q_499_27[5];
		for( int i = 0; i < cs.length; i++ ) {
			cs[i] = new Q_499_27( "hi" );
			map.put( cs[i], i );
		}
		System.out.println( map );
		for( Q_499_27 csString : cs ) { 
			System.out.println( "looking up " + csString );
			System.out.println( map.get(csString) );
		}
	}
} 

// 可能产生相同的值
/*
 * output :
 * {String: hiid: 1 hashCode() : 146446=4}
 * looking up String: hiid: 1 hashCode() : 146446
 * 4
 * looking up String: hiid: 2 hashCode() : 146446
 * 4
 * looking up String: hiid: 3 hashCode() : 146446
 * 4
 * looking up String: hiid: 4 hashCode() : 146446
 * 4
 * looking up String: hiid: 5 hashCode() : 146446
 * 4
**/
