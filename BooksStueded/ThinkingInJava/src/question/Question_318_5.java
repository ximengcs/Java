import java.util.*;

abstract class Shape{
	void draw(){
		System.out.println( this + ".draw()" );
	}
	abstract public String toString();
}

class Circle extends Shape{
	public String toString(){
		return "Circle";
	}
}

class Square extends Shape{
	public String toString(){
		return "Square";
	}
}

class Triangle extends Shape{
	public String toString(){
		return "Triangle";
	}
}

class Rhomboid extends Shape{
	public String toString(){
		return "Rhomboid";
	}
}

public class Question_318_5{
	public static void rotate( Shape shape ){
		if( shape instanceof Circle )
			return;
		else
			System.out.println( shape + " is rotating" );
	}
	public static void main( String[] args ){
		List<Shape> shapeList = Arrays.asList( new Circle(), new Square(), new Triangle(), new Rhomboid() );
		for( Shape shape : shapeList ){
			shape.draw();
			rotate(shape);
		}
	}
}