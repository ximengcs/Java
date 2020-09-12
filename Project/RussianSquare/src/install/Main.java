package install;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import control.Controller;
import draw.DataPanel;
import draw.ShowPanel;
import instance.Block;
import instance.BlockDriver;

/**
 * 组装
 */
public class Main extends JFrame {

	/*
	 * 有两个界面
	 */
	// 界面1
	private ShowPanel showPanel;
	// 界面2
	private DataPanel dataPanel;
	
	public static Image blockImage = new ImageIcon( "F:\\EclipseJava\\RussianSquare\\src\\install\\block.png" ).getImage();
	
	public Main() {
		setLayout( null );
		setSize( ShowPanel.WIDTH+DataPanel.WIDTH + 14, ShowPanel.HEIGHT + 14+29 );
		setLocationRelativeTo( null );// 如果参数为null，则在中央显示
		setVisible( true );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	public void run() {
		
		// 方块
		Block block = new Block(null);
	
		// 数据
		Data data = new Data( block );
		
		// 初始化界面1
		showPanel = new ShowPanel( block, data );
		// 初始化界面2
		dataPanel = new DataPanel( data );
		
		BlockDriver driver = new BlockDriver( block, data, showPanel, dataPanel );
		
		/*Thread driverThread = new Thread( driver );
		
		driverThread.start();*/

		addKeyListener( new Controller(showPanel, block, data) );
		
		add( showPanel );
		add( dataPanel );
		
		validate();
		
		driver.run();
		
	}
	
	public static void main( String[] args ) {
		// 初始化主窗口
		Main mainer = new Main();
		// 运行
		mainer.run();
	}
}
