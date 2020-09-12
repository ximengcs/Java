package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Q_774_5 extends JFrame {

	private JTextField 
		t1 = new JTextField(10),
		t2 = new JTextField(10),
		t3 = new JTextField(10);
	private JButton
		b1 = new JButton( "JButton1" ),
		b2 = new JButton( "JButton2" ),
		b3 = new JButton( "JButton3" );
	private ActionListener event = new ActionListener() {
		public void actionPerformed( ActionEvent e ) {
			if( (JButton)(e.getSource()) == b1 )
				t1.setText( "text1" );
			else if( (JButton)(e.getSource()) == b2 )
				t2.setText( "text2" );
			else if( (JButton)(e.getSource()) == b3 )
				t3.setText( "text3" );
		}
	};
	
	public Q_774_5() {
		setLayout( new FlowLayout() );
		b1.addActionListener( event );
		b2.addActionListener( event );
		b3.addActionListener( event );
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
	}
	
	public static void main( String[] args ) {
		run( new Q_774_5(), 300, 150 );
	}
}
