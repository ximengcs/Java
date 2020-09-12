package question;

import java.util.Arrays;

import question.lib.BerylliumSphere;

public class Q_451_18 {

	public static void main( String[] args ) {
		int SIZE = 10;

		BerylliumSphere[] instance = new BerylliumSphere[SIZE];
		for (int i = 0; i < 10; i++)
			instance[i] = new BerylliumSphere();
		for (int i = 0; i < 10; i++)
			System.out.println( Integer.toHexString( instance[i].hashCode() ) );

		// copy
		BerylliumSphere[] instance2 = new BerylliumSphere[SIZE];
		System.arraycopy( instance, 0, instance2, 0, instance.length );
		for (int i = 0; i < 10; i++)
			System.out.println( Integer.toHexString( instance2[i].hashCode() ) );
		System.out.println( Arrays.toString( instance2 ) );
	}
}
