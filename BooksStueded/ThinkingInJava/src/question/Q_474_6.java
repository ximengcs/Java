package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q_474_6 {

	static void test( String msg, List<String> list ) {
		System.out.println( "--" );
		List<String> subList = list.subList( 2, 4 );
		List<String> arrayList = new ArrayList<String>( subList );
		try{
			list.add( "test" );
		} catch( Exception e ) {
			System.out.println( "add( element )" );
		}
		try{
			list.add( 0, "Test" );
		} catch( Exception e ) {
			System.out.println( "add( index, element )" );
		}
		try{
			list.addAll( subList );
		} catch( Exception e ) {
			System.out.println( "addAll( Collection )" );
		}
		try{
			list.addAll( 2, subList );
		} catch( Exception e ) {
			System.out.println( "addAll( index, Collection" );
		}
		try{
			list.clear();
		} catch( Exception e ) {
			System.out.println( "clear" );
		}
		try{
			list.remove( subList );
		} catch( Exception e ) {
			System.out.println( "remove" );
		}
		try{
			list.removeAll( subList );
		} catch( Exception e ) {
			System.out.println( "removeAll" );
		}
		try{
			list.retainAll( subList );
		} catch( Exception e ) {
			System.out.println( "retainAl" );
		}
		try{
			list.set( 1, "a" );
		} catch( Exception e ) {
			System.out.println( "set" );
		}
	}
	
	public static void main( String[] args ) {
		List<String> list = 
				Arrays.asList( "a b c d e f g h i j k l m n o p".split( " " ) );
		test( "ArrayList : ", new ArrayList<String>( list ) );
		test( "Arrays.asList : ", list);
		test( "modifiableList : ", Collections.unmodifiableList( new ArrayList<String>( list ) ) );
	}
}
