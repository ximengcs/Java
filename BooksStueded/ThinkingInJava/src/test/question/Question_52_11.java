public class Question_52_11{
	public static void main( String[] args ){
		int test = 0x7fffffff;
		while( test != 0 ){
			System.out.println( Integer.toBinaryString( test ) );
			test >>= 1;
		}
		System.out.println( Integer.toBinaryString( test ) );
	}
}