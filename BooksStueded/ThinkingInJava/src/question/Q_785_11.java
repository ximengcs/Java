package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Q_785_11 extends JButton {

	private Random rand = new Random();
	public Q_785_11() {
		addMouseListener( new MouseListener() {

			@Override
			public void mouseClicked( MouseEvent e ) {
				switch( rand.nextInt(10) ) {
					case 0 : setBackground( Color.RED );break;
					case 1 : setBackground( Color.GREEN );break;
					case 2 : setBackground( Color.BLACK );break;
					case 3 : setBackground( Color.GRAY );break;
					case 4 : setBackground( Color.PINK );break;
					case 5 : setBackground( Color.ORANGE );break;
					case 6 : setBackground( Color.BLUE );break;
					case 7 : setBackground( Color.YELLOW );break;
					case 8 : setBackground( Color.WHITE );break;
					case 9 : setBackground( Color.CYAN );break;
				}
			}

			@Override
			public void mousePressed( MouseEvent e ) {}

			@Override
			public void mouseReleased( MouseEvent e ) {}

			@Override
			public void mouseEntered( MouseEvent e ) {}

			@Override
			public void mouseExited( MouseEvent e ) {}
			
		} );
	}
	
	public static void main( String[] args ) {
		JFrame frame = new JFrame();
		frame.setLayout( new GridLayout() );
		frame.add( new Q_785_11() );
		run( frame, 300, 300 );
	}
}
