package question;

import java.util.Arrays;

import question.lib.BerylliumSphere;

public class Q_436_1 {

	public static void testArray( BerylliumSphere[] b ) {
		System.out.println( Arrays.toString(b) );
	}
	public static void main( String[] args ) {
		BerylliumSphere[] t1;
		//动态
		t1 = new BerylliumSphere[]{
				new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
		};
		testArray( t1 );
		testArray( new BerylliumSphere[]{
				new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
		} );
		
		//静态
		BerylliumSphere[] t2 = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };
		testArray( t2 );
		//! testArray( { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() } );
	}
}
