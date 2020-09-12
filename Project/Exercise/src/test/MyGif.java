package test;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Gif extends JPanel {
	
	Image gif = new ImageIcon( "F:\\EclipseJava\\Study\\src\\test\\1.gif" ).getImage();

	Gif() {
		setSize( 300, 300 );
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		g.drawImage( gif, 0, 0, 150, 150, this );
		//g.fillRect( 0, 0, 300, 300 );
	}
}

public class MyGif extends JFrame {

	MyGif() {
		setLayout( new GridLayout() );
		setSize( 300, 300 );
		setLocationRelativeTo( null );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setVisible( true );
		add( new Gif() );
	}

	public static void main( String[] args ) {
		new MyGif();
	}
}
