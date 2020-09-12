package unit2;

public class BEGIN_7 {

	public static void main( String[] args ) {
		int a = 0,
			b = 0,
			c = 0;
		for( int n = 100; n < 999; n++ ) {
			a = n / 100;
			b = (n / 10) % 10;
			c = n % 10;
			if( n == a*a*a + b*b*b + c*c*c )
				System.out.println( n );
		}
	}
}
