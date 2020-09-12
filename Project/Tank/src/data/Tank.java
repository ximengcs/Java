package data;

import state.Direction;
import state.Speed;
import state.TankType;

public class Tank {

	// 速度
	private Speed speed;
	
	// 子弹
	private Ball ball;
	
	// 友or敌
	private boolean flag;
	
	// 第几种
	private TankType type;
	
	// 坐标
	private Position position;
	
	public Tank() {}
	
	public Tank( Tank tank ) {
		this.speed = tank.speed;
		this.ball = tank.ball;
		this.flag = tank.flag;
		this.type = tank.type;
		this.position = new Position( tank.getPosition().getX(), tank.getPosition().getY() );
	}
	
	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed( Speed speed ) {
		this.speed = speed;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall( Ball ball ) {
		this.ball = ball;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag( boolean flag ) {
		this.flag = flag;
	}

	public TankType getType() {
		return type;
	}

	public void setType( TankType type ) {
		this.type = type;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition( Position position ) {
		this.position = position;
	}
	
	public void move( Direction d ) {
		if( d == Direction.LEFT ) {
			position.setX( position.getX()-1 );
		} else if( d == Direction.RIGHT ) {
			position.setX( position.getX()+1 );
		} else if( d == Direction.UP ) {
			position.setY( position.getY()-1 );
		} else if( d == Direction.DOWN ) {
			position.setY( position.getY()+1 );
		} 
	}
}
