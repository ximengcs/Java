package snake;

import java.util.ArrayList;
import java.util.Random;

public class Food {

	private Random rand = new Random();
	private Position position = new Position( 2, 2 );
	public Position getPosition() {
		return position;
	}
	public void reset( ArrayList<Position> list, int x, int y ) {
		do {
			position.setX( rand.nextInt( x-2 ) + 1 );
			position.setY( rand.nextInt( x-2 ) + 1 );
		}
		while( list.contains( position ) );
	}
}
