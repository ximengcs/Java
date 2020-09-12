package question;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q_660_6 implements Runnable {

	public void run() {
		int time = new Random().nextInt(10)+1;
		try {
			//System.out.println( time );
			TimeUnit.MILLISECONDS.sleep( time*1000 );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println( "time = " + time );
		return;
	}
	
	public static void main( String[] args ) {
		ExecutorService executor = Executors.newCachedThreadPool();
		for( int i = 0; i < 10; i++ )
			executor.execute( new Q_660_6() );
		executor.shutdown();
	}
}
