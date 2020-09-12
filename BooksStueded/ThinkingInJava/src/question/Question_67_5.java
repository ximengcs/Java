public class Question_67_5{
	public static void main( String[] args ){
		int num = 0;
		int i, j;
		for( i = 1; i <= 100; i++ ){
			for( j = 2; j < i; j++ ){
				if( i % j == 0 )
					break;
			}
			if( j == i )
				System.out.print( i + " " );
		}
	}
}