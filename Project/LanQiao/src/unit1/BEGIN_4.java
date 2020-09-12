package unit1;

import java.util.Scanner;

public class BEGIN_4 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		System.out.println( fib(in.nextInt()) );
		//System.out.println( fib(22) );
		//System.out.println( fib( in.nextInt() ).divideAndRemainder( new BigDecimal("10007") )[1] );
	}

	private static int fib( int n ) {
		if( n == 0 )
			return 0;
		int a = 0, 
			b = 1,
			count = 1;
		while( count < n ) {
			b += a;
			a = b - a;
			count++;
			if( a > 10007 )
				a %= 10007;
			if( b > 10007 )
				b %= 10007;
		}
		return b;
	}
	
/*	private static BigDecimal fib( int n ) {
		if( n == 0 )
			return new BigDecimal( "0" );
		BigDecimal a = new BigDecimal( "0" ),
				   b = new BigDecimal( "1" );
		long 
			count = 1;
		while( count < n ) {
			b = new BigDecimal( b.add(a).toString() );
			a = new BigDecimal( a.subtract(b).negate().toString() );
			System.out.println( b );
			count++;
		}
		return b;
	}*/
	
/*	private static long fib( int n ) {
		if( n == 0 )
			return 0;
		long count = 1,
			 a = 0,
			 b = 1;
		while( count < n ) {
			b += a;
			a = b - a;
			count++;
		}
		return b;
	}*/
	
/*	private static int fib( int n ) {
		if( n == 1 || n == 2 )
			return 1;
		else 
			return fib(n-1) + fib(n-2);
	}*/
}
