package pullboxes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class Paint extends JPanel {
	
	private String fileName = "F:\\EclipseJava\\MyProject\\src\\pullboxes\\";
	private ImageIcon wall = new ImageIcon( fileName + "wall.jpg" );
	private ImageIcon person = new ImageIcon( fileName + "person.png" );
	private ImageIcon box = new ImageIcon( fileName + "box.jpg" );
	private ImageIcon dest = new ImageIcon( fileName + "dest.jpg" );
	private ImageIcon flag = new ImageIcon( fileName + "flag.jpg" );
	private ImageIcon finish = new ImageIcon( fileName + "finish.jpg" );
	private ImageIcon gameOver = new ImageIcon( fileName + "gameOver.jpg" );
	private ImageIcon floor = new ImageIcon( fileName + "floor.jpg" );
	
	private boolean finishIcon = false; 
	private int height = 40;
	private int width = 40;
	private Map map = new Map();
	@Override
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		
		g.setColor( Color.WHITE );
		for( int i = 0; i < 20; i++ )
			for( int j = 0; j < 20; j++ )
				g.fillRect( i*height, j*width, height, width );
		
		boolean flag = false;
		Position tmp;
		
		Iterator<Floor> fl = map.getFloor().iterator();
		while( fl.hasNext() ) {
			tmp = fl.next().getPosition();
			draw( tmp, g, this.floor );
		}
		
		Iterator<Wall> it = map.getWall().iterator();
		while( it.hasNext() ) {
			tmp = it.next().getPosition();
			draw( tmp, g, wall );
		}

		Iterator<Destination> it3 = map.getDestination().iterator();
		while( it3.hasNext() ) {
			tmp = it3.next().getPosition();
			if( tmp.equals( map.getPerson().getPosition() ) )
				flag = true;
			draw( tmp, g, dest );
		}
		
		Iterator<Box> it2 = map.getBox().iterator();
		while( it2.hasNext() ) {
			it3 = map.getDestination().iterator();
			tmp = it2.next().getPosition();
			draw( tmp, g, box );
			while( it3.hasNext() )
				if( tmp.equals( it3.next().getPosition() ) )
					draw( tmp, g, finish );
		}
		
		tmp = map.getPerson().getPosition();
		if( flag )
			draw( tmp, g, this.flag );
		else
			draw( tmp, g, person );
		
		if( finishIcon ) {
			finishIcon = false;
			//g.drawImage( gameOver.getImage(), 
		}
	}
	
	public Map getMap() {
		return map;
	}
	
	public void drawFinish() {
		finishIcon = true;
	}
	
	public void repeat() {
		repaint();
	}
	
	private void draw( Position position, Graphics g, ImageIcon icon ) {
		g.drawImage( 
				icon.getImage(), position.getX()*height, position.getY()*width, height, width, this );
	}
}

public class Main extends JFrame {

	private String fileName = "F:\\EclipseJava\\MyProject\\src\\pullboxes\\";
	private ImageIcon next = new ImageIcon( fileName + "next.jpg" );
	private ImageIcon privious = new ImageIcon( fileName + "privious.jpg" );
	private ImageIcon one = new ImageIcon( fileName + "one.jpg" );
	private Paint pa;
	private JPanel panel = new JPanel();
	private JButton jb1 = new JButton( privious );
	private JButton jb2 = new JButton( next );
	private JLabel jl = new JLabel( "第1关" );
	
	public Main() {
		panel.setLayout( new FlowLayout() );
		
		jb1.setPreferredSize( new Dimension( next.getIconHeight(), next.getIconWidth() ) );
		jb2.setPreferredSize( new Dimension( next.getIconHeight(), next.getIconWidth() ) );
		
		panel.add( jb1 );
		panel.add( jl );
		panel.add( jb2 );
		
		add( panel, BorderLayout.NORTH );
		
		pa = new Paint();
		add( pa );
		
		jl.setFont( new Font( "Consoles", Font.BOLD, 30 ) );
		
		jb1.setEnabled( false );
		jb1.addKeyListener( new MyKeyListener() );
		jb2.addKeyListener( new MyKeyListener() );
		jb1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed( ActionEvent e ) {
				pa.getMap().previous();
				runNext();
				setLabel( pa.getMap().current() );
				pa.repeat();
			}
		} );
		jb2.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {
				pa.getMap().next();
				runNext();
				setLabel( pa.getMap().current() );
				pa.repeat();
			}
			
		} );
	}
	
	private void setLabel( int count ) {
		jl.setText( "第" + count + "关" );
	}
	
	private void runNext() {
		if( pa.getMap().hasPrevious() )
			jb1.setEnabled( true );
		else
			jb1.setEnabled( false );
		if( pa.getMap().hasNext() )
			jb2.setEnabled( true );
		else
			jb2.setEnabled( false );
	}
	
	private class MyKeyListener implements KeyListener {

		@Override
		public void keyTyped( KeyEvent e ) {
		}
		
		@Override
		public void keyPressed( KeyEvent e ) {
			Direction d;
			Map m = pa.getMap();
			if( e.getKeyCode() == KeyEvent.VK_W ) {
				d = Direction.UP;
				m.getPerson().setDirection( d );
			} else if( e.getKeyCode() == KeyEvent.VK_S ) {
				d = Direction.DOWN;
				m.getPerson().setDirection( d );
			} else if( e.getKeyCode() == KeyEvent.VK_A ) {
				d = Direction.LEFT;
				m.getPerson().setDirection( d );
			} else if( e.getKeyCode() == KeyEvent.VK_D ) {
				d = Direction.RIGHT;
				m.getPerson().setDirection( d );
			}
			m.run();
			pa.repeat();

			if( pa.getMap().checkGame() ) {
				runNext();
				pa.getMap().next();
				setLabel( pa.getMap().current() );
			}
		}

		@Override
		public void keyReleased( KeyEvent e ) {
		}
		
	}
	
	public static void main( String[] args ) {
		Main ma = new Main();
		run( ma, 850, 950 );
		ma.requestFocus();
	}
	
	public static void run( final JFrame f, final int width, final int height ) {
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				f.setTitle( f.getClass().getSimpleName() );
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(width, height);
				f.setVisible(true);
			}
		} );
	}
}
