package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lib.net.mindview.util.Generator;

class Q_659_2_Fibonacci implements Generator<Integer>, Callable<List<Integer>> {

	private final int length;
	private int count;
	
	public Q_659_2_Fibonacci( int n ) {
		count = n;
		length = n;
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
	public List<Integer> call() {
		List<Integer> result = new ArrayList<Integer>();
		for( int i = 0; i < length; i++ )
			result.add( next() );
		Collections.reverse( result );
		return result;
	}
	
}
public class Q_659_5 {

	public static void main( String[] args ) {
		ExecutorService executor = Executors.newCachedThreadPool();
		ArrayList<Future<List<Integer>>> list = new ArrayList<Future<List<Integer>>>();
		for( int i = 1; i <= 5; i++ )
			list.add( executor.submit( new Q_659_2_Fibonacci(i) ) );
		
		for( Future<List<Integer>> future : list ) {
			if( future.isDone() )
				try {
					System.out.println( future.get() );
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				} finally {
					executor.shutdown();
				}
		}
	}
}
