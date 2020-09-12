package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Q_802_20 extends JFrame {

	private JMenuBar bar = new JMenuBar();
	private JMenu[] menus = {
			new JMenu( "o" ),
			new JMenu( "t" ),
			new JMenu( "th" ),
	};
	private String fileName = "F:\\EclipseJava\\ThinkingInJava\\src\\testfiles\\data.txt";
	public Q_802_20() {
		int count = 1;
		BufferedReader read;
		try {
			read = new BufferedReader( 
					new InputStreamReader( new FileInputStream( fileName ) ) );
			
			while( read.ready() ) {
				menus[ count%3 ].add( new JMenuItem( String.valueOf(((char)read.read())) ) );
				System.out.println( read.read() );
				count++;
			}
			
			read.close();
		} catch( IOException e ) {
			System.out.println( "error" );
		}
		
		bar.add( menus[0] );
		bar.add( menus[1] );
		bar.add( menus[2] );
		setLayout( new FlowLayout() );
		setJMenuBar( bar );
	}
	
	public static void main( String[] args ) {
		run( new Q_802_20(), 300, 300 );
	}
}
