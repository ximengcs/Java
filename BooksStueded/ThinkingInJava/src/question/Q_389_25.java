package question;

import question.lib.A;
import question.lib.B;

class TestA implements A {
	public void printA(){
		System.out.println( "TestA.printA()" );
	}
}

class TestB implements B {
	public void printB(){
		System.out.println( "TestB.printB()" );
	}
}

public class Q_389_25 {
	public static <T extends A> void demoA( T a ){
		a.printA();
	}
	public static <T extends B> void demoB( T b ){
		b.printB();
	}
	public static void main( String[] args ){
		A a = new TestA();
		B b = new TestB();
		demoA( a );
		demoB( b );
	}
}
