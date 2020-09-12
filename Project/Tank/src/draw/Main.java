package draw;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	// 画游戏界面
	private Paint paint;

	public Main() {


		setLayout( new GridLayout() );
		
		paint = new Paint();
		
		add(paint);
		
		// 设置默认关闭操作
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		// 设置窗口大小 Toolkit.getDefaultToolkit().getScreenSize()
		setBounds( 500, 100, 50*15+40, 50*15+40 );
		// 设置可见
		setVisible( true );
	}

	public static void main( String[] args ) throws InterruptedException {

		Main m = new Main();
		
		m.paint.run.run();
		
		//Thread.sleep(2000);
		//m.remove( m.tmp );

	   
	   // m.validate();   // 在修改组件时（添加或移除）应调用该方法
	    //m.repaint();   
	    //m.invalidate();  
	    //m.validate();
	}
}
