package question;

public class Q_656_1 implements Runnable {

	private static int counter = 1;
	private final int id = counter++;
	public Q_656_1() {
		System.out.println( "constructor : Q_656_1 : " + id );
	}
	
	public void run() {
		System.out.println( "Q_656_1.run()1" );
		Thread.yield();
		System.out.println( "Q_656_1.run()2" );
		Thread.yield();
		System.out.println( "Q_656_1.run()3" );
		Thread.yield();
		System.out.println( "end" );
		//return;
	}
	
	public static void main( String[] args ) {
		for( int i = 0; i < 5; i++ )
			new Thread( new Q_656_1() ).start();
	}
}
