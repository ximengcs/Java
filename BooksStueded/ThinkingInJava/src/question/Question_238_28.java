import java.util.*;

public class Question_238_28{
	public static void main( String[] args ){
		Random rand = new Random();
		Queue<Double> queue = new PriorityQueue<Double>();
		for( int i = 0; i < 10; i++ )
			queue.offer( rand.nextDouble() );
		while( queue.peek() != null )
			System.out.print( queue.poll() + " " );
	}
}