package simon.home.model;

import simon.home.event.ThiefEvent;

public class Home {

	private int money;
	
	private Dog dog;
	
	public Home() {
		init();
	}
	
	private void init() {
		this.money = 100;
	}
	
	public void addDog( Dog dog ) {
		this.dog = dog;
	}
	
	public void intoThief( Thief thief ) {
		thief.addmoney(money);
		dog.seeThief(new ThiefEvent(this,thief));
	}
}
