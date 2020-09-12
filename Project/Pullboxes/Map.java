package pullboxes;

import java.util.HashSet;
import java.util.Iterator;

public class Map {

	private Person person;
	private HashSet<Box> box;
	private HashSet<Wall> wall;
	private HashSet<Destination> destination;
	private Data data = new Data();
	private HashSet<Floor> floor;
	
	public Map() {
		init();
	}
	
	public void setPersonDirection( Direction direction ) {
		person.setDirection( direction );
	}
	
	public HashSet<Box> getBox() {
		return box;
	}
	public HashSet<Wall> getWall() {
		return wall;
	}
	public HashSet<Destination> getDestination() {
		return destination;
	}
	public Person getPerson() {
		return person;
	}
	public HashSet<Floor> getFloor() {
		return floor;
	}
	
	public int current() {
		return data.getCount();
	}
	
	public boolean hasNext() {
		if( data.getCount() < data.getMax() )
			return true;
		else return false;
	}
	
	public boolean hasPrevious() {
		if( data.getCount()-1 > 0 )
			return true;
		else return false;
	}
	
	public boolean previous() {
		data.readPrevious();
		return read();
	}
	
	public boolean next() {
		data.readNext();
		return read();
	}
	
	private boolean read() {
		if( !data.next() )
			return false;
		person.setPosition( data.nextPerson().getPosition() );
		box = data.nextBox();
		wall = data.nextWall();
		destination = data.nextDestination();
		floor = data.nextFloor();
		return true;
	}
	
	public void init() {
		data.reset();
		data.next();
		person = new Person( data.nextPerson().getPosition() );
		box = data.nextBox();
		wall = data.nextWall();
		destination = data.nextDestination();
		floor = data.nextFloor();
	}
	
	private static boolean containsPosition( HashSet<? extends Positioner> set, Position position ) {
		Iterator<? extends Positioner> it = set.iterator();
		while( it.hasNext() ) {
			Position tmp = it.next().getPosition();
			if( tmp.equals( position ) )
				return true;
		}
		
		return false;
	}
	
	public boolean checkGame() {
		Iterator<Box> it;
		Iterator<Destination> it2 = destination.iterator();
		int count = 0;
		
		while( it2.hasNext() ) {
			it = box.iterator();
			Position d = it2.next().getPosition();
			while( it.hasNext() )
				if( d.equals(it.next().getPosition()) )
					count++;
		}
		if( count == data.BoxNumber() )
			return true;
		else
			return false;
	}
	
	public void run() {
		Position tmp = new Position( person.getPosition() );
		apply( tmp, person.getDirection() );
		if( containsPosition( wall, tmp ) )
			return;
		else if( containsPosition( box, tmp ) ) {
			Position tmp2 = new Position( tmp );
			apply( tmp2, person.getDirection() );
			if( containsPosition( wall, tmp2 ) )
				return;
			else if( containsPosition( box, tmp2 ) )
				return;
			else {
				person.move();
				Iterator<Box> it = box.iterator();
				while( it.hasNext() ) {
					Box b = it.next();
					if( b.getPosition().equals( tmp ) )
						b.move( person.getDirection() );
				}
			}
		} else {
			person.move();
		}
	}
	
	private Position apply( Position position, Direction direction ) {
		if( direction == Direction.LEFT ) {
			position.setX( position.getX()-1 );
		} else if( direction == Direction.RIGHT ) {
			position.setX( position.getX()+1 );
		} else if( direction == Direction.UP ) {
			position.setY( position.getY()-1 );
		} else if( direction == Direction.DOWN ) {
			position.setY( position.getY()+1 );
		}
		return position;
	}
}
