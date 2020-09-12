package install;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import control.Size;
import instance.Block;
import instance.Point;
/**
 * 数据类
 */
public class Data {

	/**
	 * 容器
	 */
	private HashMap<Point, Boolean> list = new HashMap<Point, Boolean>( Size.WIDTH * Size.HEIGHT );
	
	/**
	 * 得分
	 */
	private int credit = 0;
	
	/**
	 * 速度
	 */
	private int speed = 0;
	/**
	 * 方块
	 */
	private Block block;
	
	public Data( Block block ) {
		this.block = block;
		init();
	}
	
	private void init() {
		for( int i = 0; i < 20; i++ )
			for( int j = 0; j < 10; j++ )
				list.put( new Point( j, i ), false );
	}
	
	/**
	 * 判断方块是否落地
	 */
	public boolean isDrop() {
		if( credit == 50 )
			speed = 50;
		else if( credit == 100 )
			speed = 100;
		
		Point[][] tmp = block.getPoint();
		
		Point t = new Point( 0, 0 );
		
		int max = 0;
		
		for( int i = 0; i < 3; i++ )
			for( int j = 0; j < 3; j++ ) {
				if( !tmp[i][j].equals( Point.NUL ) ) {
					//System.out.println( tmp[i][j] );
					t.setPoint( tmp[i][j].getX(), tmp[i][j].getY()+1 );
					if( t.getX() >= 0 && t.getX() < 10 && t.getY() >= 0 && t.getY() < 20 )
						if( list.get(t) )
							return true;
					if( tmp[i][j].getY() > max )
						max = tmp[i][j].getY();
				}
			}
		
		if( max == 19 )
			return true;
		
		return false;
	}
	
	public void addBlock() {
		Point[][] tmp = block.getPoint();
		for( Point[] i : tmp )
			for( Point j : i ) {
				if( !j.equals( Point.NUL ) )
					list.put( j, true );
			}
				
	}
	
	public HashMap<Point, Boolean> getList() {
		return list;
	}
	
	public boolean breakBlock() {
		
		// 可以消行的行
		ArrayList<Integer> breakList = new ArrayList<Integer>();
		
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		
		for( Map.Entry<Point, Boolean> entry : list.entrySet() ) {
			if( !entry.getValue() )
				continue;
			
			Integer t = new Integer(entry.getKey().getY());
			
			maps.put( t, maps.get( t ) == null ? 1 : maps.get( t )+1 );
		}
		
		for( Map.Entry<Integer, Integer> ma : maps.entrySet() )
			if( ma.getValue() == 10 )
				breakList.add( ma.getKey() );
		
		if( breakList.size() == 0 )
			return false;
		
		if( breakList.size() == 1 ) {
			credit++;
		} else {
			credit += Math.pow( 2, breakList.size() );
		}
		
		// 消行
		for( int i : breakList ) {
			Point tmp = new Point( 0, i );
			for( int j = 0; j < 10; j++ ) {
				tmp.setPoint( j, i );
				list.put( tmp, false );
			}
		}
		
		// 整体向下
		
		Iterator<Integer> it = breakList.iterator();
		
		while( it.hasNext() ) {
			int temp = it.next();
			for( Map.Entry<Point, Boolean> entry : list.entrySet() ) {
				if( entry.getValue() )
					if( entry.getKey().getY() < temp ) {
						list.put( entry.getKey(), false );
						Point poi = new Point( entry.getKey().getX(), entry.getKey().getY()+1 );
						list.put( poi, true );
					}
			}
		}
		
		return true;
	}
	
	public int getCredit() {
		return credit;
	}
	
	public int getSpeed() {
		return speed;
	}
}
