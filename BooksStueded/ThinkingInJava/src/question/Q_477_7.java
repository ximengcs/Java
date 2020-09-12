package question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lib.net.mindview.util.Countries;

public class Q_477_7 {

	public static void main( String[] args ) {
		ArrayList<String> arrayList = new ArrayList<String>( Countries.names(10) );
		LinkedList<String> linkedList = new LinkedList<String>( Countries.names(10) );
		
		Iterator<String> it = arrayList.iterator();
		while( it.hasNext() )
			System.out.print( it.next() + " " );
		System.out.println(  );
		
		it = linkedList.iterator();
		while( it.hasNext() )
			System.out.print( it.next() + " " );
		System.out.println(  );
		
		int index = 0;
		
		ListIterator<String> lit = arrayList.listIterator();
		while( lit.hasNext() ) {
			linkedList.add( index, lit.next() );
			index += 2;
		}
		System.out.println( linkedList );
		
		index = arrayList.size();
		lit = linkedList.listIterator( linkedList.size() );
		while( lit.hasPrevious() ) {
			arrayList.add( index, lit.previous() );
			index -= 2;
			if( index < 0 )
				break;
		}
		System.out.println( arrayList );
	}
}
