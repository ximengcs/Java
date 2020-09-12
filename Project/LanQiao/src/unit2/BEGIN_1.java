package unit2;

import java.util.Scanner;

public class BEGIN_1 {

	public static void main( String[] args ) {
		int year = new Scanner( System.in ).nextInt();
		if( year % 400 == 0 )
			System.out.println( "yes" );
		else if( year % 4 == 0 && year % 100 != 0 )
			System.out.println( "yes" );
		else
			System.out.println( "no" );
	}
}
