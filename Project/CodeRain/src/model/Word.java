package model;

import java.awt.Color;
import java.util.Random;

public class Word {

	private String string;
	private Point point;
	private int speed;
	private Color color;

	public Color getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public String getString() {
		string = "";
		return string;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Word(String string, Point point) {
		super();
		this.string = string;
		this.point = point;
	}

	public Word(Point point) {
		this.point = point;
	}

	public Word() {
	}

	public String toString() {
		return "x:" + point.getX() + " y:" + point.getY() + " " + string;
	}

	/**
	 * 下一个变化
	 */
	public void next(int height) {
		if (point.getY() < height) {
			point.setY(point.getY() + speed);
		} else {
			point.setY(0);
			Random rand = new Random();
			createSpeed(rand);
			setColor(rand.nextInt(10));
			randomString(rand);
			//createString(rand);
		}
	}
	
	@SuppressWarnings("unused")
	private void createString( Random rand ) {
		switch(rand.nextInt(10)) {
		case 0:string = "";break;
		case 1:string = "";break;
		case 2:string = "";break;
		case 3:string = "";break;
		case 4:string = "";break;
		case 5:string = "";break;
		case 6:string = "";break;
		case 7:string = "";break;
		case 8:string = "";break;
		case 9:string = "";break;
		case 10:string = "";break;
		case 11:string = "";break;
		case 12:string = "";break;
		case 13:string = "";break;
		case 14:string = "";break;
		case 15:string = "";break;
		case 16:string = "";break;
		case 17:string = "";break;
		case 18:string = "";break;
		case 19:string = "";break;
		}
	}
	
	private void randomString( Random rand ) {
		StringBuilder result = new StringBuilder();
		int len = rand.nextInt(15) + 1;
		char temp = 0;
		while (len > 0) {
			result.append((char) (temp + rand.nextInt(65535)) + "\n");
			len--;
		}
		string = result.toString();
	}
	
	private void createSpeed(Random rand) {
		speed = rand.nextInt(10) + 1;
	}

	private void setColor(int i) {
		switch (i) {
		case 0:
			color = Color.BLUE;
			break;
		case 1:
			color = Color.CYAN;
			break;
		case 2:
			color = Color.gray;
			break;
		case 3:
			color = Color.YELLOW; // green
			break;
		case 4:
			color = Color.orange;
			break;
		case 5:
			color = Color.PINK;
			break;
		case 6:
			color = Color.RED;
			break;
		case 7:
			color = Color.WHITE;
			break;
		case 8:
			color = Color.YELLOW;
			break;
		case 9:
			color = Color.lightGray;
			break;
		}
	}
}
