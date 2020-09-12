package question;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

class SlowSet<T> extends AbstractSet<T> {

	private ArrayList<T> list = new ArrayList<T>();
	
	public boolean add( T t ) {
		if( list.contains(t) )
			return false;
		else{
			list.add( t );
			return true;
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

public class Q_492_18 {

	public static void main( String[] args ) {
		SlowSet<String> set = new SlowSet<String>();
		set.add( "a" );
		set.add( "b" );
		System.out.println( set );
	}
}
