package other;

public class SuShu {

	public static void main(String[] args) {

		check( 1949 );
		check( 1994 );
		check( 9149 );
		check( 9194 );
		check( 9419 );
		check( 9491 );
		check( 9914 );
		check( 9941 );
		
	}
	
	static boolean check( int num ) {
		
		int tmp = 2;
		while( tmp < num ) {
			if( num % tmp == 0 )
				return false;
			tmp++;
		}
		
		System.out.println(num);
		return true;
	}
}
