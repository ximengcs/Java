package draw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import control.Size;
import install.Data;
import install.Main;
import instance.BlockDriver;
import instance.Point;
/**
 * 数据面板
 */
public class DataPanel extends JPanel {

	/**
	 * 数据界面大小
	 */
	public static final int WIDTH = 200;
	public static final int HEIGHT = Size.HEIGHT*Size.IMAGEHEIGHT;
	
	private Data data;
	
	public DataPanel( Data data ) {
		this.data = data;
		setBounds( ShowPanel.WIDTH, 0, WIDTH, HEIGHT );
	}
	
	private Image bg = new ImageIcon( "F:\\EclipseJava\\RussianSquare\\src\\install\\data.png" ).getImage();
	
	@Override
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );

		g.drawImage( bg, 0, 0, WIDTH, HEIGHT, this );
		
		//g.setColor( Color.GRAY );
		g.setFont( new Font( "heiti", Font.BOLD, 30 ) );
		//g.fillRect( 0, 0, WIDTH, HEIGHT );
		
		//System.out.println( "显示下一个方块" );

		Point[][] tmp = BlockDriver.nextPoint;
		
		for( int i = 0; i < 3; i++ )
			for( int j = 0; j < 3; j++ )
				if( !tmp[i][j].equals( Point.NUL ) )
					g.drawImage( Main.blockImage, j*Size.IMAGEWIDTH+45, i*Size.IMAGEHEIGHT+110, Size.IMAGEWIDTH, Size.IMAGEHEIGHT, this ); 
		
		//System.out.println( "显示速度" );
		g.setColor( Color.RED );
		g.drawString( "" + data.getCredit() , 90, 500 );

		g.drawString( data.getSpeed() == 0 ? "慢" : data.getSpeed() == 50 ? "中" : "快", 80, 360 );
		//System.out.println( "显示得分" );
	}

}
