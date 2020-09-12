import java.util.*;

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument{
	void play( Note n ){
		System.out.println( "Instrument.play()" + n );
	}
	String what(){
		return toString();
	}	
	void adjust(){
		System.out.println( "Adjusting Instrument" );
	}
}

class NewType extends Instrument{
	void play( Note n ){
		System.out.println( "NewType.play()" + n );
	}
	String what(){
		return toString();
	}
	void adjust(){
		System.out.println( "Adjusting NewType" );
	}
}

class Wind extends Instrument{
	void play( Note n ){
		System.out.println( "Wind.play()" + n );
	}
	String what(){
		return toString();
	}
	void adjust(){
		System.out.println( "Adjusting Wind" );
	}
}

class Percussion extends Instrument{
	void play( Note n ){
		System.out.println( "Percussion.play()" + n );
	}
	String what(){
		return toString();
	}
	void adjust(){
		System.out.println( "Adjusting Percussion" );
	}
}

class Stringed extends Instrument{
	void play( Note n ){
		System.out.println( "Stringed.play()" + n );
	}
	String what(){
		return toString();
	}
	void adjust(){
		System.out.println( "Adjusting Stringed" );
	}
}

class Brass extends Wind{
	void play( Note n ){
		System.out.println( "Brass.play()" + n );
	}
	void adjust(){
		System.out.println( "Adjusting Brass" );
	}
}

class WoodWind extends Wind{
	void play( Note n ){
		System.out.println( "WoodWind.play()" + n );
	}
	void adjust(){
		System.out.println( "Adjusting WoodWind" );
	}
}

public class Question_155_6{
	public static void tune( Instrument i ){
		//i.play( Note.MIDDLE_C );
		System.out.println( i.what() );
	}
	public static void tuneAll( Instrument[] e ){
		for( Instrument i : e )
			tune(i);
	}
	public static void main( String[] args ){
		Random rand = new Random();
		Instrument[] orchestra = new Instrument[10];
		for( int i = 0; i < 10; i++ ){
			switch( rand.nextInt(6) ){
				case 0: orchestra[i] = new NewType();break;
				case 1: orchestra[i] = new Wind();break;
				case 2: orchestra[i] = new Percussion();break;
				case 3: orchestra[i] = new Stringed();break;
				case 4: orchestra[i] = new Brass();break;
				case 5: orchestra[i] = new WoodWind();break;
			}
		}
		tuneAll( orchestra );
	}
}