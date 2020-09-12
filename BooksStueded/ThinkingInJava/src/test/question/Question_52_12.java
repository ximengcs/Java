public class Question_52_12{
	public static void main( String[] args ){
		int test = 0xffffffff;
		
		System.out.println( Integer.toBinaryString( test ) );
		test <<= 1;
		System.out.println( Integer.toBinaryString( test ) );
		
		while( test != 0 ){
			test >>>= 1;
			System.out.println( Integer.toBinaryString( test ) );
		}
	}
}