package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static test.Print.print;

public class PrintTest {

	@Test
	public void testPrint() {
		print( "test" );
	}

}
