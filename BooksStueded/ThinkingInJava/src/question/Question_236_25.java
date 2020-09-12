import java.util.*;
import net.mindview.util.*;

public class Question_236_25{
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
	}
}