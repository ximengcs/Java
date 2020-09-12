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
	}
	private class ReverseSelector implements Selector{
		private int i = items.length-1;
		public boolean end(){
			return i < 0;
		}
		public Object current(){
			return items[i];
		}
		public void next(){
			if( i >= 0 )
				i--;
		}
	}
	public Selector reverseSelector(){
		return new ReverseSelector();
	}
	public Selector selector(){
		return new SequenceSelector();
	}
}
public class Question_205_22{
	public static void main( String[] args ){
		Sequence sequence = new Sequence(10);
		for( int i = 0; i < 10; i++ )
			sequence.add( Integer.toString(i) );
		
		//正序遍历
		Selector selector = sequence.selector();
		while( !selector.end() ){
			System.out.print( selector.current() + " " );
			selector.next();
		}
		System.out.println();
		
		//反序遍历
		Selector selectorReverse = sequence.reverseSelector();
		while( !selectorReverse.end() ){
			System.out.print( selectorReverse.current() + " " );
			selectorReverse.next();
		}
	}
}
