import java.util.*;

public class Question_225_5{
	public static void main( String[] args ){
		Random rand = new Random();
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList( 1, 2, 3, 4, 5 ));
		System.out.println( "1:" + ints );
		Integer num = new Integer(rand.nextInt(100));
		ints.add(num);
		System.out.println( "2:" + ints );
		System.out.println( "3:" + ints.contains(num) );
		ints.remove(rand.nextInt(6));
		Integer i = ints.get(2);
		System.out.println( "4:" + i + " " + ints.indexOf(i) );
		Integer c = new Integer(rand.nextInt(100));
		System.out.println( "5:" + ints.indexOf(c) );
		System.out.println( "6:" + ints.remove(c) );
		System.out.println( "7:" + ints.remove(i) );
		System.out.println( ints );
	}
}