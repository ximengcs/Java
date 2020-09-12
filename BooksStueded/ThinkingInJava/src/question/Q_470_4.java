package question;

import java.util.AbstractList;
import java.util.ArrayList;

import lib.net.mindview.util.TextFile;

class Q_470_4_Collection extends AbstractList{

	private ArrayList<String> words; 
	private int size;
	
	public Q_470_4_Collection() { 
		size = 10; 
		words = new TextFile( 
		"F:\\EclipseJava\\ThinkingInJava\\src\\lib\\net\\mindview\\util\\Countries.java", "\\W+" );
	}
	public Q_470_4_Collection( int size ) { 
		this.size = size; 
		words = new TextFile( 
		"F:\\EclipseJava\\ThinkingInJava\\src\\lib\\net\\mindview\\util\\Countries.java", "\\W+" );
	}

	public Object get( int arg0 ) {
		return words.get(arg0);
	}

	public int size() {
		return size;
	}
	
}

public class Q_470_4 {

	public static void main( String[] args ) {
		Q_470_4_Collection test = new Q_470_4_Collection(100);
		System.out.println( test );
	}
}
