package test;

public class TestC {

	public static void main( String[] args ) {
		TestB t = new TestB();
		System.out.println( t.code );
		t.test();
		Object obj = new Object();
		obj = new int[10];
	}
}
