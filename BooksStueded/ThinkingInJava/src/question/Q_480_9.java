package question;

import java.util.TreeSet;

import lib.net.mindview.util.RandomGenerator;

public class Q_480_9 {

	public static void main( String[] args ) {
		TreeSet<String> treeSet = new TreeSet<String>();
		RandomGenerator.String string = new RandomGenerator.String();
		for( int i = 0; i < 10; i++ )
			treeSet.add( string.next() );
		System.out.println( treeSet );
	}
}
