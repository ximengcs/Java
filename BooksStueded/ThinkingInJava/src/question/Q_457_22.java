package question;

import java.util.Arrays;

import lib.net.mindview.util.ConvertTo;
import lib.net.mindview.util.Generated;
import lib.net.mindview.util.RandomGenerator;

public class Q_457_22 {

	public static void main( String[] args ) {
		int[] test = ConvertTo.primitive( 
				Generated.array( new Integer[10], new RandomGenerator.Integer( 1000 ) ) );
		// no sort
		System.out.println( Arrays.toString( test ) );

		int index = Arrays.binarySearch( test, test[2] );
		System.out.println( index + " : " + test[index] );
	}
}
