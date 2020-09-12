import java.util.*;

public class Env{
	public static void main( String[] args ){
		for( Map.Entry entry : System.getenv().entrySet() ){
			System.out.println( entry.getKey() + ": " + entry.getValue() );
		}
	}
}