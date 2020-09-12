import java.io.*;
import java.util.*;

public class Question_291_3{
	private String name;
	private Formatter f;
	public Question_291_3( String name, Formatter f ){
		this.name = name;
		this.f = f;
	}
	public void move( int x, int y ){
		f.format( "%s the turtle is at (%d, %d)\n", name, x, y );
	}
	public static void main( String[] args ){
		PrintStream outAlias = System.err;
		Question_291_3 tommy = new Question_291_3( "Tommy", new Formatter( System.err ) );
		Question_291_3 terry = new Question_291_3( "Terry", new Formatter( outAlias ) );
		tommy.move( 0, 0 );
		terry.move( 4, 8 );
		tommy.move( 3, 4 );
		terry.move( 2, 5 );
		tommy.move( 3, 3 );
		terry.move( 3, 3 );
	}
}