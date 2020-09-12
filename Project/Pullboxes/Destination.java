package pullboxes;

public class Destination implements Positioner {

	private Position position;
	
	public Destination( Position position ) {
		this.position = position;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition( Position position ) {
		this.position = position;
	}
}
