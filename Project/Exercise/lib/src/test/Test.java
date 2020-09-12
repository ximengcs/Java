package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class My extends JPanel {
	
	public My() {
		setSize( 200, 200 );
	}
	
	public void myPaint() {
		Graphics g = getGraphics();
		super.paintComponent( g );
		
		g.setColor( Color.RED );
		
		g.fillRect( 100, 100, 100, 100 );
		
		paint( g );
	}
}

public class Test extends JFrame {

	My m = new My();
	
	public Test() {

		setSize( 300, 300 );
		setLocationRelativeTo( null );
		setVisible( true );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		add( m );
	}
	
	public static void main( String[] args ) {
		Test t = new Test();
		t.m.myPaint();
	}
}
