import java.util.*;
import net.mindview.util.*;

public class Question_236_26{
	public static void main( String[] args ){
		Map<String, ArrayList<Integer>> stat = new HashMap<String, ArrayList<Integer>>();
		int wordCount = 0;
		for( String word : new TextFile( "Question_212_25.java", "\\W+" ) ){
			ArrayList<Integer> loc = stat.get(word);
			if( loc == null ){
				loc = new ArrayList<Integer>();
				stat.put( word, loc );
			}
			loc.add(++wordCount);
		}
		System.out.println( stat );
		Map<Integer, String> words = new TreeMap<Integer, String>();
		for( Map.Entry<String, ArrayList<Integer>> entry : stat.entrySet() )
			for( Integer poc : entry.getValue() ){
				words.put( poc, entry.getKey() );
			}
		System.out.println();	
		System.out.println( words );
	}
}