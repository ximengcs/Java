import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class Sequence{
	private List<Object> items;
	private int next = 0;
	public Sequence( int size ){
		items = new ArrayList<Object>();
	}
	public void add( Object x ){
		items.add(x);
	}

	public List<Object> selector(){
		return items;
	}
}

public class Question_227_9{
	public static void main( String[] args ){
		Sequence sequence = new Sequence(10);
		for( int i = 0; i < 10; i++ )
			sequence.add( Integer.toString(i) );
		Iterator<Object> selector = sequence.selector().iterator();
		while( selector.hasNext() ){
			System.out.print( selector.next() + " " );
		}
	}
}