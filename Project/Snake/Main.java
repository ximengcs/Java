package snake;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Paint extends JPanel {
	
	private Map map;
	private Snake snake;
	private Food food;
	private Paint paint;
	public int SquareHeight;
	public int SquareWidth;
	public int height;
	public int width;
	private boolean flag = true;
	private Direction direction = Direction.RIGHT;
	
	private ImageIcon foodIcon = new ImageIcon( "F:\\EclipseJava\\MyProject\\src\\snake\\apple.jpg" );
	private ImageIcon headIcon = 
			new ImageIcon( "F:\\EclipseJava\\MyProject\\src\\snake\\snakeHead.jpg" );
	private ImageIcon bodyIcon =
			new ImageIcon( "F:\\EclipseJava\\MyProject\\src\\snake\\snakeBody.jpg" );
	private ImageIcon wallIcon =
			new ImageIcon( "F:\\EclipseJava\\MyProject\\src\\snake\\wall.jpg" );
	
	Paint() {
		setBackground( Color.WHITE );
		height = 30;
		width = 30;
		map = new Map( height, width );
		snake = Snake.newInstance();
		food = new Food();
		food.reset( map.getWall().wallPositionList(), map.getWidth(), map.getHeight() );
		SquareHeight = 20;
		SquareWidth = 20;
	}
	
	private void draw( Graphics g, Position position, ImageIcon icon ) {
		g.drawImage( icon.getImage(), position.getX()*SquareHeight, position.getY()*SquareWidth,
				SquareHeight, SquareWidth, this );
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		
		Iterator<Position> it = map.getWall().wallPositionList().iterator();
		while( it.hasNext() ) {
			draw( g, it.next(), wallIcon ); 
		}
		
		it = snake.getPosition().iterator();
		draw( g, it.next(), headIcon );
		
		while( it.hasNext() ) {
			draw( g, it.next(), bodyIcon );
		}
		
		draw( g, food.getPosition(), foodIcon );
		
	}
	
	public void reset() {
		repaint();
	}
	
	public void run() {
		while( flag ) {
			try {
				TimeUnit.MILLISECONDS.sleep( 100 );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			State state = snake.move( direction, food, map );
			if( state == State.DEATH )
				break;
			else if( state == State.EAT )
				food.reset( snake.getPosition(), height, width );
			reset();
		}
	}
	
	public void setDirection( Direction direction ) {
		this.direction = direction;
	}
}

public class Main extends JFrame {

	private JPanel panel;
	private Paint pa;
	private JButton start;
	private JButton reset;
	private JLabel state;
	
	public Main() {
		
		panel = new JPanel();
		start = new JButton( "开始游戏" );
		reset = new JButton( "重新开始" );
		state = new JLabel( new ImageIcon( "F:\\EclipseJava\\MyProject\\src\\snake\\gaming.jpg" ) );
		panel.setLayout( new FlowLayout() );
		panel.add( start );
		panel.add( reset );
		panel.add( state );
		//add( panel, BorderLayout.NORTH );
		
		pa = new Paint();
		add( pa );
		addKeyListener( new KeyListener() {

			@Override
			public void keyTyped( KeyEvent e ) {
				
			}

			@Override
			public void keyPressed( KeyEvent e ) {
				if( e.getKeyCode() == KeyEvent.VK_W )
					pa.setDirection( Direction.UP );
				else if( e.getKeyCode() == KeyEvent.VK_S )
					pa.setDirection( Direction.DOWN );
				else if( e.getKeyCode() == KeyEvent.VK_A )
					pa.setDirection( Direction.LEFT );
				else if( e.getKeyCode() == KeyEvent.VK_D )
					pa.setDirection( Direction.RIGHT );
			}

			@Override
			public void keyReleased( KeyEvent e ) {
			}
			
		} );
	}
	
	public static void main( String[] args ) {
		Main ma = new Main();
		run( ma, (ma.pa.SquareWidth+1)*(ma.pa.width), (ma.pa.SquareHeight+2)*(ma.pa.height) );
		ma.pa.run();
	}
	
	public static void run( final JFrame f, final int width, final int height ) {
		f.setTitle( f.getClass().getSimpleName() );
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(width, height);
		f.setVisible(true);
	}
}
