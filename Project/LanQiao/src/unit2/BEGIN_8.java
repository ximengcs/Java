package unit2;

public class BEGIN_8 {

	public static void main( String[] args ) {
		int n = 4; // 几位数
		
		int start = start(n),
			end = end(n);
		while( start <= end ) {
			if( check(start) )
				System.out.println( start );
			start++;
		}
	}
	
	private static int start( int n ) {
		int result = 1;
		for( int i = 1; i < n; i++ )
			result *= 10;
		return result;
	}
	private static int end( int n ) {
		return start(n)*10-1;
	}
	
	private static boolean check( int n ) {
		
		int bitCount = 0;
		for( int tmp = n; tmp != 0; tmp /= 10 ) {
			bitCount++;
		}
		
		int[] list = new int[bitCount];
		
		int i = 0;
		for( String str : String.valueOf( n ).split( "" ) ) {
			list[i++] = Integer.valueOf( str );
		}
		
		for( i = 0; i < bitCount; i++ )
			if( list[i] != list[bitCount-1-i] )
				return false;
		return true;
	}
}