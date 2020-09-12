import java.util.regex.*;
import java.util.*;

public class Question_303_12{
	static public final String POEM =
		"Twas brillig, and the slithy toves\n" +
		"Did gyre and gimble in the wabe.\n" +
		"All mimsy were the borogoves,\n" +
		"And the mome raths outgrabe.\n\n" +
		"Beware the Jabberwock, my son,\n" +
		"The jaws that bite, the claws that catch.\n" +
		"Beware the Jubjub bird, and shun\n" +
		"The frumious Bandersnatch.";
	public static void main( String[] args ){
		Matcher m = Pattern.compile( "\\b(?![A-Z])\\w+\\b" ).matcher( POEM );
		Set<String> list = new HashSet<String>();
		while( m.find() ){
			list.add(m.group());
			System.out.println( "[" + m.group() + "]" );
		}
		System.out.println( list.size() );
	}
}