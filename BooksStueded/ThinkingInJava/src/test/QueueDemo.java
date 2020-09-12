import java.util.*;

public class QueueDemo{
	public static void printQ( Queue queue ){
		while( queue.peek() != null ){
			System.out.print( queue.remove() + " " );
		}
		System.out.println();
	}
	public static void main( String[] args ){
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random();
		for( int i = 0; i < 10; i++ ){
			queue.offer( rand.nextInt(100) );
		}
		printQ( queue );
		Queue<Character> chs = new LinkedList<Character>();
		for( char ch : "Monster".toCharArray() ){
			chs.offer( ch );
		}
		printQ(chs);
	}
}
