public class Question_49_10{
	public static void main( String[] args ){
		final int num1 = 0xaaaaaaaa;
		final int num2 = 0x55555555;
		
		System.out.println( Integer.toBinaryString(num1) );
		System.out.println( Integer.toBinaryString(num2) );
		System.out.println( Integer.toBinaryString(+1) );
		System.out.println( Integer.toBinaryString(-1) );
		System.out.println( Integer.toBinaryString(Integer.MAX_VALUE) );
		System.out.println( Integer.toBinaryString(Integer.MIN_VALUE) );
	}
}