package simon.home.model;

import simon.home.event.ThiefEvent;
import simon.home.listener.ThiefListener;

public class Dog implements ThiefListener {

	@Override
	public void seeThief(ThiefEvent thiefEvent) {
		System.out.println("thief is coming");
		Thief thief = thiefEvent.getThief();
		System.out.println(thief.getName());
		System.out.println(thief.getSex());
		System.out.println(thief.getAge());
	}

	
}
