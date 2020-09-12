package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class ExitButton extends JButton {
	
	public Exit exit;
	
	public ExitButton() {
		setText("退出");
		setSize(100, 30);
		initField();
		addMouseListener(exit);
	}
	
	private void initField() {
		exit = new Exit();
	}
	
	class Exit implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.exit(0);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
}
