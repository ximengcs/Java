package question;

import static lib.generics.TupleTest.*;

import lib.net.mindview.util.TwoTuple;

public class Q_365_15 {
	public static void main( String[] args ){
		TwoTuple<String, Integer> ttsi = f();
		System.out.println( ttsi );
		System.out.println( f2() );
		System.out.println( g() );
		System.out.println( h() );
		System.out.println( k() );
		System.out.println( l() );
	}
}
