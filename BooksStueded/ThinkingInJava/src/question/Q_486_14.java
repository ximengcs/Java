package question;

import java.util.Map;
import java.util.Properties;

import lib.net.mindview.util.CountingMapData;

public class Q_486_14 {

	public static void printKeys( Map<Object, Object> map ) {
		System.out.print( "size = " + map.size() + "," );
		System.out.print( "keys: " );
		System.out.println( map.keySet() );
	}
	
	public static void test( Map<Object, Object> map ) {
		System.out.println( map.getClass().getSimpleName() );
		map.putAll( new CountingMapData(25) ); // countingmapdta is abstractmap
		map.putAll( new CountingMapData(25) );
		printKeys( map );
		System.out.print( "Value : " );
		System.out.println( map.values() );
		System.out.println( map );
		System.out.println( "map.containsKey(11) : " + map.containsKey(11) );
		System.out.println( "map.get(11) : " + map.get(11) );
		System.out.println( "map.cintainsValue( \"0\" ) : " + map.containsValue( "F0" ) );
		Integer key = (Integer)map.keySet().iterator().next();
		System.out.println( "first key in map : " + key );
		map.remove(key);
		printKeys( map );
		map.clear();
		System.out.println( "map.isempty() : " + map.isEmpty() );
		map.putAll( new CountingMapData(25) );
		map.keySet().removeAll( map.keySet() );
		System.out.println( "map.isEmpty() : " + map.isEmpty() );
	}
	
	public static void main( String[] args ) {
		test( new Properties() );
	}
}
