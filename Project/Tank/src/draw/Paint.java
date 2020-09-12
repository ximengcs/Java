package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import data.Data;
import data.Position;
import data.Run;
import data.Square;
import state.Direction;
import state.Floor;

public class Paint extends JPanel {

	Run run = new Run();
	// 数据
	private Data data;
	
	// 图片表
	private Image[] images;
	
	private Image[] tanks;
	
	JButton jb = new JButton( "123" );
	
	public Paint() {
		
		
		
		setLayout( null );
		
		add(jb);
		
		jb.setBounds( 100, 100, 20, 30 );
		jb.addKeyListener( new Action() );
		
		setBorder( new LineBorder( Color.BLUE ) );
		
		images = new Image[10];
		for( int i = 0; i < 5; i++ )
			images[i] = new ImageIcon( "F:\\EclipseJava\\Tank\\src\\images\\" + i + ".png" 			).getImage();
		
		tanks = new Image[2];
		tanks[0] = new ImageIcon( "F:\\EclipseJava\\Tank\\src\\images\\mun.png" 			).getImage(); 
		tanks[1] = new ImageIcon( "F:\\EclipseJava\\Tank\\src\\images\\meUp.png" 			).getImage(); 
		
		addKeyListener( new Action() );
	}
	
	
	class Action implements KeyListener {

		@Override
		public void keyTyped( KeyEvent e ) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void keyPressed( KeyEvent e ) {
			Position start;
			if( e.getKeyCode() == KeyEvent.VK_W ) {
				dir = Direction.UP;
				start = run.move( Direction.UP );
			} else if( e.getKeyCode() == KeyEvent.VK_S ) {
				dir = Direction.DOWN;
				start = run.move( Direction.DOWN );
			} else if( e.getKeyCode() == KeyEvent.VK_A ) {
				dir = Direction.LEFT;
				start = run.move( Direction.LEFT );
			} else if( e.getKeyCode() == KeyEvent.VK_D ) {
				dir = Direction.RIGHT;
				start = run.move( Direction.RIGHT );
			} else {
				start = null;
			}
			repaint( start );
		}

		@Override
		public void keyReleased( KeyEvent e ) {
			// TODO 自动生成的方法存根
			
		}
	}

	
	// 重绘,要重绘，调用该方法
	public void repaint( Position start ) {
		
		if( start == null )
			return;

		//startPosition = start;
		
		repaint();
	}
	
	@Override
	public void paintComponent( Graphics g ) {
		
		super.paintComponent(g);
		
		// 获取当前数据,根据数据绘图
		data = Data.getData();
		
		drawFloor( g );
		drawTank( g );
	}
	
	private Position startPosition;
	private Direction dir;
	private void drawTank( Graphics g ) {
		if( startPosition == null ) {
		// 己
		g.drawImage( tanks[1], (data.getFriend().getPosition().getX()-1)*50, (data.getFriend().getPosition().getY()-1)*50, 50, 50, this );
		
		//敌
		for( int i = 0; i < 3 && i < data.getEnemy().size(); i++ )
			g.drawImage( tanks[1], (data.getEnemy().get(i).getPosition().getX()-1)*50, (data.getEnemy().get(i).getPosition().getY()-1)*50, 50, 50, this );
		
		// mum
		g.drawImage( tanks[0], (data.getMum().getX()-1)*50, (data.getMum().getY()-1)*50, 50, 50, this );
		} /*else {
			int dis = 10;
			
			// 己
			if( dir == Direction.UP ) {
				
				for( int i = 1; i <= 5; i++ ) {
					
				}
				g.drawImage( tanks[1], (data.getFriend().getPosition().getX()-1)*50, (data.getFriend().getPosition().getY()-1)*50, 50, 50, this );
			} else if( dir == Direction.DOWN ) {
				
			} else if( dir == Direction.LEFT ) {
				
			} else if( dir == Direction.RIGHT ) {
				
			}
		}*/
		startPosition = null;
	}
	
	private void drawFloor( Graphics g ) {
		
		// 获取地形坐标
		Map<Floor, ArrayList<Square>> map = data.getFloor();
		for( Map.Entry<Floor, ArrayList<Square>> entry : map.entrySet() ) {
			
			ArrayList<Square> tmp = entry.getValue();
			if( entry.getKey() == Floor.ORDINARY ) {
				for( Square square : tmp )
					g.drawImage( images[0], (square.getPosition().getX()-1)*50, (square.getPosition().getY()-1)*50, 50, 50, this );
			} else if( entry.getKey() == Floor.WALL ) {
				for( Square square : tmp )
					g.drawImage( images[1], (square.getPosition().getX()-1)*50, (square.getPosition().getY()-1)*50, 50, 50, this );
			} else if( entry.getKey() == Floor.GRASS ) {
				for( Square square : tmp )
					g.drawImage( images[2], (square.getPosition().getX()-1)*50, (square.getPosition().getY()-1)*50, 50, 50, this );
			} else if( entry.getKey() == Floor.WATER ) {
				for( Square square : tmp )
					g.drawImage( images[3], (square.getPosition().getX()-1)*50, (square.getPosition().getY()-1)*50, 50, 50, this );
			} else if( entry.getKey() == Floor.ICE ) {
				for( Square square : tmp )
					g.drawImage( images[4], (square.getPosition().getX()-1)*50, (square.getPosition().getY()-1)*50, 50, 50, this );
			} else if( entry.getKey() == Floor.HARD ) {
				for( Square square : tmp )
					g.drawImage( images[4], (square.getPosition().getX()-1)*50, (square.getPosition().getY()-1)*50, 50, 50, this );
			}
		}
	}
	
}
