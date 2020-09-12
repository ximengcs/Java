import java.util.logging.*;
import java.io.*;

public class Question_256_7{
	public static void main( String[] args ){
		Logger logger = Logger.getLogger( "Question_256_7" );
		String[] strs = new String[10];
		try{
			System.out.println( strs[-1] );
		}catch( ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException ){
			StringWriter trace = new StringWriter();
			arrayIndexOutOfBoundsException.printStackTrace( new PrintWriter(trace) );
			System.out.println("||");
			logger.severe( trace.toString() );
			System.out.println("||");
		}
	}
}