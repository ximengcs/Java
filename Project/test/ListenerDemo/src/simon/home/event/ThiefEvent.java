package simon.home.event;

import java.util.EventObject;

import simon.home.model.Thief;

public class ThiefEvent extends EventObject {

	private Thief thief;
	
	public ThiefEvent( Object source, Thief thief ) {
		super(source);
		this.thief = thief;
	}
	
	public Thief getThief() {
		return thief;
	}
}
