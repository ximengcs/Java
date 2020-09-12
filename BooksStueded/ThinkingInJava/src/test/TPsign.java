package test;

import java.util.*;

class A {}
class B extends A {
	public void print(){
		System.out.println( "B" );
	}
}
class C extends B {
	public void print(){
		System.out.println( "C" );
	}
}
class D extends A {}

public class TPsign {
	public static void main( String[] args ){
		List<? extends A> test = new ArrayList<B>();
		ArrayList<B> t = new ArrayList<B>();
		test = t;
		//connot compile
//		test.add(new B());
//		test.add(new C());
		System.out.println(test);
	}
}
