package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Q_796_16 extends JFrame {

	private String[] flavors = {
			"Ch", "St", "Vanilla", "Mint", "Mocha", "Rum"
	};
	private int count = 0;
	private Object[] items = new Object[10];
	private int id = 0;
	private DefaultListModel lItems = new DefaultListModel();
	private JList lst = new JList( items );
	private JTextArea t = new JTextArea( flavors.length, 20 );
	private JButton b = new JButton( "Add Item" );
	private ActionListener bl = new ActionListener() {
		public void actionPerformed( ActionEvent e ) {
			if( count < flavors.length ) {
				//lItems.add( 0, flavors[count++] );
				items[id++] = flavors[count++];
			} else {
				b.setEnabled( false );
			}
		}
	};
	// 列表被更改时的侦听器
	private ListSelectionListener l1 = new ListSelectionListener() {
		public void valueChanged( ListSelectionEvent e ) {
			if( e.getValueIsAdjusting() )// 判断是否在列表中
				return;
			t.setText( "" );
			for( Object item : lst.getSelectedValues() ) 
				t.append( item + "\n" );
		}
	};
	public Q_796_16() {
		t.setEditable( false );
		setLayout( new FlowLayout() );
		Border brd = BorderFactory.createMatteBorder( 1, 1, 2, 2, Color.BLACK );// 边框
		lst.setBorder( brd );
		t.setBorder( brd );
		for( int i = 0; i < 4; i++ ) {
			//lItems.addElement( flavors[count++] );
			items[id] = flavors[count++];
			id++;
		}
		add( t );
		add( lst );
		add( b );
		lst.addListSelectionListener( l1 );
		b.addActionListener( bl );
	}
	public static void main( String[] args ) {
		run( new Q_796_16(), 250, 375 );
	}
}

