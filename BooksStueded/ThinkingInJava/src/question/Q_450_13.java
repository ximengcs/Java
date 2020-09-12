package question;

import lib.net.mindview.util.CountingGenerator;

public class Q_450_13 {

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		CountingGenerator.Character ch = new CountingGenerator.Character();
		for( int i = 0; i < 10; i++ )
			string.append( ch.next() );
		
		System.out.println( string );
	}
}
