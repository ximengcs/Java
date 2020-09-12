package unit2;

import java.util.Scanner;

public class BEGIN_11 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		System.out.println( change( in.next() ) );
		in.close();
	}
	
	private static long change( String n ) {
		long sum = 0;
		char[] list = n.toCharArray();
		for( int i = 0; i < list.length; i++ ) {
			if( list[i] < 65 )
				sum += ((int)(list[i]) - 48)*Math.pow( 16, list.length-(i+1) );
			else
				sum += ((int)(list[i]) - 55)*Math.pow( 16, list.length-(i+1) );
		}
		return sum;
	}
}
