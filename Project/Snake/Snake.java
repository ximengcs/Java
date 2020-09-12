package snake;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Snake {

	private Position INITPOSITION = new Position( 2, 2 );
	private Direction INITDIRECTION = Direction.RIGHT;
	
	private static Snake snake = new Snake();
	private Head head = new Head();
	private Body body = new Body();
	
	private Snake() {
		if( head.getDirection() == Direction.RIGHT )
			body.plus( new Position( head.getPosition().getX()-1, head.getPosition().getY() ) );
	}
	
	private class Head {
		private Position position = new Position( INITPOSITION );
		private Direction direction = INITDIRECTION;
		private Position getPosition() {
			return position;
		}
		private Direction getDirection() {
			return direction;
		}
		private void setPosition( Position position ) {
			this.position = position;
		}
		private void setDirection( Direction direction ) {
			this.direction = direction;
		}
	}
	
	private class Body {
		private LinkedList<Position> nodes = new LinkedList<Position>();
		
		private void plus( Position position ) {
			nodes.add( position );
		}
		
		private void reset( LinkedList<Position> list ) {
			nodes.clear();
			nodes = list;
		}
	}
	
	private Position walk() {
		LinkedList<Position> list = new LinkedList<Position>();
		Iterator<Position> it = body.nodes.iterator();
		list.add( new Position( head.getPosition() ) );
		while( it.hasNext() ) {
			list.add( new Position( it.next() ) );
		}
		Position lost = list.removeLast();
		body.reset( list );
		
		plusOne( head.getDirection(), head.getPosition() );
		return lost;
	}
	
	private void init() {
		
	}
	
	private void plusOne( Direction direction, Position position ) {
		if( direction == Direction.RIGHT )
			position.setX( position.getX()+1 );
		else if( direction == Direction.LEFT )
			position.setX( position.getX()-1 );
		else if( direction == Direction.UP ) 
			position.setY( position.getY()-1 );
		else if( direction == Direction.DOWN )
			position.setY( position.getY()+1 );
	}
	
	public ArrayList<Position> getPosition() {
		ArrayList<Position> tmp = new ArrayList<Position>();
		tmp.add( head.getPosition() );
		tmp.addAll( body.nodes );
		return tmp;
	}
	
	public State move( Direction direction, Food food, Map map ) {
		Position tmp = new Position( head.getPosition() );
		plusOne( direction, tmp );
		head.setDirection( direction );
		if( tmp.equals( food.getPosition() ) ) {
			body.plus( walk() );
			return State.EAT;
		}
		else if( map.contains( tmp ) ) {
			init();
			return State.DEATH;
		}
		else {
			walk();
			return State.NOTHING;
		}
	}
	
	public static Snake newInstance() {
		return snake;
	}
	
}
