package test.image;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Move {

	private Image bg = null;
	private int currentX = 0;
	private int currentY = 0;
	
	public Move() {
		bg = new ImageIcon( "C:\\Users\\lenovo\\Desktop\\2017-02-23_130821.png" ).getImage();
	}

	public void move() {
		currentX += 2;
	}
	
	public Image getBg() {
		return bg;
	}

	public int getCurrentX() {
		return currentX;
	}

	public int getCurrentY() {
		return currentY;
	}
	
	
}
