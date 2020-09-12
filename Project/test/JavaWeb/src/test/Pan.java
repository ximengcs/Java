package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import test.image.Move;

public class Pan extends JPanel {
	Move move = null;
	
	public Pan( Move move ) {
		this.move = move;
		setSize( 200, 100 );
		setBorder(new LineBorder(Color.red));
	}
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage( move.getBg(), 0, 0, 400, 200, move.getCurrentX(), 0, move.getCurrentX()+400, 200, null );
	}
}
