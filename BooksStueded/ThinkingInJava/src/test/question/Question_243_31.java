import java.util.*;
import polymorphism.shape.*;

public class Question_243_31 implements Iterable<Shape>{
	Shape[] shape;
  private Random rand = new Random(47);
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
  public Question_243_31( int size ){
	  shape = new Shape[size];
	  for( Shape s : new Question_243_31( 10 ) ){
		  s = this.next();
	  }
  }
  public Iterator<Shape> iterator(){
	  return new Iterator<Shape>(){
		  private int index = 0;
		  public boolean hasNext(){
			  return index < shape.length;
		  }
		  public Shape next(){
			  return shape[index++];
		  }
		  public void remove(){
			  throw new UnsupportedOperationException();
		  }
	  };
  }
  
  public static void main( String[] args ){

  }
}
