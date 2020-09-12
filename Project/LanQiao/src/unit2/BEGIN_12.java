package unit2;

import java.util.Scanner;

public class BEGIN_12 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		//long time = System.nanoTime();
		String[] list = new String[n];
		for( int i = 0; i < n; i++ )
			list[i] = change( in.next() );
		in.close();
		for( String str : list )
			System.out.println( str );
		//System.out.println( System.nanoTime()-time );
	}
	
	private static int pow( int a, int b ) {
		if( b == 0 )
			return 1;
		int result = a;
		for( int i = 1; i < b; i++ )
			result *= a;
		return result;
	}
	
	private static String change( String n ) {
		StringBuilder result = new StringBuilder( "" );
		StringBuilder tmp = new StringBuilder( "" );
		//转2进制
		
		for( int i = n.length()-1; i >= 0; i-- ) {
			int bit;
			if( n.codePointAt(i) < 65 )
				bit = n.codePointAt(i)-48;
			else
				bit = n.codePointAt(i)-55;
			for( int count = 0; count < 4; count++ ) {
				tmp.append( bit%2 );
				bit /= 2;
			}
		}
		char[] temp = tmp.reverse().toString().toCharArray();
		for( int i = temp.length-1; i >= 0; ) {
			int num = 0;
			int count = 0;
			while( count < 3 ) {
				if( i < 0 )
					break;
				num += (temp[i]-48)*pow( 2, count );
				count++;
				i--;
			}
			if( i <= 2 && num == 0 )
				continue;
			result.append( num );
		}
		return result.reverse().toString();
	}
	
/*	private static String change( String n ) {
		long sum = 0;
		char[] list = n.toCharArray();
		for( int i = 0; i < list.length; i++ ) {
			if( list[i] < 65 )
				sum += ((int)(list[i]) - 48)*Math.pow( 16, list.length-(i+1) );
			else
				sum += ((int)(list[i]) - 55)*Math.pow( 16, list.length-(i+1) );
			if( list[i] < 65 )
				sum += ((int)(list[i]) - 48)*pow( 16, list.length-(i+1) );
			else
				sum += ((int)(list[i]) - 55)*pow( 16, list.length-(i+1) );
		}
		StringBuilder result = new StringBuilder( "" );
		while( sum != 0 ) {
			result.append( sum%8 );
			sum /= 8;
		}
		return result.reverse().toString();
	}*/
}
/*
	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		long time = System.nanoTime();
		String[] list = new String[n];
		for( int i = 0; i < n; i++ )
			list[i] = change( in.next() );
		in.close();
		for( String str : list )
			System.out.println( str );
		System.out.println( System.nanoTime()-time );
	}
	
	private static String change( String n ) {
		BigInteger sum = new BigInteger( "0" ),
				   EIGHT = new BigInteger( "8" );
		char[] list = n.toCharArray();
		for( int i = 0; i < list.length; i++ ) {
			if( list[i] < 65 )
				sum = sum.add( 
					new BigInteger( ((int)(list[i]) - 48)*((int)Math.pow( 16, list.length-(i+1)) ) + "" ) );
			else
				sum = sum.add( 
					new BigInteger( ((int)(list[i]) - 55)*((int)Math.pow( 16, list.length-(i+1) ) ) + "" ) );
		}
		
		StringBuilder result = new StringBuilder( "" );
		while( !sum.equals( BigInteger.ZERO ) ) {
			result.append( sum.mod( EIGHT ) );
			sum = sum.divide( EIGHT );
		}
		return result.reverse().toString();
	}
	*/
