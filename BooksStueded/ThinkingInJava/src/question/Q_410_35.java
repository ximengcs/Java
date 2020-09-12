package question;

import java.util.*;
import lib.generics.coffee.*;

public class Q_410_35 {
	@SuppressWarnings( "unchecked" )
	static void oldStyleMethod( List probablyDogs ) {
		probablyDogs.add( new Object() );
	}
	public static void main( String[] args ) {
		List<Breve> dogs1 = new ArrayList<Breve>();
		oldStyleMethod( dogs1 );
		List<Breve> dog2 = Collections.checkedList( new ArrayList<Breve>(), Breve.class ); 
		try {
			oldStyleMethod( dog2 );
		} catch( Exception e ) {
			System.out.println( e );
		}
		List<Coffee> pets = Collections.checkedList( new ArrayList<Coffee>(), Coffee.class );
		pets.add( new Breve() );
		pets.add( new Latte() );
	}
}
