package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import lib.net.mindview.util.Generator;
import lib.net.mindview.util.RandomGenerator;

public class Q_792_14 extends JFrame {

	private JButton b = new JButton( "Add Text" );
	private JTextArea t = new JTextArea( 300, 400 );
	private Generator g = new RandomGenerator.String( 7 );
	public Q_792_14() {
		b.addActionListener( 
				new ActionListener() {
					public void actionPerformed( ActionEvent e ) {
						for( int i = 0; i < 10; i++ )
							t.append( g.next() + "\n" );
					}
				} );
		add( new JScrollPane( t ) );
		add( BorderLayout.SOUTH, b );
	}
	
	public static void main( String[] args ) {
		run( new Q_792_14(), 400, 400 );
	}
}
