package question;

import question.lib.BerylliumSphere;

public class Q_442_8<T> {

	T[] t;
	T[] t2;
	public Q_442_8( int size ) {
		t = (T[]) new Object[size];
		t2 = (T[]) new String[size];
	}
	
	public static void main(String[] args) {
		
		// object
		Q_442_8 t1 = new Q_442_8( 10 );
		t1.t[0] = new Integer(1);
		t1.t[1] = new String( "a" );
		t1.t[2] = new BerylliumSphere();
		System.out.println( t1.t[0] );
		System.out.println( t1.t[1] ); // astonish
		System.out.println( t1.t[2] ); // astonish
		
		// string
		t1.t2[0] = new String( "A" );
		
		// throw arrayStoreException
		t1.t2[1] = new Integer( 1 );
		t1.t2[2] = new BerylliumSphere();
		System.out.println( t1.t2[0] );
		System.out.println( t1.t2[1] );
		System.out.println( t1.t2[2] );
	}
}
