package question;

import java.util.Arrays;

import question.lib.BerylliumSphere;

public class Q_440_7 {

	static BerylliumSphere[][][] create( int height, int width, int length ) {
		BerylliumSphere[][][] result = new BerylliumSphere[ height ][ width ][ length ];
		for( int i = 0; i < height; i++ )
			for( int j = 0; j < result[i].length; j++ )
				for( int k = 0; k < result[i][j].length; k++ )
					result[i][j][k] = new BerylliumSphere();
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println( Arrays.deepToString( create( 4, 5, 6 ) ) );
	}
}
