package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Q_793_15 extends JFrame {

	private JCheckBox 
		b1 = new JCheckBox( "Button1" ),
		b2 = new JCheckBox( "Button2" ),
		b3 = new JCheckBox( "Button3" );
	private JTextArea t = new JTextArea( 300, 300 );
	private JPanel p = new JPanel();
	public Q_793_15() {
		b1.addActionListener( 
				new ActionListener() {
					public void actionPerformed( ActionEvent e ) {
						t.append( "text1\n" );
					}
				} );
		b2.addActionListener( 
				new ActionListener() {
					public void actionPerformed( ActionEvent e ) {
						t.append( "text2\n" );
					}
				} );
		b3.addActionListener(
				new ActionListener() {
					public void actionPerformed( ActionEvent e ) {
						t.append( "text3\n" );
					}
				} );
		add( new JScrollPane( t ) );
		p.setLayout( new FlowLayout() );
		p.add( b1 );
		p.add( b2 );
		p.add( b3 );
		add( BorderLayout.SOUTH, p );
	}
	
	public static void main( String[] args ) {
		run( new Q_793_15(), 400, 300 );
	}
}
