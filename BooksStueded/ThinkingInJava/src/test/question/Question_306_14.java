import java.util.regex.*;
import java.util.*;

public class Question_306_14{
	public static void main( String[] args ){
		String input = 
			"This!!unusual use!!of exclamation!!points";
		System.out.println( Arrays.toString( input.split( "!!" ) ) );
		System.out.println( Arrays.toString( input.split( "!!", 3 ) ) );
		/* System.out.println( Arrays.toString( Pattern.compile( "!!" ).split(input) ) );
		System.out.println( Arrays.toString( Pattern.compile( "!!" ).split(input, 3) ) ); */
	}
}