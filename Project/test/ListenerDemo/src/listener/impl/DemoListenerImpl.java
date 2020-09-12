package listener.impl;

import event.DemoEvent;
import listener.DemoListener;

public class DemoListenerImpl implements DemoListener {

	@Override
	public void say(DemoEvent event) {
		System.out.println("change code");
	}

}
