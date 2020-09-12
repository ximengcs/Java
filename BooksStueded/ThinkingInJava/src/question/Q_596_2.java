package question;

import java.util.Random;

enum CartoonCharacter_001 {
	SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
	private static Random rand = new Random();
	public static CartoonCharacter_001 next() {
		return values()[rand.nextInt(values().length)];
	}
}

public class Q_596_2 {

	// 无须实例 
	public static void main( String[] args ) {
		for( int i = 0; i < 10; i++ )
			System.out.println( CartoonCharacter_001.next() );
	}
}
