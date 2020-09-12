package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Q_797_18 extends JFrame {

	private JButton[] b = {
			new JButton( "Alert" ), new JButton( "Yes/No" ),
			new JButton( "Color" ), new JButton( "Input" ),
			new JButton( "3 Vals" )
	};
	private JTextField txt = new JTextField( 15 );
	public Q_797_18() {
		b[0].addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				JOptionPane.showMessageDialog( null, "There's a bug on you", "hey",
						JOptionPane.ERROR_MESSAGE );
			}
		} );
		b[1].addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				JOptionPane.showConfirmDialog( null, "or no", "choose yes", 
						JOptionPane.YES_NO_OPTION );
			}
		} );
		b[2].addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				Object[] options = { "Red", "Green" };
				int sel = JOptionPane.showOptionDialog(
						null, "Choose a Color", "Waring", 
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE, null,
						options, options[0] );
				if( sel != JOptionPane.CLOSED_OPTION )
					txt.setText( "Color Selected : " + options[sel] );
			}
		} );
		b[3].addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				String val = JOptionPane.showInputDialog(
						"How many fingers do you see" );
				txt.setText( val );
			}
		} );
		b[4].addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				Object[] selections = { "First", "Second", "Third" };
				Object val = JOptionPane.showInputDialog(
						null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
						null, selections, selections[0] );
				if( val != null )
					txt.setText( val.toString() );
			}
		} );
		for( int i = 0; i < 5; i++ )
			add( b[i] );
		setLayout( new FlowLayout() );
		add(txt);
	}
	public static void main( String[] args ) {
		run( new Q_797_18(), 200, 200 );
	}
}
