package unit2;

import java.util.Scanner;

public class BEGIN_4_MISTAKE {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();

		int[] list = new int[n];
		for( int i = 0; i < n; i++ ) {
			list[i] = in.nextInt();
		}
		
		int sum = 0,
			max = list[0],
			min = list[0];

		for( int i = 1; i < n; i++ ) {
			sum += list[i];
			if( list[i] > max )
				max = list[i];
			if( list[i] < min )
				min = list[i];
		}
		System.out.printf( "%d\n%d\n%d", max, min, sum );
	}
}