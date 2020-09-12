package data;

import state.Speed;

public class Ball {

	private Speed speed;
	
	private Position position;

	public Ball( Speed speed, Position position ) {
		this.speed = speed;
		this.position = position;
	}
	
	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed( Speed speed ) {
		this.speed = speed;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition( Position position ) {
		this.position = position;
	}
}
