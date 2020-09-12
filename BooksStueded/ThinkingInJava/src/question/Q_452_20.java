package question;

import java.util.Arrays;

import question.lib.Int;

public class Q_452_20 {

	public static void main( String[] args ) {
		Int[][] arrays = new Int[5][5];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++)
				arrays[i][j] = new Int( 47 );

		Int[][] arrays2 = arrays;

		System.out.println( Arrays.deepEquals( arrays, arrays2 ) );

		arrays2 = new Int[5][5];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++)
				arrays2[i][j] = new Int( 47 );

		System.out.println( Arrays.deepEquals( arrays, arrays2 ) );
	}
}
