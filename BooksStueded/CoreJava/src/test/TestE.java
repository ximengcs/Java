package test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestE {

	public static void main( String[] args ) {
		ArrayList list = new ArrayList();
		list.add( new TestD_A() );
		list.add( new TestD_B() );
		
		TestD_A a;
		Iterator it = list.iterator();
		((TestD_B)(it.next())).testB();
		((TestD_B)(it.next())).testB();
		
		TestD_C i = new TestD_C();
		TestD_C.TestD_D instance = i.new TestD_D();
	}
}

class TestD_C {
	int a;
	class TestD_D {
		int b = TestD_C.this.a;
	}
}

interface TESTd {
	TestE t = new TestE();
	default int a() {
		return 1;
	};
	static void f() {
		System.out.println(  );
	}
}

class TestD_A { 
	public void testA() {
		System.out.println( "testa" );
	}
}
class TestD_B {
	public void testB() {
		System.out.println( "testb" );
	}
}