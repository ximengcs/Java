package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Q_775_7 extends JFrame {

	private JButton jb = new JButton( "test" );
	public Q_775_7() {
		jb.setCursor( new Cursor( HAND_CURSOR ) );
		add(jb);
		setLayout( new FlowLayout() );
	}
	
	public static void main( String[] args ) {
		run( new Q_775_7(), 200, 100 );
	}
}
