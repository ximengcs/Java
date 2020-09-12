package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Esc implements KeyListener {

	private JFrame frame;
	
	public Esc( JFrame frame ) {
		this.frame = frame;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if( e.getKeyCode() == KeyEvent.VK_ESCAPE ) {
			frame.dispose();
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
