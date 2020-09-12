package question;

import lib.net.mindview.util.*;
import java.util.*;

public class Q_369_17_Sets {
	@SuppressWarnings( { "unchecked" } )
	private static <T> Set<T> use( Set<T> a ){
		if( a instanceof EnumSet )
			return ((EnumSet)a).clone();
		else
			return new HashSet<T>(a);
	}
	public static <T> Set<T> union( Set<T> a, Set<T> b ){
		Set<T> result = use(a);
		result.addAll( b );
		return result;
	}
	public static <T> Set<T> intersection( Set<T> a, Set<T> b ){
		Set<T> result = use(a);
		result.retainAll(b);
		return result;
	}
	public static <T> Set<T> difference( Set<T> superset, Set<T> subset ){
		Set<T> result = use(superset);
		result.removeAll(subset);
		return result;
	}
	public static <T> Set<T> complement( Set<T> a, Set<T> b ){
		return difference( union(a, b), intersection(a, b) );
	}
}
