import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
//import java.util.TreeMap;

public class Question_235_18{
	public static Map<String, String> map = new HashMap<String, String>();
	static {
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
	}
	public static void main( String[] args ){
		System.out.println( "HashMap:" + map );
		Map<String, String> link = new LinkedHashMap<String, String>();
		List<String> list = new ArrayList<String>();
		Iterator<String> it = map.keySet().iterator();
		while( it.hasNext() )
			list.add(it.next());
		Collections.sort(list);
		
		Iterator<String> it2 = list.iterator();
		while( it2.hasNext() ){
			String key = it2.next();
			link.put( key, map.get(key) );
		}
		
		//Map<String, String> tree = new TreeMap<String, String>(map);
		//Map<String, String> link = new LinkedHashMap<String, String>(tree);
		System.out.println( "LinkedHash:" + link );
	}
}