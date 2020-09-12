package question;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Q_771_2 extends JFrame {

	public Q_771_2() {
		setSize( 300, 100 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setVisible( true );
	}

	private static Q_771_2 test;

	public static void main( String[] args ) {
		Random rand = new Random();
		final int quantity = rand.nextInt( 10 );

		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				test = new Q_771_2();
			}
		} );

		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				for (int i = 0; i < quantity; i++) {
					test.add( new JLabel( quantity + "" ) );
				}
			}
		} );
	}
}
