public class Test1{
	static int result = 0;
	static void test( int testval, int target, int end, int begin ){
		if( testval < begin || target < begin || testval > end || target > end )
			return 0;
		if( testval > target )
			result = +1;
		else if( testval < target )
			result = -1;
		else
			result = 0;
	}
	public static void main( String[] args ){
		test( 10, 5, 1, 10 );
		System.out.print( result );
		test( 5, 10, 1, 10 );
		System.out.print( result );
		test( 5, 5, 1, 10 );
		System.out.print( result );
	}
}
		