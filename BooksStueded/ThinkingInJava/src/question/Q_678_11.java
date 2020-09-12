package question;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Q_678_11_Test {
	private static int counter = 0;
	private volatile int code = 98259;
	private int id = counter++;
	synchronized public void plus() {
		code += 1;
		code += 1;
	}
	synchronized public void change() {
		code += 1;
		code += 1;
	}
	synchronized public void get() {
		System.out.println( id + " : " + code );
	}
}

class MyThread extends Thread {
	private Q_678_11_Test instance;
	public MyThread( Q_678_11_Test instance ) {
		this.instance = instance;
	}
	public void run() {
		for( int i = 0; i < 5; i++ ) {
			instance.plus();
			instance.change();
			instance.get();
		}
	}
}

public class Q_678_11 {

	public static void main( String[] args ) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Q_678_11_Test test = new Q_678_11_Test();
		for( int i = 0; i < 5; i++ )
			exec.execute( new MyThread( test ) );
		Thread.yield();
		exec.shutdown();
	}
}
