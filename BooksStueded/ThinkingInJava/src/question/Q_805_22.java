package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class MyPanel extends JPanel {

	private Color color = new Color( 0x000000 );
	@Override
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		g.setColor( color );
		g.drawRect( 0, 0, getWidth(), getHeight() );
		g.fillRect( 0, 0, getWidth(), getHeight() );
	}
	public void setColor( Color color ) {
		this.color = color;
		repaint();
	}
}

public class Q_805_22 extends JFrame {

	private MyPanel panel = new MyPanel();
	private TextField txt = new TextField(10);
	private Color[] colors = new Color[3];
	private String[] string = new String[3];
	private JSlider slider = new JSlider( 0, 20 );
	
	public Q_805_22() {
		colors[0] = new Color( 0XFF0000 );
		colors[1] = new Color( 0X00FF00 );
		colors[2] = new Color( 0X0000FF );
		string[0] = new String( "RED" );
		string[1] = new String( "GREEN" );
		string[2] = new String( "BLUE" );
		slider.setPaintTicks( true ); 
		slider.setMajorTickSpacing( 10 );
		slider.addChangeListener( new ChangeListener() {
			public void stateChanged( ChangeEvent e ) {
				if( slider.getValue() == 0 ) {
					panel.setColor( colors[0] );
					txt.setText( string[0] );
				} else if( slider.getValue() == 10 ) {
					panel.setColor( colors[1] );
					txt.setText( string[1] );
				} else if( slider.getValue() == 20 ) {
					panel.setColor( colors[2] );
					txt.setText( string[2] );
				}
			}
		} );
		add( txt, BorderLayout.NORTH );
		add( panel, BorderLayout.CENTER );
		add( slider, BorderLayout.SOUTH );
	}
	
	public static void main( String[] args ) {
		run( new Q_805_22(), 500, 500 );
	}
}
