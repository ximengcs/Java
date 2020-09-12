import polymorphism.shape.*;

class Simon extends Shape{
	@Override public void draw(){
		System.out.println( "Simon.draw()" );
	}
	@Override public void erase(){
		System.out.println( "Simon.erase()" );
	}
	@Override public void print(){
		System.out.println( "Simon.print()" );
	}
}

public class Shapes{
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main( String[] args ){
		Shape[] s = new Shape[9];
		for( int i = 0; i < s.length; i++ )
			s[i] = gen.next();
		for( Shape shp : s ){
			//shp.draw();
			//shp.print();
		}
		
		Shape s2;
		s2 = new Simon();
		s2.draw();
		s2.erase();
		s2.print();
	}
}