package installer;

import listener.impl.DemoListenerImpl;
import source.DemoSource;

public class Main {

	public static void main(String[] args) {
		DemoSource demoSource = new DemoSource();
		DemoListenerImpl impl = new DemoListenerImpl();
		
		demoSource.addListener(impl);
		
		demoSource.setCode(0000);
	}
}
