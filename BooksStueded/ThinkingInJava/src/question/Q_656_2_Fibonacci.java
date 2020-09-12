package question;

import java.util.Arrays;

import lib.net.mindview.util.Generator;

public class Q_656_2_Fibonacci implements Generator<Integer>, Runnable {

	private int count;
	
	public Q_656_2_Fibonacci( int n ) {
		count = n;
	}
	
	public Integer next() {
		return fib( count-- );
	}
	
	private int fib( int n ) {
		if( n < 2 )
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	
	@Override
	public void run() {
		int[] result = new int[count];
		
		for( int i = 0; i < count; i++ )
			result[i] = next();
		System.out.println( Arrays.toString(result) );
		return;
	}
	
	public static void main( String[] args ) {
		for( int i = 1; i <= 5; i++ )
			new Thread( new Q_656_2_Fibonacci(i) ).start();
	}
}
