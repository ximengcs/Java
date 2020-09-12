import java.util.regex.*;
import net.mindview.util.*;

public class Question_308_15{
	public static void main( String[] args ){
		/* if( args.length < 2 )
			System.exit(0); */
		Pattern p = Pattern.compile( args[0], Pattern.CASE_INSENSITIVE|Pattern.MULTILINE );
		Matcher m = p.matcher( "" );
		int index = 0;
		for( String str : new TextFile( args[0] ) ){
			m.reset( str );
			while( m.find() )
				System.out.println( index++ + ": " + m.group() );
		}
	}
}