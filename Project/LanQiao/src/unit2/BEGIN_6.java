package unit2;

import java.util.Scanner;

public class BEGIN_6 {

	public static void main( String[] args ) {
		int n = new Scanner( System.in ).nextInt();
		int[][] list = new int[n][];
		for( int i = 0; i < n; i++ )
			list[i] = new int[i+1];
		
		list[0][0] = 1;
		list[1][0] = 1;
		list[1][1] = 1;
		
		for( int i = 2; i < n; i++ ) {
			list[i][0] = 1;
			list[i][i] = 1;
			for( int j = 1; j < i; j++ )
				list[i][j] = list[i-1][j-1] + list[i-1][j];
		}
		
		for( int[] tmps : list ) {
			for( int tmp : tmps )
				System.out.print( tmp + " " );
			System.out.println(  );
		}
	}
}
