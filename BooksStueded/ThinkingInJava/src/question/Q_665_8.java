package question;

import java.util.concurrent.TimeUnit;

public class Q_665_8 extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;

	public Q_665_8() {
		// Store the thread name:
		super( Integer.toString( ++threadCount ) );
		setDaemon(true);
		start();
	}

	public String toString() {
		return "#" + getName() + "(" + countDown + "), ";
	}

	public void run() {
		while (true) {
			System.out.print( this );
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (--countDown == 0)
				return;
		}
	}

	public static void main( String[] args ) {
		for (int i = 0; i < 5; i++)
			new Q_665_8();
	}
}