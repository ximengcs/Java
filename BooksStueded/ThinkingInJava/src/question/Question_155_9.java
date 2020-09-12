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
public class Question_155_9{
	public static void tune( Rodent e ){
		e.print();
	}
	public static void main( String[] args ){
		Random rand = new Random();
		Rodent[] r = new Rodent[10];
		for( int i = 0; i < 10; i++ ){
			switch( rand.nextInt(3) ){
				case 0 : r[i] = new Mouse();break;
				case 1 : r[i] = new Gerbil();break;
				case 2 : r[i] = new Hamster();break;
			}
		}
		for( Rodent s : r ){
			tune(s);
		}
	}
}