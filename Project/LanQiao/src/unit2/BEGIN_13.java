package unit2;

import java.util.Scanner;

public class BEGIN_13 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		int[] list = new int[n];
		for( int i = 0; i < n; i++ )
			list[i] = in.nextInt();
		
		for( int i = 0; i < n-1; i++ ) {
			for( int j = i+1; j < n; j++ ) {
				if( list[j] < list[i] ) {
					int temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		
		for( int i : list )
			System.out.print( i + " " );
	}
}
