package snake;

import java.util.ArrayList;

public class Wall {

	private ArrayList<Position> wall = new ArrayList<Position>();
	public Wall( int x, int y ) {
		for( int i = 0; i < x; i++ )
			wall.add( new Position( 0, i ) );
		for( int i = 0; i < x; i++ )
			wall.add( new Position( y-1, i ) );
		for( int i = 1; i < y-1; i++ )
			wall.add( new Position( i, 0 ) );
		for( int i = 1; i < y-1; i++ )
			wall.add( new Position( i, x-1 ) );
	}
	public ArrayList<Position> wallPositionList() {
		return wall;
	}
}
