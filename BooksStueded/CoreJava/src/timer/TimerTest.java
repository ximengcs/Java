package timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main( String[] args ) {
		ActionListener listener = new TimerPrinter();
		Timer t = new Timer( 1000, listener );
		t.start();
		JOptionPane.showMessageDialog( null, "Quit program?" );
		System.exit(0);
	}
}

class TimerPrinter implements ActionListener {
	
	public void actionPerformed( ActionEvent e ) {
		System.out.println( "At the tone, the time is " + new Date() );
		Toolkit.getDefaultToolkit().beep();
	}
}
