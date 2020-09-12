import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Question_227_11{
	public static void iterator( Collection<String> collection ){
		Iterator<String> it = collection.iterator();
		while( it.hasNext() ){
			System.out.println( it.next().toString() );
		}
		System.out.println();
	}
	public static void main( String[] args ){
		Collection<String> arrayList = new ArrayList<String>();
		Collection<String> linkedList = new LinkedList<String>();
		Collection<String> hashSet = new HashSet<String>();
		Collection<String> treeSet = new TreeSet<String>();
		Collection<String> linkedHashSet = new LinkedHashSet<String>();
		
		for( int i = 0; i < 10; i++ ){
			arrayList.add(create());
			linkedList.add(create());
			hashSet.add(create());
			treeSet.add(create());
			linkedHashSet.add(create());
		}
		iterator(arrayList);
		iterator(linkedList);
		iterator(hashSet);
		iterator(treeSet);
		iterator(linkedHashSet);
	}
	public static String create(){
		Random rand = new Random();
		switch( rand.nextInt(5) ){
			case 0: return "Telephone";
			case 1: return "Burning";
			case 2: return "fade";
			case 3: return "Need you now";
			default : return "love you like a love song";
		}
	}
}
