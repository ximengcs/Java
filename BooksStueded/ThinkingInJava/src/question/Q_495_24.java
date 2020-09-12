package question;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedList;

class SimpleHashSet<T> extends AbstractSet<T> {
	private static final int SIZE = 997;
	private LinkedList<T>[] buckets = new LinkedList[SIZE];
	
	@Override
	public boolean add( T t ) {
		int index = Math.abs( t.hashCode() ) % SIZE;
		if( buckets[index] == null ) {
			buckets[index] = new LinkedList<T>();
			buckets[index].add( t );
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private int index = 0;
			private LinkedList<T> li = new LinkedList<T>();
			{
				for( LinkedList<T> tmp : buckets ) {
					if( tmp != null ) {
						Iterator<T> it = tmp.iterator();
						while( it.hasNext() ) {
							li.add( it.next() );
						}
					}
				}
			}
			@Override
			public boolean hasNext() {
				return index < li.size();
			}

			@Override
			public T next() {
				return li.get(index++);
			}
			
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}

	@Override
	public int size() {
		int sz = 0;
		for( LinkedList<T> tmp : buckets ) {
			if( tmp != null )
				sz++;
		}
		
		return sz;
	}
}

public class Q_495_24 {

	public static void main( String[] args ) {
		SimpleHashSet<Integer> set = new SimpleHashSet<Integer>();
		int code = 98259;
		
		for( int i = 0; i < 10; i++ )
			set.add( code+i );
		
		System.out.println( "size : " + set.size() );
		
		// 迭代
		Iterator<Integer> it = set.iterator();
		while( it.hasNext() ) {
			System.out.print( it.next() + " " );
		}
	}
}
