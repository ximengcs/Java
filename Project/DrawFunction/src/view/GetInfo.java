package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import dao.ExpressionDao;
import installer.BottomContainer;
import installer.Main;

public class GetInfo extends JButton {

	private Info info;
	private ExpressionDao dao;
	private Main main;
	
	public GetInfo( Info info, ExpressionDao dao, Main main ) {
		this.info = info;
		this.dao = dao;
		this.main = main;
		setText("变");
		setBounds(700, 0, 100, 30);
		addMouseListener(new Click());
	}
	
	class Click implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			dao.setInfo(info.getText());
			dao.run();
			main.repaint();
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
