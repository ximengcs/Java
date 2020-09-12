package question;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import lib.net.mindview.util.TextFile;

public class Q_528_1 {

	public static void main( String[] args ) {
		File path = new File( "." );
		String[] list;
		if( args.length == 0 )
			list = path.list();
		else
			list = path.list( new FilenameFilter() {
				private String ext = args[0].toLowerCase();
				
				public boolean accept( File dir, String str ) {
					if( str.toLowerCase().endsWith(ext) ) {
						if( args.length == 1 )
							return true;
						
						Set<String> word = new HashSet<String>(
								new TextFile( new File( dir, str ).getAbsolutePath(), "\\W+" ) );
						for( int i = 1; i < args.length; i++ )
							if( word.contains(args[i]) )
								return true;
					}
					return false;
				}
			} );
		Arrays.sort( list, String.CASE_INSENSITIVE_ORDER );
		for( String dirItem : list )
			System.out.println( dirItem );
	}
}
