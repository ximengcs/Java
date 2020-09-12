package question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Q_547_18_TextFile extends ArrayList<String> {
	
	public static String read( String fileName ) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader( new FileReader(
					new File( fileName ).getAbsoluteFile() ) );	
		String s;
		while( (s = in.readLine()) != null ) {
			sb.append(s);
			sb.append("\n");
		}	
		in.close();

		return sb.toString();
	}
	
	public static void write( String fileName, String text ) throws FileNotFoundException {
	
		PrintWriter out = new PrintWriter( new File(fileName).getAbsoluteFile() );
			
		out.print( text );
		
		out.close();

	}
	
	public Q_547_18_TextFile( String fileName, String splitter ) throws IOException {
		super( Arrays.asList( read(fileName ).split( splitter ) ) );
		if( get(0).equals( "" ) )
			remove(0);
	}
	
	public Q_547_18_TextFile( String fileName ) throws IOException {
		this( fileName, "\n" );
	}
	
	public void write( String fileName ) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter(
				new File( fileName ).getAbsoluteFile() );
	
		for( String item : this )
			out.println( item );

		out.close();

	}
	
	
	public static void main( String[] args ) throws IOException {
		String fileName = "F:\\EclipseJava\\ThinkingInJava\\src\\TestFiles\\BasicFileOutput.txt";
		String out = "F:\\EclipseJava\\ThinkingInJava\\src\\TestFiles\\TestFile.txt";
		
		String file = read( fileName );
		write( out, file );
		Q_547_18_TextFile text = new Q_547_18_TextFile( out );
		text.write( out );
		TreeSet<String> words = new TreeSet<String>(
				new Q_547_18_TextFile( fileName, "\\W+" ) );
		System.out.println( words.headSet( "a" ) );
	}
}