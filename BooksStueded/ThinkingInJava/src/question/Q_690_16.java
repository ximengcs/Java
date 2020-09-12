package question;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q_690_16 {
	
	private static Q_690_16 instance = new Q_690_16();

	private static Q_690_16 instance2 = new Q_690_16();
	
	private static Q_690_16 instance3 = new Q_690_16();
	
	private static Lock lock1 = new ReentrantLock();
	private static Lock lock2 = new ReentrantLock();
	private static Lock lock3 = new ReentrantLock();
	
	public static void test() {
		System.out.println( "START" );
		lock1.lock();
//		synchronized( instance ) {
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
			
//		}
		System.out.println( "END" );
		lock1.unlock();
	}
	
	public static void test2() {
		System.out.println( "START2" );
		lock2.lock();
//		synchronized( instance2 ) { 
			System.out.println( "test2....." );
			System.out.println( "test2...." );
			System.out.println( "test2..." );
			System.out.println( "test2.." );
			System.out.println( "test2." );
//		}
		System.out.println( "END2" );
		lock2.unlock();
	}
	
	public static void test3() {
		System.out.println( "START3" );
		lock3.lock();
//		synchronized( instance3 ) {
			System.out.println( "test3....." );
			System.out.println( "test3...." );
			System.out.println( "test3..." );
			System.out.println( "test3.." );
			System.out.println( "test3." );
//		}
		System.out.println( "END3" );
		lock3.unlock();
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

