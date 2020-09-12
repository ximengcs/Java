package pullboxes;

public class Box implements Positioner {

	private Position position;
	
	public Box( Position position ) {
		this.position = position;
	}
	
	public void move( Direction direction ) {
		if( direction == Direction.LEFT )
			position.setX( position.getX()-1 );
		else if( direction == Direction.RIGHT )
			position.setX( position.getX()+1 );
		else if( direction == Direction.UP )
			position.setY( position.getY()-1 );
		else if( direction == Direction.DOWN )
			position.setY( position.getY()+1 );
	}
	
	public Position getPosition() {
		return position;
	}
	
	public String toString() {
		return position.toString();
	}
}
