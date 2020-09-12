package unit2;
// 810130492 
// 718237046
// 1034257933
// 3516402306
// 670696114
// 854931891
//  59787051
import java.util.Scanner;

// 耗时810130492
/*public class BEGIN_9 {

	public static void main( String[] args ) {

		int n = new Scanner( System.in ).nextInt();
		
		long time = System.nanoTime();
		int start = start(5),
			end = end(5);
		while( start <= end ) {
			if( check(start, n) )
				System.out.println( start );
			start++;
		}
		
		start = start(6);
		end = end(6);
		while( start <= end ) {
			if( check(start, n) )
				System.out.println( start );
			start++;
		}
		System.out.println( System.nanoTime() - time );
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
	
	private static boolean check( int n, int number ) {
		
		int bitCount = 0;
		for( int tmp = n; tmp != 0; tmp /= 10 ) {
			bitCount++;
		}
		
		int[] list = new int[bitCount];
		
		int i = 0;
		for( String str : String.valueOf( n ).split( "" ) ) {
			list[i++] = Integer.valueOf( str );
		}
		
		int sum = 0; // 总和
		for( i = 0; i < bitCount; i++ ) {
			if( list[i] != list[bitCount-1-i] )
				return false;
			sum += list[i];
		}
		if( sum != number )
			return false;
		return true;
	}
}
*/

// 耗时59787051
public class BEGIN_9 {

	public static void main( String[] args ) {

		Scanner in = new Scanner( System.in );
		int n = in.nextInt();
		//in.close();
		int start = start(5),
			end = start*10-1;
		while( start <= end ) {
			if( check(start, n) )
				System.out.println( start );
			start++;
		}
		
		start = start(6);
		end =  start*10-1;
		while( start <= end ) {
			if( check(start, n) )
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
	
	private static boolean check( int n, int number ) {
		
		int bitCount = 0;
		for( int tmp = n; tmp != 0; tmp /= 10 ) {
			bitCount++;
		}
		
		int[] list = new int[bitCount];
		
		int i = 0;
		while( n != 0 ) {
			list[i] = n%10;
			n /= 10;
			i++;
		}
		int sum = 0; // 总和
		for( i = 0; i < bitCount; i++ ) {
			if( list[i] != list[bitCount-1-i] )
				return false;
			sum += list[i];
		}
		if( sum != number )
			return false;
		return true;
		/*int i = 0;
		for( String str : String.valueOf( n ).split( "" ) ) {
			list[i++] = Integer.valueOf( str );
		}
		
		int sum = 0; // 总和
		for( i = 0; i < bitCount; i++ ) {
			if( list[i] != list[bitCount-1-i] )
				return false;
			sum += list[i];
		}
		if( sum != number )
			return false;
		return true;*/
		
		/*int[] list = new int[bitCount];
		
		int i = 0;
		for( String str : String.valueOf( n ).split( "" ) ) {
			list[i++] = Integer.valueOf( str );
		}
		
		int sum = 0; // 总和
		for( i = 0; i < bitCount; i++ ) {
			if( list[i] != list[bitCount-1-i] )
				return false;
			sum += list[i];
		}
		if( sum != number )
			return false;
		return true;*/
	}
}

