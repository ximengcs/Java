package question;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lib.concurrency.LiftOff;

public class Q_658_3 {

	// 声明周期
	static class CachedThreadPool {
	
		public static void main( String[] args ) {
			ExecutorService executor = Executors.newCachedThreadPool();
			for( int i = 0; i < 5; i++ )
				executor.execute( new LiftOff() );
			executor.shutdown();
		}
	}
	
	// 固定线程池
	static class FixedThreadPool {
		
		public static void main( String[] args ) {
			ExecutorService executor = Executors.newFixedThreadPool( 5 );
			for( int i = 0; i < 5; i++ )
				executor.execute( new LiftOff() );
			executor.shutdown();
		}
	}
	
	// 单一,序列化
	static class SingleThreadExecutor {
		
		public static void main( String[] args ) {
			ExecutorService executor = Executors.newSingleThreadExecutor();
			for( int i = 0; i < 5; i++ )
				executor.execute( new LiftOff() );
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
	}
}
