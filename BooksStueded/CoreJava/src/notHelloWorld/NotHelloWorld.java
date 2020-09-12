package notHelloWorld;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class NotHelloWorld {

	public static void main( String[] args ) {
		EventQueue.invokeLater( () ->
		{
			JFrame frame = new NotHelloWorldFrame();
			frame.setTitle( "NotHelloWorld" );
			frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			frame.setVisible( true );
		}
		);
	}
}

/**
 * helloworld框架
 */
class NotHelloWorldFrame extends JFrame {
	public NotHelloWorldFrame() {
		add( new NotHelloWorldComponent() );
		pack();
	}
}

/**
 * helloworld画板
 */
class NotHelloWorldComponent extends JComponent {
	public static final int MESSAGE_X = 75; //文字x坐标
	public static final int MESSAGE_Y = 100;//文字y坐标
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	/* 绘制面板
	 */
	public void paintComponent( Graphics g ) {
		g.drawString( "Not a Hello, World program", MESSAGE_X, MESSAGE_Y );
	}
	/*返回该面板的大小
	 */
	@Override
	public Dimension getPreferredSize() {
		return new Dimension( DEFAULT_WIDTH, DEFAULT_HEIGHT );
	}
}