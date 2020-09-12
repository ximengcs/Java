class Cycle{
	void print(){
		System.out.println( "Cycle" );
	}
	//void balance(){}
}
class Unicycle extends Cycle{
	void print(){
		System.out.println( "Unicycle" );
	}
	void balance(){
		System.out.println( "Unicycle.balance()" );
	}
}
class Bicycle extends Cycle{
	void print(){
		System.out.println( "Bicycle" );
	}
	void balance(){
		System.out.println( "Bicycle.balance()" );
	}
}
class Tricycle extends Cycle{
	void print(){
		System.out.println( "Tricycle" );
	}
}
public class Question_168_17{
	public static void main( String[] args ){
		Unicycle u = new Unicycle();
		Bicycle c = new Bicycle();
		Tricycle t = new Tricycle();
		Cycle[] cycle = new Cycle[]{
			u,
			c,
			t,
		};
		( (Unicycle)cycle[0] ).balance();
		( (Bicycle)cycle[1] ).balance();
		//!( (Tricycle)cycle[2] ).balance();
	}
}