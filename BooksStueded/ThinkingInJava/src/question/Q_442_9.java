package question;

import java.util.ArrayList;

class Ba {
	private static int counter = 1;
	private final int id = counter++;
	public String toString() {
		return "ba " + id;
	}
}

class Peel<T> {
	T fruit;
	public Peel( T t ) {
		fruit = t;
	}
	public String toString() {
		return "peel " + fruit.toString();
	}
}

public class Q_442_9 {

	public static void main(String[] args) {
		// complie error
		// Peel<Ba>[] peel = new Peel<Ba>[10];
		ArrayList<Peel<Ba>> peel = new ArrayList<Peel<Ba>>();
		for( int i = 0; i < 10; i++ )
			peel.add( new Peel<Ba>( new Ba() ) );
		for( Peel<Ba> ba : peel )
			System.out.println( ba.toString() );
	}
}
