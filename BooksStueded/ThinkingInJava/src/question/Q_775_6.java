package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Q_775_6 extends JFrame {

	private JButton button = new JButton( "regex" );
	private JTextArea ja1 = new JTextArea( 5, 26 );
	private JTextArea ja2 = new JTextArea( 5, 26 );
	private JTextField jt = new JTextField( 26 );
	
	private Matcher matcher;
	private Pattern pattern;
	
	public Q_775_6() {
		button.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				pattern = Pattern.compile( jt.getText() );
				matcher = pattern.matcher( ja1.getText() );
				ArrayList<String> result = new ArrayList<String>();
				while( matcher.find() ) 
					result.add( matcher.group() );
				if( result.isEmpty() )
					ja2.setText( "无匹配" );
				else
					ja2.setText( result.toString() );
			}
		} );
		setLayout( new FlowLayout() );
		add( new JScrollPane(ja1) );
		add( jt );
		add( new JScrollPane(ja2) );
		add( button );
	}
	
	public static void main( String[] args ) {
		
		run( new Q_775_6(), 300, 400 );
		
		/*if (args.length < 2) {
			System.out.println( "Usage:\njava TestRegularExpression " + "characterSequence regularExpression+" );
			System.exit( 0 );
		}
		System.out.println( "Input: \"" + args[0] + "\"" );
		for (String arg : args) {
			System.out.println( "Regular expression: \"" + arg + "\"" );
			Pattern p = Pattern.compile( arg );
			Matcher m = p.matcher( args[0] );
			while (m.find()) {
				System.out.println( "Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1) );
			}
		}*/
		
		
	}
}
