package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import control.Size;
import install.Data;
import install.Main;
import instance.Block;
import instance.Point;

/**
 * 显示面板
 */
public class ShowPanel extends JPanel {

	/**
	 * 界面1大小
	 */
	public static final int WIDTH = Size.WIDTH*Size.IMAGEWIDTH;
	public static final int HEIGHT = Size.HEIGHT*Size.IMAGEHEIGHT;
	
	private Block block;
	private Data data;
	
	public ShowPanel( Block block, Data data ) {
		this.block = block;
		this.data = data;
		setSize( WIDTH, HEIGHT );
	}
	
	@Override
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		g.setColor( Color.BLACK );
		g.fillRect( 0, 0, WIDTH, HEIGHT );
		g.setColor( Color.WHITE );
		
		Point[][] tmp = block.getPoint();
		
		for( int i = 0; i < 3; i++ )
			for( int j = 0; j < 3; j++ )
				if( !tmp[i][j].equals( Point.NUL ) )
					g.drawImage( Main.blockImage, tmp[i][j].getX()*Size.IMAGEWIDTH, tmp[i][j].getY()*Size.IMAGEHEIGHT, Size.IMAGEWIDTH, Size.IMAGEHEIGHT, this ); 
		
		HashMap<Point, Boolean> map = data.getList();
		
		for( Map.Entry<Point, Boolean> en : map.entrySet() )
			if( en.getValue() ) {
				g.drawImage( Main.blockImage, en.getKey().getX()*Size.IMAGEWIDTH, en.getKey().getY()*Size.IMAGEHEIGHT, Size.IMAGEWIDTH, Size.IMAGEHEIGHT, this );
			}
	}
}
