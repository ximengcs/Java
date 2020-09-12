import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Question_236_19{
	public static Set<String> hashSet = new HashSet<String>();
	static {
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("e");
	}
	public static void main( String[] args ){
		Set<String> link = new LinkedHashSet<String>();
		
		System.out.println(hashSet);
		List<String> list = new ArrayList<String>();
		Iterator<String> it = hashSet.iterator();
		while( it.hasNext() )
			list.add(it.next());
		Collections.sort(list);
		link.addAll(list);
		System.out.println(link);
	}
}