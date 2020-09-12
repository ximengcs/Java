package simon.home.listener;

import java.util.EventListener;

import simon.home.event.ThiefEvent;

public interface ThiefListener extends EventListener {

	public void seeThief( ThiefEvent thiefEvent );
}
