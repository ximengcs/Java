package unit3;

import java.util.Scanner;

public class BEGIN_1 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		int[] list = new int[n];
		for( int i = 0; i < n; i++ )
			list[i] = in.nextInt();
		
		int m = in.nextInt();
		int[][] check = new int[m][3];
		for( int i = 0; i < m; i++ ) {
			check[i][0] = in.nextInt();
			check[i][1] = in.nextInt();
			check[i][2] = in.nextInt();
		}
		
		sort( list, true );
		for( int i = 0; i < m; i++ ) {
			int[] tmp = new int[check[i][1]-(check[i][0]-1)];
			for( int j = 0, k = check[i][0]-1; j < tmp.length; j++, k++ )
				tmp[j] = list[k];
			sort( tmp, false );
			System.out.println( tmp[check[i][2]-1] );
		}
	}
	
	private static void sort( int[] ar, boolean squence ) {
		for( int i = 0; i < ar.length-1; i++ )
			for( int j = i+1; j < ar.length; j++ )
				if( squence ){
					if( ar[j] < ar[i] ) {
						int tmp = ar[j];
						ar[j] = ar[i];
						ar[i] = tmp;
					}
				} else {
					if( ar[j] > ar[i] ) {
						int tmp = ar[j];
						ar[j] = ar[i];
						ar[i] = tmp;
					}
				}
						
	}
}
