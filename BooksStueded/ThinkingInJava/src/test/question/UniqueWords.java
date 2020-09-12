import java.util.*;
import net.mindview.util.*;

public class Question_233_16{
	public static void main( String[] args ){
		Set<String> words = new TreeSet<String>( new TextFile( "SetOperations.java", "\\W+" ) );
		System.out.println( words );
	}
}