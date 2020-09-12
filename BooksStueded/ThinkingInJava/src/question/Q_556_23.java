package question;

import java.nio.CharBuffer;
import java.util.BitSet;

public class Q_556_23 {

	static BitSet isPrintable = new BitSet(127);
	static String encoding = System.getProperty( "file.encoding" );
	static {
		for( int i = 32; i < 127; i++ )
			isPrintable.set(i);
	}
	
	public static void setPrintableLimit( CharBuffer cb ) {
		cb.rewind();
		while( isPrintable.get(cb.get()) )
			;
		cb.limit( cb.position() - 1 );
		cb.rewind();
	}
	
	public static void main( String[] args ) {
		
	}
}
