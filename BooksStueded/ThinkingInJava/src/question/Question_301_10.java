import java.util.regex.*;

public class Question_301_10{
	public static void main( String[] args ){
		if( args.length < 2 ){
			System.exit(0);
		}else{
			for( String str : args ){
				Pattern p = Pattern.compile( str );
				Matcher m = p.matcher( args[0] );
				if( m.find() )
					System.out.println( "发现一个匹配" );
				else
					System.out.println( "没有发现匹配" );
			}
		}
	}
}