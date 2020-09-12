package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {

	private ArrayList<String> express;
	
	public Expression() {
		initField();
	}
	
	private void initField() {
		express = new ArrayList<String>();
	}

	public double count( double x ) {
		double result = 0.0;
		
		Iterator<String> it = express.iterator();
		while( it.hasNext() ) {
			String nextString = it.next();
			String[] s = nextString.split("[\\+\\-\\*/]");
			if( nextString.matches("\\+.*") ) {
				for( String t : s )
					if( t.equals("x") )
						result += x;
					else if( !t.equals("") )
						result += Integer.parseInt(t);
			} else if( nextString.matches("\\-.*") ) {
				for( String t : s )
					if( t.equals("x") )
						result -= x;
					else if( !t.equals("") )
						result -= Integer.parseInt(t);
			} else if( nextString.matches("\\*.*") ) {
				for( String t : s )
					if( t.equals("x") )
						result *= x;
					else if( !t.equals("") )
						result *= Integer.parseInt(t);
			} 
		}
		
		return result;
	}

	public ArrayList<String> getExpress() {
		return express;
	}

	public void addExpress(String exp) {
		express.add(exp);
	}
	
	public String toString() {
		return express.toString();
	}
}
