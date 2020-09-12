package question;

import static question.lib.Signal.GREEN;
import static question.lib.Signal.RED;
import static question.lib.Signal.YELLOW;

import lib.enumerated.TrafficLight;
import question.lib.Signal;

public class Q_594_1 {

	Signal color = RED;
	public void change() {
		switch( color ) {
			case RED : color = GREEN;break;
			case GREEN : color = YELLOW;break;
			case YELLOW : color = RED;break;
		}
	}
	public String toString() {
		return "The traffic light is " + color;
	}
	public static void main( String[] args ) {
		TrafficLight t = new TrafficLight();
		for( int i = 0; i < 7; i++ ) {
			System.out.println( t );
			t.change();
		}
	}
}
