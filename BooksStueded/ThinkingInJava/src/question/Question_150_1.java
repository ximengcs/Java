class Cycle{
	void print(){
		System.out.println( "Cycle" );
	}
}
class Unicycle extends Cycle{
	void print(){
		System.out.println( "Unicycle" );
	}
}
class Bicycle extends Cycle{
	void print(){
		System.out.println( "Bicycle" );
	}
}
class Tricycle extends Cycle{
	void print(){
		System.out.println( "Tricycle" );
	}
}
public class Question_150_1{
	static void ride( Cycle c ){
		c.print();
	}
	public static void main( String[] args ){
		Unicycle u = new Unicycle();
		Bicycle c = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u);
		ride(c);
		ride(t);
	}
}