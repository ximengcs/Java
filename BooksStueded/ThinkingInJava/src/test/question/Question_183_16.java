import java.util.*;
import java.nio.*;

class Chars{
	private static final char[] ch = "abfdsajkfsadklhkfadsj".toCharArray();
	private static Random rand = new Random();
	public char next(){
		return ch[ rand.nextInt(ch.length) ];
	}
}
class Adapted extends Chars implements Readable{
	private int count;
	Adapted( int count ){
		this.count = count;
	}
	public int read( CharBuffer cb ){
		if( count-- == 0 ){
			return -1;
		}
		for( int i = 0; i < 10; i++ ){
			cb.append( next() );
		}
		cb.append( " " );
		return 11;
	}
}
public class Question_183_16{
	public static void main( String[] args ){
		Scanner s = new Scanner( new Adapted(5) );
		while( s.hasNext() )
			System.out.println( s.next() + " " );
	}
}