package question;

import java.io.File;
import java.util.Iterator;

import lib.net.mindview.util.Directory;

public class Q_532_4 {

	public static void main( String[] args ) {
		Directory.TreeInfo directory = Directory.walk( new File(".") );
		Iterator<File> it = directory.dirs.iterator();
		long length = 0;
		
		while( it.hasNext() )
			length += it.next().length();
		
		System.out.println( length + " byte" );
	}
}
