package test.image;

import test.Pan;

public class MoveDriver {

	private Move move;
	private Pan pan;
	
	public MoveDriver( Pan pan, Move move ) {
		this.pan = pan;
		this.move = move;
	}
	
	public void run() {
		while( move.getCurrentX() < move.getBg().getWidth(null) ) {
			move.move();
			pan.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
