package test;

public class TestTime {
	public static void main( String[] args ){
		java.util.Date time = new java.util.Date();
		System.out.println( time.getTime() );
		for( int i = 0; i < 100000; i++ )
			;
		java.util.Date time2 = new java.util.Date();
		System.out.println( time2.getTime() );
		System.out.println( time.getTime() );
	}
}
