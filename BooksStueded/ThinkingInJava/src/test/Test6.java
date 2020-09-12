package test;

class Base {
	public int a = 1;
	public void set( int b ) {
		this.a = b;
	}
	public void print() {
		System.out.println( super.toString() );
	}
}

class Son extends Base {
	public int a = 2;
	public void print() {
		System.out.println( "Son : " + a );
		System.out.println( "Son super : " + super.a );
	}
	public void change( int b ) {
		this.a = b;
	}
}

public class Test6 {

	public static void main(String[] args) {
		Son s = new Son();
		s.print();
		
		s.set( 3 );
		s.print();
	}
}
