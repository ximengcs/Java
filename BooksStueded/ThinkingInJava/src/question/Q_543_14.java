package question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Q_543_14 {

	static String inFile = "F:\\EclipseJava\\ThinkingInJava\\src\\question\\Q_543_12.java";
	static String outFile = "F:\\EclipseJava\\ThinkingInJava\\src\\testfiles\\Question.txt";
	
	public static long test( Reader in, Writer out ) throws IOException {
		long time;
		long currentTime;
		int ch;
		currentTime = System.nanoTime();
		while( (ch = in.read()) != -1 ) {
			out.write( (char)ch );
		}
		time = System.nanoTime()-currentTime;
		
		return time;
	}
	
	public static void main( String[] args ) throws IOException {
		BufferedReader in = new BufferedReader(
				new FileReader( inFile ) );
		PrintWriter out = new PrintWriter(
				new FileWriter( outFile ) );
		
		FileReader nin = new FileReader( inFile );
		FileWriter nout = new FileWriter( outFile );
		
		System.out.println( "buffer : " + test( in, out ) );
		System.out.println( "not buffer : " + test( nin, nout ) );
		
		// !!
		out.close();
		nout.close();
	}
}
