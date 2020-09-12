package question;

import java.util.PriorityQueue;
import java.util.Random;

class Q_482_11_IntegerInstance implements Comparable<Q_482_11_IntegerInstance> {
	Integer instance;
	
	public Q_482_11_IntegerInstance() {
		instance = new Random().nextInt(100);
	}
	
	public int compareTo( Q_482_11_IntegerInstance obj ) {
		int tmp = obj.instance;
		return instance < tmp ? 1 : ( instance == tmp ? 0 : -1 );
	}
	public String toString() {
		return "instance : " + instance;
	}
}

public class Q_482_11 {

	public static void main( String[] args ) {
		PriorityQueue<Q_482_11_IntegerInstance> queue = 
				new PriorityQueue<Q_482_11_IntegerInstance>();
		for( int i = 0; i < 10; i++ )
			queue.add( new Q_482_11_IntegerInstance() );
		
		while( !queue.isEmpty() ) {
			System.out.println( queue.remove() );
		}
	}
}
