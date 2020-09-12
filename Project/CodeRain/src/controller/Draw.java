package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.Word;

public class Draw extends JPanel {

	List<Word> list = null;
	
	ImageIcon u;
	
	Image img;
	
	Font font;
	
	public void nextList() {
		Iterator<Word> it = list.iterator();
		while( it.hasNext() ) {
			it.next().next(Main.height);
		}
	}
	
	public void setList(List<Word> list) {
		this.list = list;
	}

	public Draw() {
		u = new ImageIcon( getClass().getResource( "/image/u.png" ) );
		img = u.getImage();
		
		font = new Font( "Tahoma",0,15 );
		
		setSize(Main.width, Main.height);
		setBackground(Color.BLACK);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage( img, 0, 0, this.getWidth(), this.getHeight(), this );
		
		g.setFont(font);
		
		Iterator<Word> it = list.iterator();
		
		while( it.hasNext() ) {
			printString( g, it.next() );
		}
		
	}
	
	private void printString( Graphics g, Word word ) {
		
		Font font = new Font( "华文行楷", Font.BOLD, 30 );
		g.setFont(font);
		g.setColor( word.getColor() );
		
		int i = word.getPoint().getY()+40;
		for( String t : word.getString().split("") ) {
			g.drawString( t, word.getPoint().getX(), i);
			i += 15;
		}
	}
}
