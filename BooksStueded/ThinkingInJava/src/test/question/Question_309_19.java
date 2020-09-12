import java.util.regex.*;
import net.mindview.util.*;

public class Question_309_19{
	public static void main( String[] args ){
		if( args.length < 1 ){
			System.exit(0);
		}else{
			String regex = "class\\s\\w[\\w_]*";
			Pattern p = Pattern.compile( regex );
			Matcher m = p.matcher( "" );
			for( String str : new TextFile( args[0] ) ){
				m.reset( str );
				while( m.find() )
					System.out.println( m.group().replaceAll( "class\\s", "" ) );
			}
		}
	}
}