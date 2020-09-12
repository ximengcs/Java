package test;

public class TestB {

	protected int code = 98259;
	protected void test() {
		System.out.println( "!" );
	}
	public static void main( String[] args ) {
		
	}
}

class TestB_A {
	private TestB test1 = new TestB();
	{
		System.out.println( test1.code );
		test1.test();
	}
	
	public static void main( String[] args ) {
		new TestB_A();
	}
}
