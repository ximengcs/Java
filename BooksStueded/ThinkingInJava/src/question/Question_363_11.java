import java.util.*;

class New{
	public static <K, V> Map<K, V> map(){
		return new HashMap<K, V>();
	}
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
}

class Test{
	static void test( Map<String, Integer> map ){
		System.out.println( map );
	}
	
	static void testObject( Map<Object, Object> map ){
		System.out.println( map );
	}
	
	public static void main( String[] args ){
		Map<String, Integer> map = New.map();
		map.put( "a", 1 );
		map.put( "b", 2 );
		map.put( "c", 3 );
		//!!! map.put( 4, "d" );
		System.out.println( map );
		
		//!!! test( New.map() );
		testObject( New.map() );
	}
}