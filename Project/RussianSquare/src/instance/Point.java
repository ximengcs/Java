package instance;

import java.util.Random;

public class Point {

	int x;
	int y;
	
	public Point( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public static final Point NUL = new Point( -1, -1 );
	
	public static Point[][] randomPoint() {
		Point[][] point = new Point[3][3];
		Random rand = new Random();
		
		for( int i = 0; i < point.length; i++ )
			for( int j = 0; j < point[i].length; j++ )
				point[i][j] = new Point( -1, -1 );
		
		//  初始9坐标
		//  (3,-3) (4,-3) (5,-3)
		//  (3,-2) (4,-2) (5,-2)
		//  (3,-1) (4,-1) (5,-1)
		
		switch( rand.nextInt(10) ) {
			//
			case 0 :
				point[1][1].setPoint( 4, -2 );
				point[1][2].setPoint( 5, -2 );
				point[2][1].setPoint( 4, -1 );
				point[2][2].setPoint( 5, -1 );
				break;
			//	
			case 1:
				point[0][1].setPoint( 4, -3 );
				point[1][1].setPoint( 4, -2 );
				point[2][1].setPoint( 4, -1 );
				point[2][2].setPoint( 5, -1 );
				break;
			case 2:
				point[1][0].setPoint( 3, -2 );
				point[1][1].setPoint( 4, -2 );
				point[1][2].setPoint( 5, -2 );
				point[2][0].setPoint( 3, -1 );
				break;
			case 3:
				point[0][0].setPoint( 3, -3 );
				point[0][1].setPoint( 4, -3 );
				point[1][1].setPoint( 4, -2 );
				point[2][1].setPoint( 4, -1 );
				break;
			case 4:
				point[0][2].setPoint( 5, -3 );
				point[1][0].setPoint( 3, -2 );
				point[1][1].setPoint( 4, -2 );
				point[1][2].setPoint( 5, -2 );
				break;
			//	
			case 5:
				point[0][1].setPoint( 4, -3 );
				point[1][0].setPoint( 3, -2 );
				point[1][1].setPoint( 4, -2 );
				point[1][2].setPoint( 5, -2 );
				break;
			case 6:
				point[0][1].setPoint( 4, -3 );
				point[1][2].setPoint( 5, -2 );
				point[1][1].setPoint( 4, -2 );
				point[2][2].setPoint( 5, -1 );
				break;
			case 7:
				point[0][0].setPoint( 3, -3 );
				point[0][1].setPoint( 4, -3 );
				point[1][1].setPoint( 4, -2 );
				point[1][2].setPoint( 5, -2 );
				break;
			case 8:
				point[0][1].setPoint( 4, -3 );
				point[0][2].setPoint( 5, -3 );
				point[1][0].setPoint( 3, -2 );
				point[1][1].setPoint( 4, -2 );
				break;
			//
			case 9 :
				point[0][1].setPoint( 4, -3 );
				point[1][0].setPoint( 3, -2 );
				point[1][1].setPoint( 4, -2 );
				point[2][0].setPoint( 3, -1 );
				break;
		}
		
		return point;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setPoint( Point p ) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public void setPoint( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals( Object obj ) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
