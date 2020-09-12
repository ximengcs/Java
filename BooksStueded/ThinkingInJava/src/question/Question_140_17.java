class Amphibian{
	private int len = 0;
	static void walk( Amphibian a ){
		a.len++;
	}
	static void say( Amphibian a ){
		System.out.println( "~~" );
	}
}
class Frog extends Amphibian{
	static void say( Amphibian a ){
		System.out.println( "gua~" );
	}
}
public class Question_140_17{
	public static void main( String[] args ){
		Frog f = new Frog();
		Amphibian.walk(f);
		Amphibian.say(f);
		Frog.say(f);
	}
}