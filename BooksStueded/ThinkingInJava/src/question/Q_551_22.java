package question;

import java.util.List;

import lib.io.OSExecuteDemo;
import lib.net.mindview.util.OSExecute;
import lib.net.mindview.util.OSExecuteException;

public class Q_551_22 {

	public static void main( String[] args ) throws OSExecuteException {
		List<String> list = OSExecute.myCommand( OSExecuteDemo.cmd );
		for( String info : list ) 
			System.out.print( info );
	}
}
