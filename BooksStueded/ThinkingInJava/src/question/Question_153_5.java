class Cycle{
	void print(){
		System.out.println( "Cycle" );
	}
	int wheels(){
		return 47;
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
public class Question_153_5{
	static void ride( Cycle c ){
		//c.print();
		System.out.println( c.wheels() );
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