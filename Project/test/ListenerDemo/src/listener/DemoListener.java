package listener;

import java.util.EventListener;

import event.DemoEvent;

public interface DemoListener extends EventListener {

	public void say( DemoEvent event );
}
