import java.util.Random;
public class Question_66_2{
	public static void main( String[] args ){
		Random rand1 = new Random();
		Random rand2 = new Random();
		double d1, d2;
		d1 = rand1.nextDouble();
		System.out.print( d1 + " " );
		for( int i = 1; i <= 25; i++ ){
			d2 = rand2.nextDouble();
			if( d1 < d2 )
				System.out.print( "<" );
			else if( d1 == d2 )
				System.out.print( "=" );
			else
				System.out.print( ">" );
			System.out.print( " " + d2 + " " );
			d1 = d2;
		}
	}
}