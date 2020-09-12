package unit2;

import java.util.Scanner;

public class BEGIN_10 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		System.out.println( change( in.nextInt() ) );
		in.close();
	}
	
	private static String change( int n ) {
		if( n == 0 )
			return "0";
		
		StringBuilder result = new StringBuilder( "" );
		while( n != 0 ) {
			if( n%16 < 10 )
				result.append( n%16 );
			else
				result.append( (char)(n%16+55) );
			n /= 16;
		}
		return result.reverse().toString();
	}
}
