package question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class Q_540_10 {

	public static void main( String[] args ) throws IOException {
		
		if( args.length < 1 )
			return;
		
		//收集单词
		ArrayList<String> words = new ArrayList<String>();
		for( int i = 1; i < args.length; i++ )
			words.add( args[i] );
		
		ArrayList<String> fileLine = new ArrayList<String>();
		BufferedReader reader = new BufferedReader( new FileReader( args[0] ) );
		String temp;
		
		while( (temp = reader.readLine()) != null )
			for( String str : words )
				if( temp.contains(str) ) {
					fileLine.add( temp.toUpperCase() );
					break;
				}
		
		if( fileLine.size() != 0 ) {
			ListIterator<String> it = fileLine.listIterator( fileLine.size()-1 );
			while( it.hasPrevious() )
				System.out.println( it.previous() );
		} else {
			System.out.println( "not pattern word" );
		}
		
	}
}
