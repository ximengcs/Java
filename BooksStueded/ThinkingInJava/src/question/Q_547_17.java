package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lib.net.mindview.util.TextFile;

public class Q_547_17 {

	static String fileName = "F:\\EclipseJava\\ThinkingInJava\\src\\TestFiles\\BasicFileOutput.txt";
	
	public static void main( String[] args ) {
		Map<Character, Integer> words = new HashMap<Character, Integer>();
		ArrayList<Character> word = new ArrayList<Character>();
		char[] chs = TextFile.read(fileName).toCharArray();
		char par = '□';
		
		for( Character ch : chs )
			if( ch.toString().matches( "\\s" ) )
				words.put( '□', words.get( '□' ) == null ? 1 : words.get('□')+1 );
			else
				words.put( ch, words.get(ch) == null ? 1 : words.get(ch)+1 );
		
		System.out.println( words );
	}
}
