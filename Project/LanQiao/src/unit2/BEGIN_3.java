package unit2;

import java.util.Scanner;

public class BEGIN_3 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		System.out.println( f( in.nextInt(), in.nextInt() ) );
		//System.out.println( f( 100, 26 ) );
	}

	private static String f( int m, int n ) {
		//long time = System.nanoTime();
		StringBuilder result = new StringBuilder( "" );
		boolean col = true;
		boolean row = true;
		char colChar = 'A';
		char rowChar = 'A';
		for( int i = 0; i < m; i++ ) {
			if( colChar != 'A' )
				col = false;
			rowChar = colChar;
			
			for( int j = 0; j < n; j++ ) {
				result.append( rowChar );
				if( col )
					rowChar++;
				else
					rowChar--;
				if( rowChar == 'A' )
					col = true;
				if( rowChar == 'Z' )
					col = false;
			}
			col = true;
			if( i+1 != m )
				result.append( "\n" );
			
			if( colChar == 'Z' )
				row = false;
			if( colChar == 'A' )
				row = true;
			if( row )
				colChar++;
			else
				colChar--;
		}
		// 524386
		//  70659
		// 661259
		//time = System.nanoTime() - time;
		//System.out.println( time );
		return result.toString();
	}
}
