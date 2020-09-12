package question;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lib.net.mindview.util.Generator;

public class Q_658_4 {

	class Fibonacci implements Generator<Integer>, Runnable {
		private int count;
		public Fibonacci( int count ) {
			this.count = count;
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
		public void run() {
			int[] result = new int[count];
			for( int i = 0; i < count; i++ )
				result[i] = next();
			System.out.println( Arrays.toString( result ) );
		}
	}
	
	// 周期
	static class CachedThreadPool {
		public static void main( String[] args ) {
			ExecutorService executor = Executors.newCachedThreadPool();
			for( int i = 0; i < 5; i++ )
				executor.execute( new Q_658_4().new Fibonacci(5) );
			executor.shutdown();
		}
	}
	
	// 固定大小
	static class FixedThreadPool {
		public static void main( String[] args ) {
			ExecutorService executor = Executors.newFixedThreadPool( 5 );
			for( int i = 0; i < 5; i++ )
				executor.execute( new Q_658_4().new Fibonacci(5) );
			executor.shutdown();
		}
	}
	
	// 单一，序列化
	static class SingleThreadExecutor {
		public static void main( String[] args ) {
			ExecutorService executor = Executors.newSingleThreadExecutor();
			for( int i = 0; i < 5; i++ )
				executor.execute( new Q_658_4().new Fibonacci(5) );
			executor.shutdown();
		}
	}
	
	public static void main( String[] args ) {
		System.out.println( "CachedThreadPool" );
		CachedThreadPool.main( args );
		System.out.println(  );
		
		System.out.println( "FixedThreadPool" );
		FixedThreadPool.main( args );
		System.out.println(  );
		
		System.out.println( "SingleThreadExecutor" );
		SingleThreadExecutor.main( args );
		System.out.println(  );
	}
}
