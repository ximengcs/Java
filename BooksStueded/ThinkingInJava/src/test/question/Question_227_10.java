import java.util.*;
class Rodent{
	void print(){
		System.out.println( "Rodent" );
	}
}
class Mouse extends Rodent{
	void print(){
		System.out.println( "Mouse" );
	}
}
class Gerbil extends Rodent{
	void print(){
		System.out.println( "Gerbil" );
	}
}
class Hamster extends Rodent{
	void print(){
		System.out.println( "Hamster" );
	}
}
public class Question_227_10{
	public static void tune( Rodent e ){
		e.print();
	}
	public static void main( String[] args ){
		List<Rodent> rodent = new ArrayList<Rodent>();
		for( int i = 0; i < 10; i++ ){
			switch( new Random().nextInt(3) ){
				case 0 : rodent.add(new Mouse());break;
				case 1 : rodent.add(new Gerbil());break;
				case 2 : rodent.add(new Hamster());break;
			}
		}
		Iterator<Rodent> iterator = rodent.iterator();
		while( iterator.hasNext() )
			tune( iterator.next() );
	}
}