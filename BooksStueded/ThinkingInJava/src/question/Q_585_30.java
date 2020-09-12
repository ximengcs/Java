package question;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Shape implements Serializable {
	public static final int RED = 1, BLUE = 2, GREEN = 3;
	private int xPos, yPos, dimension;
	private static Random rand = new Random(47);
	private static int counter = 0;
	public abstract void setColor( int newColor );
	public abstract int getColor();
	
	public Shape( int xVal, int yVal, int dim ) {
		xPos = xVal;
		yPos = yVal;
		dimension = dim;
	}
	
	public String toString() {
		return getClass() + 
				"color [ " + getColor() + "] xPos [ " + xPos + 
				" ] yPos [ " + yPos + " ] dim [ " + dimension + " ]\n";
	}
	
	public static Shape randomFactory() {
		int xVal = rand.nextInt(100);
		int yVal = rand.nextInt(100);
		int dim = rand.nextInt(100);
		switch( counter++ % 3 ) {
		default :
		case 0 : return new Circle( xVal, yVal, dim );
		case 1 : return new Square( xVal, yVal, dim );
		case 2 : return new Line( xVal, yVal, dim );
		}
	}
}

class Circle extends Shape {
	private static int color = RED;
	public Circle( int xVal, int yVal, int dim ) {
		super( xVal, yVal, dim );
	}
	public void setColor( int newColor ) { color = newColor; }
	public int getColor() { return color; }
	
	public static void serializeStaticState( ObjectOutputStream os ) throws IOException {
		os.writeInt(color);
	}
	public static void deserializeStaticState( ObjectInputStream os ) throws IOException {
		color = os.readInt();
	}
}

class Square extends Shape {
	private static int color;
	public Square( int xVal, int yVal, int dim ) {
		super( xVal, yVal, dim );
		color = RED;
	}
	public void setColor( int newColor ) { color = newColor; }
	public int getColor() { return color; }
	
	public static void serializeStaticState( ObjectOutputStream os ) throws IOException {
		os.writeInt(color);
	}
	public static void deserializeStaticState( ObjectInputStream os ) throws IOException {
		color = os.readInt();
	}
}

class Line extends Shape {
	private static int color = RED;
	public static void serializeStaticState( ObjectOutputStream os ) throws IOException {
		os.writeInt(color);
	}
	public static void deserializeStaticState( ObjectInputStream os ) throws IOException {
		color = os.readInt();
	}
	public Line( int xVal, int yVal, int dim ) {
		super( xVal, yVal, dim );
	}
	public void setColor( int newColor ) {
		color = newColor;
	}
	public int getColor() {
		return color;
	}
}

class StoreCADState {

	public static void main( String[] args ) throws Exception {
		List<Shape> shapes = new ArrayList<Shape>();
		for( int i = 0; i < 10; i++ )
			shapes.add( Shape.randomFactory() );
		for( int i = 0; i < 10; i++ )
			((Shape)shapes.get(i)).setColor(Shape.GREEN);
		
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream( "CADState.out" ) );
		Circle.serializeStaticState(out);
		Square.serializeStaticState(out);
		Line.serializeStaticState(out);
		out.writeObject( shapes );
		System.out.println( shapes );
	}
}

class RecoverCADState {

	@SuppressWarnings( "unchecked" )
	public static void main( String[] args ) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream( "CADState.out" ) );
		Circle.deserializeStaticState( in );
		Square.deserializeStaticState( in );
		Line.deserializeStaticState( in );
		List<Shape> shapes = (List<Shape>)in.readObject();
		System.out.println( shapes );
	}
}

public class Q_585_30 {
	public static void main( String[] args ) throws Exception {
		StoreCADState.main(args);
		RecoverCADState.main(args);
	}
}
