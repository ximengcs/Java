package question;

import java.util.Arrays;
import java.util.Collections;

public class Q_457_23 {

	public static void main( String[] args ) {
		int num = 90;
		
		Integer[] a = new Integer[10];
		for( int i = 0; i < 10; i++ )
			a[i] = num--;
		
		System.out.println( Arrays.toString( a ) );
		
		Arrays.sort( a, Collections.reverseOrder() );
		
		System.out.println( Arrays.toString( a ) );
	}
}
