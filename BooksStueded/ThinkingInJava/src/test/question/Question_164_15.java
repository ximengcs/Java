class Glyph{
	void draw(){
		System.out.println( "Glyph.draw()" );
	}
	Glyph(){
		System.out.println( "Glyph() before draw()" );
		draw();
		System.out.println( "Glyph() after draw()" );
	}
}
class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph( int r ){
		radius = r;
		System.out.println( "RoundGlyph.RoundGlyph().radius = " + radius );
	}
	void draw(){
		System.out.println( "RoundGlyph.draw(), radius = " + radius );
	}
}
class RectangularGlyph extends Glyph{
	private int radius = 47;
	private String s;
	RectangularGlyph( int r ){
		radius = r;
		s = "simon";
		System.out.println( "RectangularGlyph.RectangularGlyph() radius " + radius + ", s = " + s );
	}
	void draw(){
		System.out.println( "RectangularGlyph.draw() radius " + radius + ",s = " + s );
	}
}
public class Question_164_15{
	public static void main( String[] args ){
		//new RoundGlyph(5);
		new RectangularGlyph(98259);
	}
}