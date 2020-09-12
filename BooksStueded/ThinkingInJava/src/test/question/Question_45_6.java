import java.util.Random;
public class Question_45_6{
	public static void main( String[] args ){
		Random rand = new Random();
		
		for( int i = 0; i < 10; i++ ){
			if(rand.nextInt()%2 == 0) 
				System.out.print( "Õý" );
			else
				System.out.print( "·´" );
		}
	}
}
		