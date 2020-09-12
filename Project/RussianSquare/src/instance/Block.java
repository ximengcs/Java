package instance;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import install.Data;

/**
 * 方块类
 */
public class Block {

	private Point[][] point = new Point[3][3];
	
	public Block( Point[][] point ) {
		this.point = point;
	}
	
	private void show() {
		
		for( int i = 0; i < 3; i++ )
			for( int j = 0; j < 3; j++ )
				System.out.println( point[i][j] );
	}
	
	// 下降
	public void drop() {
		//System.out.println( "方块正在下降" );
		for( Point[] i : point )
			for( Point j : i )
				if( !j.equals( Point.NUL ) )
					j.setPoint( j.getX(), j.getY()+1 );
		//show();
	}
	
	// 移动
	public void move( int key, Data data ) {
		//System.out.println( "方块正在移动" );
		
		int max = 0, min = 20;
		
		for( Point[] i : point )
			for( Point j : i )
				if( !j.equals( Point.NUL ) ) {
					if( j.getX() < min )
						min = j.getX();
					if( j.getX() > max )
						max = j.getX();
				}

		if( key == KeyEvent.VK_A ) {
			
			if( min-1 < 0 )
				return;
			for( Point[] i : point )
				for( Point j : i )
					if( !j.equals( Point.NUL ) ) {
						HashMap<Point, Boolean> list = data.getList();

						Point tmp = new Point( j.getX()-1, j.getY() );
						
						for( Map.Entry<Point, Boolean> entry : list.entrySet() ) 
							if( entry.getValue() ) {
								if( tmp.equals( entry.getKey() ) )
									return;
							}
					}
			
			for( Point[] i : point )
				for( Point j : i )
					if( !j.equals( Point.NUL ) )
						j.setPoint( j.getX()-1, j.getY() );
			
		} else if( key == KeyEvent.VK_D ) {
			if( max+1 > 9 )
				return;
			for( Point[] i : point )
				for( Point j : i )
					if( !j.equals( Point.NUL ) ) {
						HashMap<Point, Boolean> list = data.getList();
						
						Point tmp = new Point( j.getX()+1, j.getY() );
						
						for( Map.Entry<Point, Boolean> entry : list.entrySet() ) 
							if( entry.getValue() ) {
								if( tmp.equals( entry.getKey() ) )
									return;
							}
					}
			
			for( Point[] i : point )
				for( Point j : i )
					if( !j.equals( Point.NUL ) )
						j.setPoint( j.getX()+1, j.getY() );
		} else if( key == KeyEvent.VK_J ) {
			
			// 判断是否可以操作
			// 是否超出边界
			if( point[1][1].getY() < 1 && point[1][1].getY() > 18 && point[1][1].getX() < 1 && point[1][1].getX() > 18 )
				return;
			// 是否有其他方块
			HashMap<Point, Boolean> list = data.getList();
			for( Point[] i : point )
				for( Point j : i ) {
					if( !j.equals( Point.NUL ) )
						if( j.getY() < 0 ) {
							//System.out.println( j.getY() );
							return;
						}
						/*if( list.get( j ) )
								return;*/
					for( Map.Entry<Point, Boolean> entry : list.entrySet() )
						if( entry.getValue() )
							if( entry.getKey().equals( j ) )
								return;
				}
			
			Point[][] tmp = new Point[3][3];
			
			for( int i = 0; i < 3; i++ )
				for( int j = 0; j < 3; j++ )
					tmp[i][j] = new Point( -1, -1 );
			
			if( !point[0][0].equals( Point.NUL ) )
				tmp[0][2].setPoint( point[0][0].getX()+2, point[0][0].getY() );
			if( !point[0][1].equals( Point.NUL ) )
				tmp[1][2].setPoint( point[0][1].getX()+1, point[0][1].getY()+1 );
			if( !point[0][2].equals( Point.NUL ) )
				tmp[2][2].setPoint( point[0][2].getX(), point[0][2].getY()+2 );
			if( !point[1][0].equals( Point.NUL ) )
				tmp[0][1].setPoint( point[1][0].getX()+1, point[1][0].getY()-1 );
			if( !point[1][1].equals( Point.NUL ) )
				tmp[1][1].setPoint( point[1][1].getX(), point[1][1].getY() );
			if( !point[1][2].equals( Point.NUL ) )
				tmp[2][1].setPoint( point[1][2].getX()-1, point[1][2].getY()+1 );
			if( !point[2][0].equals( Point.NUL ) )
				tmp[0][0].setPoint( point[2][0].getX(), point[2][0].getY()-2 );
			if( !point[2][1].equals( Point.NUL ) )
				tmp[1][0].setPoint( point[2][1].getX()-1, point[2][1].getY()-1 );
			if( !point[2][2].equals( Point.NUL ) )
				tmp[2][0].setPoint( point[2][2].getX()-2, point[2][2].getY() );
			
			point = tmp;

		}
	}
	
	// 画出自己
	public void drawMe() {
		System.out.println( "方块正在画出自己" );
		
	}
	
	public Point[][] getPoint() {
		return point;
	}
	
	// 改变自己
	public void changeMe( Point[][] point ) {
		this.point = point;
	}
}
