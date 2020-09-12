package question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class Q_540_9 {

	public static void main( String[] args ) throws IOException {
		
		if( args.length != 1 )
			return;
		
		ArrayList<String> fileLine = new ArrayList<String>();
		BufferedReader reader = new BufferedReader( new FileReader( args[0] ) );
		String temp;
		
		while( (temp = reader.readLine()) != null )
			fileLine.add( temp.toUpperCase() );
		
		ListIterator<String> it = fileLine.listIterator( fileLine.size()-1 );
		while( it.hasPrevious() )
			System.out.println( it.previous() );
	}
}
