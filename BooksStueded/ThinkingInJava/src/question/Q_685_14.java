package question;

import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q_685_14 {
	
	public static void main( String[] args ) {
		
		ExecutorService exec = Executors.newCachedThreadPool();
		
		for( int i = 0; i < 10; i++ )
			exec.execute(  // 任务计时器
					new TimerTask() {
						public void run() {
							System.out.println( "run" );
						}
					} );
		exec.shutdown();
			
	}
}
