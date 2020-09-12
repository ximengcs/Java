package pullboxes;

public class Person implements Positioner {

	private Position position;
	private Direction direction;
	
	public Person( Position position ) {
		this.position = position;
	}
	
	public void move() {
		if( direction == Direction.LEFT )
			position.setX( position.getX()-1 );
		else if( direction == Direction.RIGHT )
			position.setX( position.getX()+1 );
		else if( direction == Direction.UP )
			position.setY( position.getY()-1 );
		else if( direction == Direction.DOWN )
			position.setY( position.getY()+1 );
	}
	
	public void setPosition( Position position ) {
		this.position = position;
	}
	
	public void setDirection( Direction direction ) {
		this.direction = direction;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public Position getPosition() {
		return position;
	}
}
