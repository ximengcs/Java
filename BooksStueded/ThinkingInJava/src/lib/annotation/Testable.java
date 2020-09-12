package lib.annotation;

import lib.net.mindview.atunit.Test;

public class Testable {

	public void execute() {
		System.out.println( "Execute" );
	}
	
	@Test
	void testExecute() {
		execute();
	}
}
