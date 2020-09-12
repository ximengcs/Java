import java.util.logging.*;
import java.io.*;

class MyExceptionOne extends Exception{
	private static Logger logger = Logger.getLogger( "one" );
	public MyExceptionOne(){
		StringWriter trace = new StringWriter();
		printStackTrace( new PrintWriter(trace) );
		logger.severe(trace.toString());
	}
}
class MyExceptionTwo extends Exception{
	private static Logger logger = Logger.getLogger( "two" );
	public MyExceptionTwo(){
		StringWriter trace = new StringWriter();
		printStackTrace( new PrintWriter(trace) );
		logger.severe( trace.toString() );
	}
}

public class Question_255_6{
	public static void main( String[] args ){
		try{
			throw new MyExceptionOne();
		}catch( MyExceptionOne exception ){
			System.out.println( exception );
		}
		try{
			throw new MyExceptionTwo();
		}catch( MyExceptionTwo exception ){
			System.out.println( exception );
		} 
	}
}