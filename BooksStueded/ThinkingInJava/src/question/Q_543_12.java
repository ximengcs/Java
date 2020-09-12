package question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q_543_12 {

	static String fileName = "F:\\EclipseJava\\ThinkingInJava\\src\\question\\Q_543_12.java";
	static String outFile = "F:\\EclipseJava\\ThinkingInJava\\src\\testfiles\\Question.txt";
	
	public static void main( String[] args ) throws IOException {

		LinkedList<String> fileLine = new LinkedList<String>();
		BufferedReader in = new BufferedReader( new FileReader( fileName ) );
		PrintWriter out = new PrintWriter(
				new BufferedWriter( new FileWriter( outFile ) ) );
		
		String temp;
		int lineCount = 1;
		
		while( (temp = in.readLine()) != null )
			fileLine.add( temp );
		
		ListIterator<String> it = fileLine.listIterator( fileLine.size()-1 );
		while( it.hasPrevious() )
			out.println( lineCount++ + " :" + it.previous() );

		// !!!!!关闭流
		out.close();
	}
}
