package question;

import java.util.concurrent.TimeUnit;

public class Q_690_15 {
	
	private static Q_690_15 instance = new Q_690_15();

	private static Q_690_15 instance2 = new Q_690_15();
	
	private static Q_690_15 instance3 = new Q_690_15();
	
	public static void test() {
		System.out.println( "START" );
		synchronized( instance ) {
			System.out.println( "test....." );
			System.out.println( "test...." );
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println( "test..." );
			System.out.println( "test.." );
			System.out.println( "test." );
			
		}
		System.out.println( "END" );
	}
	
	public static void test2() {
		System.out.println( "START2" );
		synchronized( instance2 ) { 
			System.out.println( "test2....." );
			System.out.println( "test2...." );
			System.out.println( "test2..." );
			System.out.println( "test2.." );
			System.out.println( "test2." );
		}
		System.out.println( "END2" );
	}
	
	public static void test3() {
		System.out.println( "START3" );
		synchronized( instance3 ) {
			System.out.println( "test3....." );
			System.out.println( "test3...." );
			System.out.println( "test3..." );
			System.out.println( "test3.." );
			System.out.println( "test3." );
		}
		System.out.println( "END3" );
	}
	
	public static void main( String[] args ) {
		new Thread() {
			public void run() {
				test();
			}
		}.start();
		new Thread() {
			public void run() {
				test2();
			}
		}.start();
		new Thread() {
			public void run() {
				test3();
			}
		}.start();
	}
}
