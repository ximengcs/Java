package pullboxes;

public class Floor implements Positioner {

	private Position position;
	
	public Floor( Position position ) {
		this.position = position;
	}
	
	public Position getPosition() {
		return position;
	}
}
