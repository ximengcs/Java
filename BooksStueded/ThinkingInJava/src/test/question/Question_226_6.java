import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Question_226_6{
	public static void main( String[] args ){
		Random rand = new Random();
		List<String> pets = new ArrayList<String>( Arrays.asList( "a", "b", "c", "d" ) );
		System.out.println( "1:" + pets );
		String h = "abc";
		pets.add(h);
		System.out.println( "2:" + pets );
		System.out.println( "3:" + pets.contains(h) );
		pets.remove(h);
		String p = pets.get(2);
		System.out.println( "4:" + p + " " + pets.indexOf(p) );
		String cymric = "simon";
		System.out.println( "5:" + pets.indexOf(cymric) );
		System.out.println( "6:" + pets.remove(cymric) );
		System.out.println( "7:" + pets.remove(p) );
		System.out.println( "8:" + pets );
		pets.add(3, "qwe");
		System.out.println( "9:" + pets );
		List<String> sub = pets.subList(1, 4);
		System.out.println( "subList:" + sub );
		System.out.println( "10:" + pets.containsAll(sub) );
		Collections.sort(sub);
		System.out.println( "sorted subList:" + sub );
		System.out.println( "11:" + pets.containsAll(sub) );
		Collections.shuffle( sub, rand );
		System.out.println( "shuffled subList:" + sub );
		System.out.println( "12:" + pets.containsAll(sub) );
		List<String> copy = new ArrayList<String>(pets);
		sub = Arrays.asList( pets.get(1), pets.get(3) );
		System.out.println( "sub:" + sub );
		copy.retainAll(sub);
		System.out.println( "13:" + copy );
		copy = new ArrayList<String>(pets);
		copy.remove(2);
		System.out.println( "14:" + copy );
		copy.removeAll(sub);
		System.out.println( "15:" + copy );
		copy.set(0, "dsffd");
		System.out.println( "16:" + copy );
		copy.addAll(1, sub);
		System.out.println( "17:" + copy );
		System.out.println( "18:" + copy.isEmpty() );
		pets.clear();
		System.out.println( "19:" + pets );
		System.out.println( "20:" + pets.isEmpty() );
		pets.addAll( Arrays.asList("asd", "das", "das") );
		System.out.println( "21:" + pets );
		Object[] o = pets.toArray();
		System.out.println( "22:" + o[2] );
	}
}