package question;

import lib.net.mindview.util.Countries;

interface SListIterator<T> {
	boolean hasNext();
	T next();
	T remove();
	void add( T element );
}

class SList<T> {
	
	private final Link<T> link = new Link<T>( null, null );
	
	SList() {
		link.next = link;
	}
	
	private static class Link<T> {
		T element;
		Link<T> next;
		public Link( T element, Link<T> link ){
			this.element = element;
			next = link;
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append( "[" );
		SListIteratorImp it = iterator();

		while( it.hasNext() ) {
			T t = it.next();
			result.append( t );
			if(  it.hasNext() )
				result.append( ", " );
		}
		result.append( "]" );
		return result.toString();
	}
	
	public SListIteratorImp iterator() {
		return new SListIteratorImp();
	}
	
	private class SListIteratorImp implements SListIterator<T> {

		private Link<T> next;
		private Link<T> last = link;
		
		SListIteratorImp() { 
			next = link.next;
		}
		
		public boolean hasNext() {
			return next != link;
		}
		
		public T next() {
			last = next;
			next = next.next;
			return last.element;
		}
		
		public void add( T element) {
			Link<T> tmp = new Link<T>( element, next );
			if( link.next == link ) {
				link.next = tmp;
			} else {
				Link<T> current = link;
				while( true ) {
					if( current.next == next ) {
						current.next = tmp;
						break;
					}
					current = current.next;
				}
			}
		}

		public T remove() {
			T t;
			
			if( link == link.next )
				return null;
			Link<T> lastLink = link;
			Link<T> current = link;
			while( true ) {
				if( current.next == link ) {
					t = current.element;
					lastLink.next = link;
					next = lastLink.next;
					break;
				}
				lastLink = current;
				current = current.next;
			}
			return t;
		}
	}
}

public class Q_477_8 {

	public static void main( String[] args ) {
		SList<String> list = new SList<String>();
		SListIterator<String> it = list.iterator();
		
		for( String str : Countries.names(5) )
			it.add( str );
		
		it = list.iterator();
		
		System.out.println( list );
		System.out.println( "remove1 : " + it.remove() );
		System.out.println( "remove2 : " + it.remove() );
		System.out.println( "remove3 : " + it.remove() );
		
		System.out.println( list );
	}
}
