public class Question_105_19{
	public static void main( String[] args ){
		testString( "sf", "sdfsdf", "fds" );
	}
	public static void testString( String... str ){
		for( String s : str )
			System.out.println( s );
		System.out.println( str.length );
	}
}