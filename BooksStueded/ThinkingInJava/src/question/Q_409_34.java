package question;

abstract class Q_409_A <T extends Q_409_A<T>> {
	abstract T test( T t );
	
	T get(){
		return test( null );
	}
}

class Q_409_B extends Q_409_A<Q_409_B> {
	Q_409_B test( Q_409_B q ){
		if( q == null )
			return this;
		return q;
	}
	public String toString(){
		return "test";
	}
}

public class Q_409_34 {
	public static void main( String[] args ){
		Q_409_B test = new Q_409_B();
		System.out.println( test == test.get() );
		System.out.println( test.get() );
	}
}	
