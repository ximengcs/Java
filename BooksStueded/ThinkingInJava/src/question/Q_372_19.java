package question;

import java.util.ArrayList;
import lib.net.mindview.util.Generator;
import lib.generics.Generators;
import java.util.Random;

class Thing{
	private static long counter = 1;
	private final long id = counter++;
	private long distrct;
	private long shipID;
	private Thing( long distrct, long shipID ){
		this.distrct = distrct;
		this.shipID = shipID;
	}
	public static Generator<Thing> generator( long distrct, long shipID ){
		return new Generator<Thing>(){
			Random rand = new Random();
			public Thing next(){
				return new Thing( distrct, shipID );
			}
		};
	}
	public String toString(){
		return shipID + ":" + distrct + ":" + id;
	}
}

class Distrct extends ArrayList<Thing>{
	private static long counter = 1;
	private final long ID = counter++;
	public Distrct( long shipID, int nThing ){
		Generators.fill( this, Thing.generator( ID, shipID ), nThing );
	}
}

class Ship extends ArrayList<Distrct>{
	private static long counter = 1;
	private final long ID = counter++;
	public Ship( int nDistrct, int nThing ){
		for( int i = 0; i < nDistrct; i++ )
			add( new Distrct( ID, nThing ) );
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		for( Distrct d : this )
			for( Thing t : d ){
				result.append( d.toString() );
				result.append( "\n" );
			}
		return result.toString();
	}
}

public class Q_372_19 {
	public static void main( String[] args ){
		ArrayList<Ship> ships = new ArrayList<Ship>();
		ships.add( new Ship( 4, 2 ) );
		System.out.println( ships );
	}
}
