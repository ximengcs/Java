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

public class Question_318_4{
	public static void main( String[] args ){
		List<Shape> shapeList = Arrays.asList( new Circle(), new Square(), new Triangle(), new Rhomboid() );
		for( Shape shape : shapeList )
			shape.draw();
		Rhomboid rhomboid = (Rhomboid)shapeList.get(3);//successful
		//! Circle circle = (Circle)shapeList.get(3); //failure , throw ClassCastException
		Circle circle = null;
		if( shapeList instanceof Circle )
			circle = (Circle)shapeList.get(3);
		
		//quiz
		System.out.println( shapeList.get(3) instanceof Circle );
		System.out.println( shapeList.get(3) instanceof Rhomboid );
		System.out.println( shapeList.get(3) instanceof Shape );
	}
}