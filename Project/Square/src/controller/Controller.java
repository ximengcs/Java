package controller;

import model.Container;
import view.GamePanel;

public class Controller {

	private Container container;
	
	private GamePanel gamePanel;
	
	public void setContainer( Container container ) {
		this.container = container;
	}
	
	public void setGamePanel( GamePanel gamePanel ) {
		this.gamePanel = gamePanel;
	}
}
