import java.util.*;

interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Question_220_3{
	private List<Object> items;
	public Question_220_3(){
		items = new ArrayList<Object>();
	}
	public void add( Object x ){
		items.add(x);
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end(){
			return i == items.size();
		}
		public Object current(){
			return items.get(i);
		}
		public void next(){
			i++;
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main( String[] args ){
		Question_220_3 sequence = new Question_220_3();
		for( int i = 0; i < 10; i++ )
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while( !selector.end() ){
			System.out.print( selector.current() + " " );
			selector.next();
		}
	}
}