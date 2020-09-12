package question;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

class SortedDirList {
	
	private File file;
	
	SortedDirList( File fiel ) { this.file = file; }
	SortedDirList() { file = new File( "." ); }
	
	public String[] list() {
		String[] result = file.list();
		Arrays.sort( result, String.CASE_INSENSITIVE_ORDER );
		return result;
	}
	
	public String[] list( String regex ) {
		String[] result = file.list( new FilenameFilter() {
			Pattern pattern = Pattern.compile( regex );
			public boolean accept( File dir, String str ) {
				return pattern.matcher( str ).matches();
			}
		} );
		return result;
	}
}

public class Q_528_2 {

	public static void main( String[] args ) {
		
	}
}
