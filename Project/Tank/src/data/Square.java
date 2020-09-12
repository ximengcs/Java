package data;

import state.Floor;

public class Square {

	// 类型
	private Floor type;
	
	// 坐标
	private Position position;
	
	// 状态
	private int state;

	public Square( Floor type, Position position ) {
		this.type = type;
		this.position = position;
		state = 100;
	}
	
	public Floor getType() {
		return type;
	}

	public void setType( Floor type ) {
		this.type = type;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition( Position position ) {
		this.position = position;
	}

	public int getState() {
		return state;
	}

	public void setState( int state ) {
		this.state = state;
	}
	
	public String toString() {
		return "Square :" + type + " " + position + " " + state;
	}
}
