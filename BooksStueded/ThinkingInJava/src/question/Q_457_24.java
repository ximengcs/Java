package question;

import java.util.Arrays;
import java.util.Comparator;

import lib.net.mindview.util.Generator;
import lib.net.mindview.util.RandomGenerator;

class Q_19_Comparator implements Comparator<Q_452_19_Test> {
	public int compare( Q_452_19_Test a, Q_452_19_Test b ) {
		return a.get() < b.get() ? -1 : ( a.get() == b.get() ? 0 : 1 );
	}
}

public class Q_457_24 {

	public static void main( String[] args ) {
		Generator<Integer> rand = new RandomGenerator.Integer(100);
		
		Q_452_19_Test[] a = new Q_452_19_Test[10];
		for( int i = 0; i < a.length; i++ )
			a[i] = new Q_452_19_Test( rand.next() );
		
		System.out.println( Arrays.toString( a ) );
		// sort
		Arrays.sort( a, new Q_19_Comparator() );
		
		System.out.println( Arrays.toString( a ) );
	}
}
