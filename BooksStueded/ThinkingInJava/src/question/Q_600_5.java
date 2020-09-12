package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public enum Q_600_5 {

	VOWEL( 'a', 'e', 'i', 'o', 'u' ) {
		public String toString() {
			return "vowel";
		}
	},
	SOMETIMES_A_VOWEL( 'y', 'w' ) {
		public String toString() {
			return "sometimes a vowel";
		}
	}, 
	CONSONANT {
		public String toString() {
			return "consonant";
		}
	};
	
	private HashSet<Character> chars = new HashSet<Character>();
	
	private Q_600_5( Character... chars ) {
		if( chars != null )
			this.chars.addAll( Arrays.asList(chars) );
	}
	
	public static Q_600_5 getQ_600_5( Character c ) {
		if( VOWEL.chars.contains(c) )
			return VOWEL;
		if( SOMETIMES_A_VOWEL.chars.contains(c) )
			return SOMETIMES_A_VOWEL;
		return CONSONANT;
	}
	
	public static void main( String[] args ) {
		Random rand = new Random( 47 );
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt( 26 ) + 'a';
			System.out.print( (char) c + ", " + c + ": " );
			System.out.println( Q_600_5.getQ_600_5((char)c).toString() );
		}
	}
}
