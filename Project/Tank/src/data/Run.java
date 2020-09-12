package data;

import java.util.ArrayList;
import java.util.Map;

import state.Direction;
import state.Floor;

public class Run {

	private Data data;
	
	private DataControl ctrl;
	
	public Run() {
		data = Data.getData();
		ctrl = new DataControl();
	}
	
	public void run() {
		
		if(ctrl.hasNext()) {
			ctrl.next();
			data.load( ctrl.getFriend(), ctrl.getEnemy(), ctrl.getFloor() );
			while( ! (data.getEnemy().isEmpty()) ) {
				
			}
		}
	}
	
	public Position move( Direction d ) {
		Position position = new Position( data.getFriend().getPosition().getX(), data.getFriend().getPosition().getY() );
		
		Tank tan = new Tank( data.getFriend() );
		tan.move(d);
		
		for( Tank tmp : data.getEnemy() ) {
			if( tmp.getPosition().equals( tan.getPosition() ) )
				return position;
		}
		
		for( Map.Entry<Floor, ArrayList<Square>> tmps : data.getFloor().entrySet() ) {
			if( tmps.getKey() == Floor.ORDINARY || tmps.getKey() == Floor.GRASS ) {
				continue;
			} else {
				for( Square tmp : tmps.getValue() ) {
					if( tmp.getPosition().equals( tan.getPosition() ) )
							return position;
				}
			}
		}
		
		if( tan.getPosition().getX() < 1 || tan.getPosition().getX() > 15 || 
				tan.getPosition().getY() < 1 || tan.getPosition().getY() > 15 )
			return position;
		data.getFriend().move( d );
		return position;
		
	}
}
