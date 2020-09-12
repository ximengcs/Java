public class Test2{
	static int test( int testval, int target, int begin, int end ){
		if( testval < begin || target < begin || testval > end || target > end )
			return 0;
		if( testval > target )
			return +1;
		else if( testval < target )
			return -1;
		else
			return 0;
	}
	public static void main( String[] args ){
		System.out.print( test( 10, 5, 1, 10 ) );
		System.out.print( test( 5, 10, 1, 10 ) );
		System.out.print( test( 5, 5, 1, 10 ) );
	}
}