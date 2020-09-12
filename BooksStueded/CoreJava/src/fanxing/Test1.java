package fanxing;

class A {
	
}

class B {
	
}

interface C {
	
}
interface D {
	
}

public class Test1 {
	
	public static <T extends C> T min( T[] a ) {
		return a[1];
	}
	
	public static <T extends Comparable> T min( T[] a ) {
		if( a == null || a.length == 0 ) 
			return null;
		T smallest = a[0];
		for( int i = 1; i < a.length; i++ )
			if( smallest.compareTo( a[i] ) > 0 )
				smallest = a[i];
		return smallest;
	}
}
