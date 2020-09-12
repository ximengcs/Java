package question;

import java.util.Arrays;

import question.lib.BerylliumSphere;

public class Q_440_6 {

	static BerylliumSphere[][] create( int height, int width ) {
		BerylliumSphere[][] result = new BerylliumSphere[ height ][ width ];
		for( int i = 0; i < height; i++ )
			for( int j = 0; j < result[i].length; j++ )
				result[i][j] = new BerylliumSphere();
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println( Arrays.deepToString( create( 4, 5 ) ) );
	}
}
