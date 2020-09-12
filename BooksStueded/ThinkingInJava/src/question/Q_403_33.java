package question;

import java.util.*;

class Repair<T> extends ArrayList<T> {
	private int index = 0;
	public Repair( int size ){
		super(size);
	}
	public void push( T item ){
		add( item );
		index++;
	}
	public T pop(){
		return (T) remove(--index);
	}
}

public class Q_403_33 {
	public static final int SIZE = 10;
	public static void main( String[] args ) {
//      will throw exception
//		FixedSizeStack<String> strings = new FixedSizeStack<String>( SIZE );
		Repair<String> strings = new Repair<String>( SIZE );
		for( String str : "A B C D E F G H I J A".split( " " ) )
			strings.push( str );
		for( int i = 0; i < SIZE; i++ ){
			String s = strings.pop();
			System.out.print( s + " " );
		}
	}
}
