package question;

import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

import lib.net.mindview.util.Countries;

class MySortedSet<T> extends AbstractSet<T> implements SortedSet<T> {
	
	private Comparator<T> comparator = null;
	private LinkedList<T> list;
	
	public MySortedSet() {
		list = new LinkedList<T>();
	}
	
	public MySortedSet( Comparator<T> comparator ) {
		list = new LinkedList<T>();
		this.comparator = comparator;
	}

	public boolean add( T t ) {
		list.add(t);
		return true;
	}
	
	@Override
	public Comparator<? super T> comparator() {
		return comparator;
	}

	@Override
	public T first() {
		return list.get(0);
	}

	@Override
	public SortedSet<T> headSet( T arg0 ) {
		SortedSet<T> set = new TreeSet<T>( comparator );
		Iterator<T> it = iterator();
		while( it.hasNext() ) {
			T tmp = it.next();
			if( tmp == arg0 ) {
				set.add( tmp );
				break;
			}
			set.add( tmp );
		}
		
		return set;
	}

	@Override
	public T last() {
		return list.get( list.size()-1 );
	}

	@Override
	public SortedSet<T> subSet( T arg0, T arg1 ) {
		SortedSet<T> set = new TreeSet<T>( comparator );
		Iterator<T> it = iterator();
		while( it.hasNext() ) {
			T tmp = it.next();
			if( tmp == arg0 ) {
				set.add( tmp );
				while( it.hasNext() ) {
					tmp = it.next();
					if( tmp == arg1 ) {
						set.add( arg1 );
						break;
					}
				}
			}
		}
		return set;
	}

	@Override
	public SortedSet<T> tailSet( T arg0 ) {
		SortedSet<T> set = new TreeSet<T>( comparator() );
		Iterator<T> it = iterator();
		while( it.hasNext() ) {
			T tmp = it.next();
			if( tmp == arg0 ) {
				set.add( tmp );
				while( it.hasNext() ) {
					set.add( it.next() );
				}
			}
		}
		return set;
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public int size() {
		return list.size();
	}
	
}   

public class Q_480_10 {

	public static void main( String[] args ) {
		MySortedSet<String> mySortedSet = new MySortedSet<String>( String.CASE_INSENSITIVE_ORDER );
		for( String string : Countries.names(10) )
			mySortedSet.add( string );
		System.out.println( mySortedSet );
		
		Iterator<String> it = mySortedSet.iterator();
		while( it.hasNext() ) {
			System.out.print( it.next() + "," );
		}
		
		System.out.println( mySortedSet.first() );
		System.out.println( mySortedSet.last() );
	}
}
