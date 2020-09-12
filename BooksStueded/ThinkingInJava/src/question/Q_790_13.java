package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Q_790_13 extends JFrame {

	private JButton
		b1 = new JButton( "Get Text" ),
		b2 = new JButton( "Set Text" );
	private JTextField
		t1 = new JTextField(30),
		t2 = new JTextField(30),
		t3 = new JTextField(30);
	private String s = "";
	private UpperCaseDocument ucd = new UpperCaseDocument();
	public Q_790_13() {
		t1.setDocument( ucd );
		ucd.addDocumentListener( new T1() );
		b1.addActionListener( new B1() );
		b2.addActionListener( new B2() );
		t1.addActionListener( new T1A() );
		setLayout( new FlowLayout() );
		add( b1 );
		add( b2 );
		add( t1 );
		add( t2 );
		add( t3 );
	}
	
	class T1 implements DocumentListener {
		public void changedUpdate( DocumentEvent e ) {}
		public void insertUpdate( DocumentEvent e ) {
			t2.setText( t1.getText() );  // 对文档插入操作时设置t2的文本为t1
			t3.setText( "Text : " + t1.getText().toUpperCase() ); // t3文本为test : t1;
		}
		public void removeUpdate( DocumentEvent e ) {
			t2.setText( t1.getText() );
		}
	}
	
	class T1A implements ActionListener {
		private int count = 0;
		// 操作时调用
		public void actionPerformed( ActionEvent e ) {
			t3.setText( "t1 action event " + count++ );
		}
	}
	
	class B1 implements ActionListener {
		public void actionPerformed( ActionEvent e )  {
			if( t1.getSelectedText() == null )
				s = t1.getText();
			else
				s = t1.getSelectedText();
			t1.setEditable( true );
		}
	}
	
	class B2 implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			ucd.setUpperCase( false );
			t1.setText( "Inserted by Button 2 : " + s );
			ucd.setUpperCase( true );
			t1.setEditable( false );
		}
	}
	
	public static void main( String[] args ) {
		run( new Q_790_13(), 375, 200 );
	}
	
	class UpperCaseDocument extends PlainDocument {
		private boolean upperCase = false;
		public void setUpperCase( boolean flag ) {
			upperCase = flag;
		}
		public void insertString( int offset, String str, AttributeSet attSet ) 
				throws BadLocationException {
			super.insertString( offset, str, attSet );
		}
	}
}
