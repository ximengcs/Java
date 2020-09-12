import java.util.regex.*;
import net.mindview.util.*;
import java.io.*;

public class Question_308_16{
	public static void main( String[] args ){
		if( args.length < 2 )
			System.exit(0);
		File[] files = null;
		File file = new File(args[0]);
		if( file.isDirectory() )
			files = new File( "." ).listFiles();
		else
			files = new File[]{
				new File( args[0] ),
			};
		Pattern p = Pattern.compile(args[1]);
		Matcher m = p.matcher( "" );
		int index = 0;
		for( File f : files ){
			for( String str : new TextFile( f.getAbsolutePath() ) ){
				m.reset(str);
				while( m.find() )
					System.out.println( index++ + ": " + m.group() + ": " + m.start() );
			}
		}
	}/*测试使用 kdshakjh*/
	//dsfsfsdsdfssadffsd
}