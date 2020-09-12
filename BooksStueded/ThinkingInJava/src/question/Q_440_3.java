package question;

import java.util.Arrays;
import java.util.Random;

public class Q_440_3 {
	
	private static double[][] instance;
	
	public static double[][] createDouble( int width, int height, int start, int end ) {
		Random rand = new Random();
		instance = new double[ height ][ width ];
		for( int i = 0; i < height; i++ ) {
			for( int j = 0; j < width; j++ ) {
				instance[i][j] = (rand.nextInt( (end-start)*100 ) + start*100) / 100.00D;
			}
		}
		
		return instance;
	}
	
	public static void printDoubleArray() {
		System.out.println( Arrays.deepToString( instance ) );
	}
	
	public static void main( String[] args ) {
		createDouble( 3, 4, 80, 90 );
		printDoubleArray();
	}
}
