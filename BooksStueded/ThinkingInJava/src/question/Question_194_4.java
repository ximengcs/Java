import java.util.Random;
interface Selector{
	boolean end();
	Object current();
	void next();
}
class Sequence{
	private Object[] items;
	private int next = 0;
	public Sequence( int size ){
		items = new Object[size];
	}
	public void add( Object x ){
		if( next < items.length )
			items[next++] = x;
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end(){
			return i == items.length;
		}
		public Object current(){
			return items[i];
		}
		public void next(){
			if( i < items.length )
				i++;
		}
		public Selector selector(){
			return new SequenceSelector();
		}
		public Sequence use(){
			return Sequence.this;
		}
	}
	public Selector createSelector(){
		return new SequenceSelector();
	}
}
class StringSelector{
	private String str;
	StringSelector( String str ){
		this.str = str;
	}
	public String toString(){
		return str + "~";
	}
}
public class Question_194_4{
	public static void main( String[] args ){
		int n = 5;
		String[] str = {
			new String( "aaa" ),
			new String( "bbb" ),
			new String( "ccc" ),
		};
		Random rand = new Random();
		Sequence sequence = new Sequence(n);
		Selector selector = sequence.createSelector();
		for( int i = 0; i < n; i++ ){
			sequence.add( new StringSelector( str[rand.nextInt(3)] ) );
		}
		while( !selector.end() ){
			System.out.println( (selector.current()).toString() );
			selector.next();
		}
	}
}