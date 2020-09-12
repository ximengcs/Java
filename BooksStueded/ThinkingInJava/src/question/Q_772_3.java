package question;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import lib.net.mindview.util.SwingConsole;

public class Q_772_3 extends JFrame {

	JLabel label;
	public Q_772_3() {
		super( "helloswing" );
		label = new JLabel( "label" );
		add(label);
		SwingConsole.run( this, 300, 100 );
	}
	static Q_772_3 ssp;
	public static void main( String[] args ) throws Exception {
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				ssp = new Q_772_3();
			}
		});
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				ssp.label.setText( "hey" );
			}
		});
	}
}

