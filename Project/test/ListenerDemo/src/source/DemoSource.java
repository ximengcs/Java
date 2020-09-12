package source;

import event.DemoEvent;
import listener.DemoListener;

public class DemoSource {

	DemoListener demoListener;
	
	private int code;
	
	public void addListener( DemoListener listener ) {
		this.demoListener = listener;
	}
	
	public void setCode( int code ) {
		this.code = code;
		notifyListener();
	}
	
	private void notifyListener() {
		demoListener.say(new DemoEvent(this));
	}
}
