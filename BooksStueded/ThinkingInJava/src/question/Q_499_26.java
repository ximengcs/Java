package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_499_26 {

	private static List<String> created = new ArrayList<String>();
	private String s;
	private int id = 0;
	private char ch = 0;
	public Q_499_26( String str ) {
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
		result = 37 * result + id;
		result = 37 * result + ch;
		return result;
	}
	
	public boolean equals( Object obj ) {
		return obj instanceof Q_499_26 &&
				((Q_499_26)obj).s.equals(s) &&
				((Q_499_26)obj).id == id &&
				((Q_499_26)obj).ch == ch;
	}
	
	public static void main( String[] args ) {
		Map<Q_499_26, Integer> map = new HashMap<Q_499_26, Integer>();
		Q_499_26[] cs = new Q_499_26[5];
		for( int i = 0; i < cs.length; i++ ) {
			cs[i] = new Q_499_26( "hi" );
			map.put( cs[i], i );
		}
		System.out.println( map );
		for( Q_499_26 csString : cs ) { 
			System.out.println( "looking up " + csString );
			System.out.println( map.get(csString) );
		}
	}
}
