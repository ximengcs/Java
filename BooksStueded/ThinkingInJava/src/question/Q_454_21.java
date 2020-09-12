package question;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import lib.net.mindview.util.Generated;
import question.lib.BerylliumSphere;

class BerylliumSphereComparable extends BerylliumSphere implements Comparable<BerylliumSphereComparable> {
	// 因为berylliumShpere的id字段为private，所以需要反射
	public long getID( BerylliumSphere obj ) {
		try {
			Field field = BerylliumSphere.class.getDeclaredField( "id" );
			field.setAccessible( true );
			return field.getLong( obj );
		} catch (Exception e) {
			System.out.println( e );
			return 0L;
		}
	}

	public int compareTo( BerylliumSphereComparable obj ) {
		long a = getID( this );
		long b = getID( obj );
		return (a < b ? -1 : (a == b ? 0 : 1));
	}
}

public class Q_454_21 {

	public static void main( String[] args ) {

		BerylliumSphere[] instance = Generated.array( BerylliumSphere.class, BerylliumSphere.generator(), 10 );

		System.out.println( Arrays.toString( instance ) );
		Collections.shuffle( Arrays.asList( instance ) );
		System.out.println( Arrays.toString( instance ) );

		try {
			Arrays.sort( instance );
			System.out.println( Arrays.toString( instance ) );
		} catch (Exception e) {
			System.out.println( "cannot be sort, because find comparable" );
		}

		//
		// 将instance赋值为子类,子类实现了comparable
		for (int i = 0; i < 10; i++)
			instance[i] = new BerylliumSphereComparable();
		System.out.println( Arrays.toString( instance ) );

		Collections.shuffle( Arrays.asList( instance ), new Random() );

		System.out.println( Arrays.toString( instance ) );

		try {
			Arrays.sort( instance );
			System.out.println( Arrays.toString( instance ) );
		} catch (Exception e) {
			System.out.println( e );
		}

	}
}
