interface Instrument{
	int VALUE = 5;
	//void play( Note n );
	void adjust();
}
interface ToString{
	String toString();
}
interface Playable{
	void play( Note n );
}
class Wind implements Instrument, ToString, Playable{
	public void play( Note n ){
		System.out.println( this + ".play() " + n );
	}
	public String toString(){
		return "Wind";
	}
	public void adjust(){
		System.out.println( this + ".adjust() " );
	}
}
class Percussion implements Instrument, ToString, Playable{
	public void play( Note n ){
		System.out.println( this + ".play() " + n );
	}
	public String toString(){
		return "Percussion";
	}
	public void adjust(){
		System.out.println( this + ".adjust()" );
	}
}
class Stringed implements Instrument, ToString, Playable{
	public void play( Note n ){
		System.out.println( this + ".play()" );
	}
	public String toString(){
		return "Stringed";
	}
	public void adjust(){
		System.out.println( this + ".adjust" );
	}
}
class Brass extends Wind{
	public String toString(){
		return "Brass";
	}
}
class Woodwind extends Wind{
	public String toString(){
		return "Woodwind";
	}
}
public class Question_174_10{
	static void tune( Playable i ){
		i.play( Note.MIDDLE_C );
	}
	static void tuneAll( Playable[] e ){
		for( Playable i : e )
			tune(i);
	}
	public static void main( String[] args ){
		Playable[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind(),
		};
		tuneAll(orchestra);
	}
}