package question;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;

import lib.io.BufferedInputFile;

public class Q_543_13 {

	static String file = "F:\\EclipseJava\\ThinkingInJava\\src\\TestFiles\\BasicFileOutput.txt";
	
	public static void main( String[] args ) throws IOException {
		LineNumberReader in = new LineNumberReader(
			new StringReader( 
				BufferedInputFile.read( 
					"F:\\EclipseJava\\ThinkingInJava\\src\\question\\Q_543_13.java" ) ) );
		PrintWriter out = new PrintWriter(
				new BufferedWriter( new FileWriter(file) ) );
		int lineCount = 1;
		String s;
		while( (s = in.readLine()) != null )
			out.println( lineCount++ + " : " + s );
		out.close();
		System.out.println( BufferedInputFile.read(file) );
	}
}
