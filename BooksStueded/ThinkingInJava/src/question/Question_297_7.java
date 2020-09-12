public class Question_297_7{
	public static void matches( String str ){
		System.out.println( str.matches( "(\\p{javaUpperCase}.)*\\." ) );
	}
	public static void main( String[] args ){
		matches( "I A SA." );
	}
}