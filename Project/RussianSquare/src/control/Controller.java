package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import draw.ShowPanel;
import install.Data;
import instance.Block;
/**
 * 控制器
 */
public class Controller implements KeyListener {

	/**
	 * 控制方块
	 */
	private ShowPanel showPanel;
	private Block block;
	private Data data;
	
	public Controller( ShowPanel showPanel, Block block, Data data ) {
		this.showPanel = showPanel;
		this.block = block;
		this.data = data;
	}
	
	@Override
	public void keyTyped( KeyEvent e ) {
	}

	@Override
	public void keyPressed( KeyEvent e ) {
		//System.out.println( "按下按键" );
		block.move( e.getKeyCode(), data );
		showPanel.repaint();
	}

	@Override
	public void keyReleased( KeyEvent e ) {
	}

}
