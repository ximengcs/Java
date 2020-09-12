package polymorphism.shape;

public class Square extends Shape{
	@Override public void draw(){
		System.out.println( "Square.draw()" );
	}
	@Override public void erase(){
		System.out.println( "Square.erase()" );
	}
	public void print(){
		System.out.println( "i am son of shape and my name is square" );
	}
}