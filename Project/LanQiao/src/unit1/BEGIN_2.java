package unit1;

import java.util.Scanner;

public class BEGIN_2 {

	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		int n;
		long sum = 0;
		n = in.nextInt();
		while( n > 0 ) {
			sum += n;
			n--;
		}
		System.out.println( sum );
	}
}
