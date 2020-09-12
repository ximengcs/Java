package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Q_785_10 extends JFrame {

	private JButton button = new JButton( "test" );
	private JTextField text = new JTextField( 10 );
	
	public Q_785_10() {
		setLayout( new GridLayout( 1, 1 ) );
		
		button.addKeyListener( new KeyListener() {

			@Override
			public void keyTyped( KeyEvent e ) {
			}

			@Override
			public void keyPressed( KeyEvent e ) {
				text.setText( Character.toString( e.getKeyChar() ) );
			}

			@Override
			public void keyReleased( KeyEvent e ) {
			}
			
		} );
		
		add( text );
		add( button );
	}
	
	public static void main( String[] args ) {
		run( new Q_785_10(), 300, 400 );
	}
}
