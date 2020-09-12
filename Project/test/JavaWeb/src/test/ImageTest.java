package test;

import java.awt.GridLayout;
import javax.swing.JFrame;
import test.image.Move;
import test.image.MoveDriver;

public class ImageTest extends JFrame {

	Pan pan;
	Move move;
	public ImageTest() {
		move = new Move();
		pan = new Pan( move );
		add( pan );
		setLayout( new GridLayout() );
		setSize( 400, 400 );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ImageTest test = new ImageTest();
		new MoveDriver( test.pan, test.move ).run();
		//test.dispose();
	}
}

