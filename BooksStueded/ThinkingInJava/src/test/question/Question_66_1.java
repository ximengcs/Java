public class Question_66_1{
	public static void main( String[] args ){
		for( int i = 1; i <= 100; i++ ){
			if( i == 99 )
				break;
			/* or
			if( i == 99 )
				return;
			*/
			System.out.print( i + " " );
		}
	}
}