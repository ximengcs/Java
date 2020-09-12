package pullboxes;

public class Wall implements Positioner {

	private Position position;
	
	public Wall( Position position ) {
		this.position = position;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public String toString() {
		return position.toString();
	}
}
