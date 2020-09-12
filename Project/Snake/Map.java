package snake;

public class Map {

	private int x;
	private int y;
	private Wall wall;
	
	public Map( int x, int y ) {
		this.x = x;
		this.y = y;
		wall = new Wall( x, y );
	}
	public int getWidth() {
		return x;
	}
	public int getHeight() {
		return y;
	}
	public boolean contains( Position tmp ) {
		return wall.wallPositionList().contains( tmp );
	}
	public Wall getWall() {
		return wall;
	}
}
