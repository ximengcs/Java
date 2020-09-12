package question;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lib.net.mindview.util.Generator;


public class Q_669_10 {

	public static Future<Integer> runTask( int sum ) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Future future = exec.submit( new Callable<Integer>() {
			
			class Fibonacci implements Generator<Integer> {
				private int count;
				public Fibonacci( int count ) {
					this.count = count;
				}
				public Integer next() {
					return fib(count--);
				}
				public int fib( int n ) {
					if( n < 2 )
						return 1;
					return fib(n-1) + fib(n-2);
				}
			}
			
			public Integer call() {
				int result = 0;
				Fibonacci fibonacci = new Fibonacci(sum);
				for( int i = 0; i < sum; i++ )
					result += fibonacci.next();
				return result;
			}
		} );
		exec.shutdown();
		return future;
	}
	
	public static void main( String[] args ) {
		for( int i = 0; i < 5; i++ )
			try {
				System.out.println( runTask(new Random().nextInt(10)).get() );
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
	}
}
