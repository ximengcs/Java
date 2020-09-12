package test;

public class Test2 {

	int code = 98259;
	
	{
		System.out.println( "2 " + code );
	}
	
	public Test2() {
		System.out.println( "3 " + code );
		code = 0;
		System.out.println( "4 " + code );
	}
	
	public static void main( String[] args ) {
		new Test2();
	}
}
