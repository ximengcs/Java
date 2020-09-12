package question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q_540_7 {

	static String fileName = "F:\\EclipseJava\\ThinkingInJava\\src\\TestFiles\\TestFile.txt";
	
	public static void main( String[] args ) throws IOException {
		LinkedList<String> fileLine = new LinkedList<String>();
		BufferedReader reader = new BufferedReader( new FileReader( fileName ) );
		String temp;
		
		while( (temp = reader.readLine()) != null )
			fileLine.add( temp );
		
		ListIterator<String> it = fileLine.listIterator( fileLine.size()-1 );
		while( it.hasPrevious() )
			System.out.println( it.previous() );
	}
}
