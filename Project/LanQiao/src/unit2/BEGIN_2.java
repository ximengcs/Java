package unit2;

public class BEGIN_2 {

	public static void main( String[] args ) {
		for( int n = 0; n <= 31; n++ )
			System.out.println( f(n) );
	}
	
	private static String f( int n ) {
		StringBuilder result = new StringBuilder( "" );
		for( int count = 0; count < 5; count++ ) {
			result.insert( 0, n%2 );
			n /= 2;
		}
		return result.toString();
	}
}
