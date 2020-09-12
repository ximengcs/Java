interface Instrument{
	void play();
	String what();
	void adjust();
	void prepareInstrument();
}

class Wind implements Instrument{
	public void play(){
		System.out.println( "Wind.play()" );
	}
	public String what(){
		return "Wind";
	}
	public void adjust(){}
	public void clearSpitValue(){
		System.out.println( "Wind.clearSpitValue" );
	}
	public void prepareInstrument(){
		clearSpitValue();
	}
}

class Percussion implements Instrument{
	public void play(){
		System.out.println( "Percussion.play()" );
	}
	public String what(){
		return "Perussion";
	}
	public void adjust(){}
	public void prepareInstrument(){
		System.out.println( "Perssion.prepaerInstrument" );
	}
}

class Stringed implements Instrument{
	public void play(){
		System.out.println( "Stringed.play()" );
	}
	public String what(){
		return "Percussion";
	}
	public void adjust(){}
	public void prepareInstrument(){
		System.out.println( "Percussion.prepareInstrument" );
	}
}

class Brass extends Wind{
	public void play(){
		System.out.println( "Brass.play()" );
	}
	public void adjust(){
		System.out.println( "Brass.adjust()" );
	}
	public void clareSpitValue(){
		System.out.println( "Brass.clearSpitValue" );
	}
}

class Woodwind extends Wind{
	public void play(){
		System.out.println( "Woodwind.play()" );
	}
	public String what(){
		return "Woodwind";
	}
	public void clearSpitValue(){
		System.out.println( "Woodwind.clearSpitValue" );
	}
}

class Music5{
	static void tune( Instrument i ){
		i.play();
	}
	static void tuneAll( Instrument[] e ){
		for( Instrument instrument : e )
			tune( instrument );
	}
	static void prepareAll( Instrument[] e ){
		for( Instrument instrument : e )
			instrument.prepareInstrument();
	}
}

public class Question_351_26{
	public static void main( String[] args ){
		Instrument[] orchestra = {
		new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), 
		};
		Music5.prepareAll( orchestra );
		Music5.tuneAll( orchestra );
	}
}