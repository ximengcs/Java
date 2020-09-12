import java.util.*;
import net.mindview.util.*;

public class Question_236_21{
	public static void main( String[] args ){
		List<String> words = new ArrayList<String>( new TextFile( "SetOperations.java", "\\W+" ) );
		Iterator<String> it = words.iterator();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		Collections.sort( words, String.CASE_INSENSITIVE_ORDER );
		System.out.println( words );
		while( it.hasNext() ){
			String str = it.next();
			Integer num = map.get(str);
			map.put( str, num == null ? 1 : num+1 );
		}
		Iterator<String> it2 = map.keySet().iterator();
		while( it2.hasNext() ){
			String s = it2.next();
			System.out.println( "共有" + map.get(s) + "个" + s );
		}
	}
}