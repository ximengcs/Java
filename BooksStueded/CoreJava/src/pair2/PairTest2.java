package pair2;

import java.time.LocalDate;

class A {
	public void testA() {
		System.out.println( "TESTA" );
	}
}

class B extends A {
	public void testA() {
		System.out.println( "TestB" );
	}
}

class TestA {
	public static <T extends A> void test( T t ) {
		t.testA();
	}
	
	public static void main( String[] args ) {
		A a = new A();
		B b = new B();
		test(a);                     	
		test(b);
	}
}

class E<T> {

}

class ArrayAlg {
	
	public static <T extends Comparable> T minmax( T[] a ) {
		if( a == null || a.length == 0 ) 
			return null;
		T smallest = a[0];
		for( int i = 1; i < a.length; i++ )
			if( smallest.compareTo( a[i] ) > 0 )
				smallest = a[i];
		return smallest;
	}
}

public class PairTest2 {

	public static void main( String[] args ) {
		LocalDate[] birthdays = {
				LocalDate.of( 1906, 12, 9 ), // 构造给定日期
				LocalDate.of( 1815, 12, 10 ),
				LocalDate.of( 1903, 12, 3 ),
				LocalDate.of( 1910, 6, 22 ),
		};
		//Pair<LocalDate> mm = ArrayAlg.<LocalDate>minmax( birthdays );
		
	}
}
