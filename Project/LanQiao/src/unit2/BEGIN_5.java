package unit2;

import java.util.Scanner;

public class BEGIN_5 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		int[] list = new int[n];
		for( int i = 0; i < n; i++ )
			list[i] = in.nextInt();
		int a = in.nextInt();
		
		for( int i = 0; i < n; i++ )
			if( list[i] == a ) {
				System.out.println( i+1 );
				return;
			}
		System.out.println( "-1" );
	}
}
