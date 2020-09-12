package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import state.Floor;
import state.Speed;
import state.TankType;

public class DataControl {

	private int count = 0;
	
	private int max = 1;
	
	public boolean hasNext() {
		return count < 1;
	}
	
	public void next() {
		count++;
	}
	
	public int current() {
		return count;
	}
	
	// 友
	public Tank getFriend() {
		
		Tank tank = new Tank();
		
		tank.setPosition( new Position( 6, 15 ) );
		
		tank.setBall( new Ball( Speed.MID, new Position( 0, 0 ) ) );
		
		tank.setSpeed( Speed.MID );
		
		tank.setType( TankType.ONE );
		
		tank.setFlag( true );
		
		return tank;
	}
	
	// 敌
	public ArrayList<Tank> getEnemy() {
		
		ArrayList<Tank> enemy = new ArrayList<Tank>();
		
		for( int i = 0; i < 20; i++ )
			if( i % 3 == 0 ) {
				Tank tank = new Tank();
				
				tank.setPosition( new Position( 1, 1 ) );
				
				tank.setBall( new Ball( Speed.MID, new Position( 0, 0 ) ) );
				
				tank.setSpeed( Speed.MID );
				
				tank.setType( TankType.TWO );
				
				tank.setFlag( false );
				
				enemy.add( tank );
			} else if( i % 3 == 1 ) {
				Tank tank = new Tank();
				
				tank.setPosition( new Position( 8, 1 ) );
				
				tank.setBall( new Ball( Speed.MID, new Position( 0, 0 ) ) );
				
				tank.setSpeed( Speed.MID );
				
				tank.setType( TankType.THREE );
				
				tank.setFlag( false );
				
				enemy.add( tank );
			} else {
				Tank tank = new Tank();
				
				tank.setPosition( new Position( 15, 1 ) );
				
				tank.setBall( new Ball( Speed.MID, new Position( 0, 0 ) ) );
				
				tank.setSpeed( Speed.MID );
				
				tank.setType( TankType.FOUR );
				
				tank.setFlag( false );
				
				enemy.add( tank );
			}
		
		return enemy;
	}
	
	// 地板
	public Map<Floor, ArrayList<Square>> getFloor() {
		
		Map<Floor, ArrayList<Square>> map = new HashMap<Floor, ArrayList<Square>>();
		
		switch(count) {
			case 1:
				
				int[][] tempFloor = {
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
						{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0, 0 },
				};
				
				apply( map, tempFloor );
				
				break;
			case 2:break;
		}
		
		return map;
		
	}
	
	private void apply( Map<Floor, ArrayList<Square>> map, int[][] arr ) {

		ArrayList<Square> s0 = new ArrayList<Square>();
		ArrayList<Square> s1 = new ArrayList<Square>();
		ArrayList<Square> s2 = new ArrayList<Square>();
		ArrayList<Square> s3 = new ArrayList<Square>();
		ArrayList<Square> s4 = new ArrayList<Square>();
		ArrayList<Square> s5 = new ArrayList<Square>();
		
		for( int i = 0; i < arr.length; i++ )
			for( int j = 0; j < arr[i].length; j++ )
				if( arr[i][j] == 0 ) {
					s0.add( new Square( Floor.ORDINARY, new Position( j+1, i +1 ) ) );
				} else if( arr[i][j] == 1 ) {
					s1.add( new Square( Floor.WALL, new Position( j+1, i +1 ) ) );
				} else if( arr[i][j] == 2 ) {
					s2.add( new Square( Floor.GRASS, new Position( j+1, i +1 ) ) );
				} else if( arr[i][j] == 3 ) {
					s3.add( new Square( Floor.WATER, new Position( j+1, i +1 ) ) );
				} else if( arr[i][j] == 4 ) {
					s4.add( new Square( Floor.ICE, new Position( j+1, i +1 ) ) );
				} else if( arr[i][j] == 5 ) {
					s5.add( new Square( Floor.HARD, new Position( j+1, i +1 ) ) );
				} 
		
		map.put( Floor.ORDINARY, s0 );
		map.put( Floor.WALL, s1 );
		map.put( Floor.GRASS, s2 );
		map.put( Floor.WATER, s3 );
		map.put( Floor.ICE, s4 );
		map.put( Floor.HARD, s5 );
	}
	
	public static void main( String[] args ) {
		DataControl t1 = new DataControl();
		t1.next();
		System.out.println( t1.getFloor() );
	}
}
