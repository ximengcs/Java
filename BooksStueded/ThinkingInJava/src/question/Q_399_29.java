package question;

import java.util.*;
import lib.generics.Holder;

public class Q_399_29 {
	static void f1( Holder<List<?>> holder ){
		List<?> list = holder.get();
		//! list.add(1);
		//! list.add( new Object() );
		System.out.println( list.contains( holder.get() ) );
		System.out.println( list.remove( holder.get() ) );
	}
	static void f2( List<Holder<?>> list ){
		Holder<?> holder = list.get(0);
		//! holder.set( new Object() );
		Object obj = holder.get();
	}
	
	public static void main( String[] args ){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		Holder holder1 = new Holder( list1 );
		f1(holder1);
		
		List<Holder<?>> t1 = new ArrayList<Holder<?>>();
		t1.add( holder1 );
		f2( t1 );
		
	}
}
