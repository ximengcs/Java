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
					System.out.println( "����һ��ƥ��" );
				else
					System.out.println( "û�з���ƥ��" );
			}
		}
	}
}