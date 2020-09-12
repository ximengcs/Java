package polymorphism.shape;

public class Circle extends Shape{
	@Override public void draw(){
		System.out.println( "Circle.draw()" );
	}
	@Override public void erase(){
		System.out.println( "Circle.erase()" );
	}
	public void print(){
		System.out.println( "i am son of shape and my name is circle" );
	}
}