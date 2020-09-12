package instance;

import draw.DataPanel;
import draw.ShowPanel;
import install.Data;

public class BlockDriver implements Runnable {

	/**
	 * 方块
	 */
	private Block block;
	/**
	 * 数据
	 */
	private Data data;
	
	private ShowPanel showPanel;
	// 界面2
	private DataPanel dataPanel;
	
	
	public BlockDriver( Block block, Data data, ShowPanel showPanel, DataPanel dataPanel ) {
		this.block = block;
		this.data = data;
		this.showPanel = showPanel;
		this.dataPanel = dataPanel;
	}
	
	public static Point[][] nextPoint = Point.randomPoint();
	/**
	 * 驱动block
	 */
	public void run() {
		showPanel.repaint();
		dataPanel.repaint();
		
		while(true) {

			//System.out.println( "生成下一个方块,等待落地" );
			block.changeMe( nextPoint );
			boolean flag = false;
			while( !data.isDrop() ) {
				try {
					Thread.sleep(700 + (data.getSpeed()/50 * 300) * -1 );
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if( !flag )
					if( block.getPoint()[1][1].getY() > 0 ) {
						nextPoint = Point.randomPoint();
						flag = true;
					}
				
				block.drop();
				showPanel.repaint();
				dataPanel.repaint();
			}
			// 增加方块 
			data.addBlock();
			//System.out.println( "增加方块 " );

			// 判断消行
			//System.out.println( "判断消行" );
			data.breakBlock();
			
			showPanel.repaint();
			dataPanel.repaint();
		}
	}
	
	public Point[][] getNextPoint() {
		return nextPoint;
	}
}
